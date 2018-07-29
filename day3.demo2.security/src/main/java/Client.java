import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;

import demo.Simple;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("demo1.xml");
		SecurityContextImpl secimpl = new SecurityContextImpl();
		Authentication auth = new UsernamePasswordAuthenticationToken("userthree","passthree");
		
		secimpl.setAuthentication(auth);
		SecurityContextHolder.setContext(secimpl);

		Simple s = ctx.getBean("simple",Simple.class);
		try {
			s.m1();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			s.m2();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
