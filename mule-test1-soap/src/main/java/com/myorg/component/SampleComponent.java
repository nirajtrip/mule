package com.myorg.component;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleComponent {
 
	public static final Logger LOGGER = LoggerFactory.getLogger(SampleComponent.class);
	
    public SampleComponent() {
    }
 
    public void echo() {
		LOGGER.info("Invoked echo() method.");
    }
 
    public void echoInput(String input) {
		LOGGER.info("Invoked echoInput() method with input=" + input);
    }
 
    public void echoMap(Map<String, Object> map) {
		LOGGER.info("Invoked echoMap() method with value=" + map.toString());
    }
 
}
