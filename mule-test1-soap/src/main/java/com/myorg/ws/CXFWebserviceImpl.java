package com.myorg.ws;

import java.util.List;
import javax.jws.WebService;

@WebService( endpointInterface = "com.myorg.ws.CXFWebservice", serviceName="CXFWebservice")
public class CXFWebserviceImpl implements CXFWebservice {

	@Override
	public String sayHello(String strUser)
	{
		return "Welcome to Mule!!! 'sayHello user ' " + strUser;
	}
	@Override
	public String serviceOperation(List<String> list) {
		return "Welcome to Mule!!! 'serviceOperation user ' ";
		//return null;
	}	
}
