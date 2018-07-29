package demo;

import javax.jws.WebService;

@WebService()
public class SampleService {

	public String hello(String name)
	{
		System.out.println("hello invoked with ..." + name);
		return "hello, " + name;
	}
}
