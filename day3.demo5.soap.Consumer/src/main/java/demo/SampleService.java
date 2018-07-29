package demo;

import javax.jws.WebService;

@WebService
public interface SampleService {
	public String hello(String name);
}
