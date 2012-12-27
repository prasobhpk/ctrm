
package org.ctrm.server;

import javax.jws.WebService;

@WebService(endpointInterface = "org.ctrm.server.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

