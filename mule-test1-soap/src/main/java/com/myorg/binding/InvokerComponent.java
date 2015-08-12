package com.myorg.binding;

public class InvokerComponent {

	private HelloInterface hello;

    public String invoke(String s)
    {
        return "Received: " + hello.sayHello(s, "English");
    }
    public void setHello(HelloInterface hello)
    {
        this.hello = hello;
    }
    public HelloInterface getHello()
    {
        return hello;
    }	
}
