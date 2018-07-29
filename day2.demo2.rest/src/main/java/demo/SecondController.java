package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/second")
public class SecondController {
	@RequestMapping(method=RequestMethod.GET,  value="/s1")
	@ResponseBody
	public String method1()
	{
		String s = "<html><body><h1>Method1 - s1 Invoked ...</h1></body></html>";
		System.out.println(s);
		return s;
	}
	@RequestMapping(method=RequestMethod.GET,value="/s2")
	@ResponseBody
	public String method2()
	{
		String s = "<html><body><h1>Method2 -GET - S2 Invoked ...</h1></body></html>";
		System.out.println(s);
		return s;
	}
	
	
}
