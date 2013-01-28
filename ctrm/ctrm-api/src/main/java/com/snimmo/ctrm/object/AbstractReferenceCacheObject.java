package com.snimmo.ctrm.object;

import java.io.Serializable;

public abstract class AbstractReferenceCacheObject implements Serializable {
	
	private String id;
	private String description;
	
	public AbstractReferenceCacheObject(String id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}

}
