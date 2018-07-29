package params;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.Emp;

@Controller
@RequestMapping(value = "/demo")
public class ModelDemo {
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String add(Emp emp) {
		System.out.println("Add invoked with " + emp);
		String s = emp.toString();
		return s;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Emp get() {
		Emp e = new Emp();
		e.setEmpno(1111);
		e.setEname("AAAAAA");
		e.setSalary(1100011);
		return e;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/listjson", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Emp> listjson() {
		List<Emp> list = new ArrayList<Emp>();
		for(int i = 1;i<=10;i++)
		{
			Emp e= new Emp(i,"nameof"+i,i*1000);
			list.add(e);
		}
		return list;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/listxml", produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public List<Emp> listxml() {
		List<Emp> list = new ArrayList<Emp>();
		for(int i = 1;i<=10;i++)
		{
			Emp e= new Emp(i,"nameof"+i,i*1000);
			list.add(e);
		}
		return  list;
	}
}
