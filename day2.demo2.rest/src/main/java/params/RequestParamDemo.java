package params;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/rp")
public class RequestParamDemo {

	@RequestMapping(value="/hello")
	@ResponseBody
	public String sayHello(@RequestParam(value="nm")String name)
	{
		System.out.println("sayHello invoked with " + name);
		return "Hello, " + name;  
	}
	@RequestMapping(value="/add")
	@ResponseBody
	public String add(
			@RequestParam(value="n1")int no1, 
			@RequestParam(value="n2")int no2)
	{
		System.out.println("add invoked with " + no1 +", " + no2);
		return "Sum = " + (no1+no2);
	}
}
