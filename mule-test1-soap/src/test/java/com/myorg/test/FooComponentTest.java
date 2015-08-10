package com.myorg.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mule.api.MuleMessage;

import org.mule.api.client.MuleClient;

import org.mule.tck.junit4.FunctionalTestCase;

public class FooComponentTest extends FunctionalTestCase {

	
	@BeforeClass
	public static void setupEnv() {
		System.setProperty("env", "test");
	}

	@Override
	protected String getConfigResources() {
		return "mule-component2-config.xml";
	}
	
	@Test
	public void testErpComponent() throws Exception {
	
		final MuleClient myClient = muleContext.getClient();		
		final MuleMessage aReply = myClient.send("vm://test.Path", new Integer(1), null, RECEIVE_TIMEOUT);
	    
	
		assertNotNull (aReply);
		assertNotNull (aReply.getPayload());
		assertTrue (aReply.getPayload() instanceof String);
		assertEquals ("fooBar", (String) aReply.getPayload());
	
	}
}
