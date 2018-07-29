package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("demo2.xml");
		ReaderWriter rw = context.getBean("rw",ReaderWriter.class);
		Emp e= new Emp();
		
		e.setEmpno(1);
		e.setEname("Vaishali" );
		e.setSalary(11111);
		Address addr = new Address();
		addr.setLine1("Hinjewadi");
		addr.setLine2("Phase3");
		addr.setCity("PNQ");
		addr.setState("MH");
		
		e.setAddr(addr);
		
		rw.write(e,"c:\\work\\tmp.xml");
		rw.read("c:\\work\\tmp1.xml");
	}

}
