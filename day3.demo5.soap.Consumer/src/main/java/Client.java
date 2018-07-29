import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.SampleService;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("demo1.xml");
		SampleService service = ctx.getBean("ss",SampleService.class);
		String  s = service.hello("VaishaliTest" );
		System.out.println("Server returned = " + s);
	}

}
