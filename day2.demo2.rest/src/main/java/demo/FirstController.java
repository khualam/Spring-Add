package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/first")
public class FirstController {
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public String method1()
	{
		String s = "<html><body><h1>Method1 - GET Invoked ...</h1></body></html>";
		System.out.println(s);
		return s;
	}
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public String method2()
	{
		String s = "<html><body><h1>Method2 -POST Invoked ...</h1></body></html>";
		System.out.println(s);
		return s;
	}
	@RequestMapping(method=RequestMethod.PUT)
	@ResponseBody
	public String method3()
	{
		String s = "<html><body><h1>Method3 Invoked ...</h1></body></html>";
		System.out.println(s);
		return s;
	}
	@RequestMapping(method=RequestMethod.DELETE)
	@ResponseBody
	public String method4()
	{
		String s = "<html><body><h1>Method4 Invoked ...</h1></body></html>";
		System.out.println(s);
		return s;
	}
	@RequestMapping(method=RequestMethod.HEAD)
	@ResponseBody
	public String method5()
	{
		String s = "<html><body><h1>Head..... Invoked ...</h1></body></html>";
		System.out.println(s);
		return s;
	}
	
	@RequestMapping(method=RequestMethod.OPTIONS)
	@ResponseBody
	public String method6()
	{
		String s = "<html><body><h1>Method options Invoked ...</h1></body></html>";
		System.out.println(s);
		return s;
	}
	
	
}
