package com.myorg.ws;

import java.util.List;
import javax.jws.WebService;

/**
* Interface for creating JAX-WS Service with CXF in Mule
*/
@WebService
public interface CXFWebservice {
	 
	String sayHello( String strUser );
	 
	String serviceOperation ( List<String> list );
}
