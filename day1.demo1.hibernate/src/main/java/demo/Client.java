package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("demo1.xml");
		MyService dao = context.getBean("myserv", MyService.class);
		System.out.println("dao loaded...");
		Dept d = new Dept();
		d.setDeptno(10); d.setDname("HR"); d.setLoc("BLR");
		Emp[] arr =new Emp[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= new Emp();
			arr[i].setEmpno(i+1);
			arr[i].setEname("Nameof" +(i+1));
			arr[i].setSalary((i+1)*1000);
		}
		arr[1].setEmpno(1);
		dao.insert(d, arr);
		
		/*for (int i = 10; i < 100; i += 10) {
			Dept d = new Dept();
			d.setDeptno(i);
			d.setDname("Nameof" + i);
			d.setLoc("Hyd"); 
			dao.create(d);
		}
		dao.delete(20);
		Dept d= new Dept(); 
		d.setDeptno(30);
		d.setDname("Training");
		d.setLoc("Hyd");
		dao.update(d);
		
		dao.list();
	*/
	}

}
