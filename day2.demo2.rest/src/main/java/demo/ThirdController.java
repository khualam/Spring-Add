package demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MimeType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/third")
public class ThirdController {
	@RequestMapping(method=RequestMethod.GET, value="/h")
	@ResponseBody
	public String method2()
	{
		String s = "<html><body><h1>Method2 -GET - S2 Invoked ...</h1></body></html>";
		System.out.println(s);
		return s;
	}
	
	@RequestMapping(method=RequestMethod.GET,produces=MediaType.TEXT_PLAIN_VALUE,value="/p")
	
	@ResponseBody
	public String method1()
	{
		String s = "plain text";
		System.out.println(s);
		return s;
	}

	@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE, value="/j")
	@ResponseBody
	public String method3()
	{
		String s = "{ \"id\": 1, \"name\": \"A green door\", \"price\": 12.50, \"tags\": [\"home\", \"green\"]}";
		System.out.println(s);
		return s;
	}
	@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_XML_VALUE,value="/x")
	@ResponseBody
	public String method4()
	{
		String s = "<?xml version='1.0' encoding='UTF-8'?><note>  <to>Tove</to>  <from>Jani</from>  <heading>Reminder</heading>  <body>Don't forget me this weekend!</body></note>";
		System.out.println(s);
		return s;
	}
	
	
}
