package com.myorg.component;

public class FooComponent {

	public FooComponent() {
    }

    public String niraj(final String request) {
        return "Request processed by niraj(String) " + request;
    }
    public String niraj1(final String request) {
        return "Request processed by niraj1(String) ";
    }
    public String fooBar1(final String request) {
        return "Request processed by fooBar1(String) " + request;
    }
    public String fooBar(final String request) {
        return "Request processed by fooBar(String) " + request;
    }
	
    public String fooBar(final Object anObject) {
        return "Request processed by Method fooBar(object)";
    }
}
