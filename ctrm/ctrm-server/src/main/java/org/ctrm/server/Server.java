package org.ctrm.server;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.hazelcast.config.MapConfig;
import com.hazelcast.core.HazelcastInstance;

@Service
public class Server {
	
	private static final Logger logger = LoggerFactory.getLogger(Server.class);
	
	@Autowired
	HazelcastInstance hazelcastInstance;

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-ctrm-server.xml");
		Server server = applicationContext.getBean(Server.class);
		server.start();
	}
	
	public void start(){
		if (!hazelcastInstance.getLifecycleService().isRunning()){
			hazelcastInstance.getLifecycleService().restart();
		}
		if (hazelcastInstance.getCluster().getMembers().size() < 2){
			initializeMaps();
		}
		logger.info("Complete");
	}
	
	public void stop(){
		hazelcastInstance.getLifecycleService().shutdown();
	}
	
	private void initializeMaps(){
		Map<String, MapConfig> mapConfigs = hazelcastInstance.getConfig().getMapConfigs();
		logger.debug("Start Initialize MapConfigs size: {}", mapConfigs.size());
		for (MapConfig mapConfig : mapConfigs.values()) {
			hazelcastInstance.getMap(mapConfig.getName());
			logger.debug("MapConfig: {}", mapConfig.getName());
		}
		logger.debug("End Initialize MapConfigs size: {}", mapConfigs.size());
	}

}
