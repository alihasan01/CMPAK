package com.employee.ws;

import javax.jws.WebMethod;

public class Hello {
	
	private String message = new String("Hello, ");

    public void Hello() {}

    @WebMethod
    public String sayHello(String name) {
        return message + name + ".";
    }

}
