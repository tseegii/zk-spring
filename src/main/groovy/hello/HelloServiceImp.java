package hello;

import javax.jws.WebService;

@WebService(endpointInterface="hello.HelloService")
public class HelloServiceImp implements HelloService {

	@Override
	public String hello(final String name) {
		String finalName = (name != null) ? name : "<unknown>";
		return String.format("Hello %s!", finalName);
	}
	

}
