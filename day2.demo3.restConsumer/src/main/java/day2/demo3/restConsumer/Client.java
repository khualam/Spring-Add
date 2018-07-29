package day2.demo3.restConsumer;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Client {

	public static void main(String[] args) {
		RestTemplate template=  new RestTemplate();
	/* First Controller Calls */	
		System.out.println("Get Request Returned = "  +  template.getForObject("http://localhost:8080/day2/serv/first",String.class));
		System.out.println("Post Request Returned = "  +  template.postForObject("http://localhost:8080/day2/serv/first","aa",String.class));
		template.put("http://localhost:8080/day2/serv/first","adfasdf");
		template.delete("http://localhost:8080/day2/serv/first");
		
		/* Second Controller Calls */	
		System.out.println("Get Request for s1 Returned = "  +  template.getForObject("http://localhost:8080/day2/serv/second/s1",String.class));
		System.out.println("Get Request for s2 Returned = "  +  template.getForObject("http://localhost:8080/day2/serv/second/s2",String.class));
	
		String url = "http://localhost:8080/day2/serv/third";
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.TEXT_PLAIN));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		ResponseEntity<String> re= template.exchange(url+"/p", HttpMethod.GET, entity, String.class);
		System.out.println("/p returned =  " + re.getBody());
	
		headers.setAccept(Arrays.asList(MediaType.TEXT_HTML));
		entity = new HttpEntity<String>("parameters", headers);
		 re= template.exchange(url+"/h", HttpMethod.GET, entity, String.class);
		System.out.println("/h returned =  " + re.getBody());
		
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		entity = new HttpEntity<String>("parameters", headers);
		 re= template.exchange(url+"/j", HttpMethod.GET, entity, String.class);
		System.out.println("/j returned =  " + re.getBody());
		
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		entity = new HttpEntity<String>("parameters", headers);
		 re= template.exchange(url+"/x", HttpMethod.GET, entity, String.class);
		System.out.println("/h returned =  " + re.getBody());
	}

}
