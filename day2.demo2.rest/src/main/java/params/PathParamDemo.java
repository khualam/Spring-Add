package params;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/pp")
public class PathParamDemo {

	@RequestMapping(value="/hello/{nm}")
	@ResponseBody
	public String sayHello(@PathVariable(value="nm")String name)
	{
		System.out.println("sayHello invoked with " + name);
		return "Hello, " + name;  
	}
	@RequestMapping(value="/add/{n1}/{n2}")
	@ResponseBody
	public String add(
			@PathVariable(value="n1")int no1, 
			@PathVariable(value="n2")int no2)
	{
		System.out.println("add invoked with " + no1 +", " + no2);
		return "Sum = " + (no1+no2);
	}
	
}
