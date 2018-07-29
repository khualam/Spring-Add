package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import demo.Dept;
import demo.DeptDAO;
import demo.MyService;

@Controller
@RequestMapping(value="/dept")
public class DeptController {
	@Autowired
	private MyService myserv;
    @RequestMapping(method=RequestMethod.POST)
	public ModelAndView create(Dept d){
		System.out.println("in create - deptcontroller " + d);
		myserv.insert(d, null);
		return new ModelAndView("/index.jsp");
	} 
 
    @RequestMapping(method=RequestMethod.GET,value="/list")
    public ModelAndView list(){
    	List<Dept> list = myserv.list();
    	System.out.println("in list - deptcontroller " + list.size());
    	return new ModelAndView("/list.jsp","dlist", list);
    	
    }
    
    
	public MyService getMyserv() {
		return myserv;
	}

	public void setMyserv(MyService myserv) {
		this.myserv = myserv;
	}
}
