package hello;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloService {

	@WebMethod
	String hello(@WebParam(name="name") String name);

}
