package demo;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Component;
@Component(value="simple")
public class Simple {
	@Secured(value="ROLE_admin")
public void m1(){
	System.out.println("m1 invoked ....");
}
	@Secured(value="ROLE_stduser")
public void m2(){
	System.out.println("m2 invoked ....");
}
}
