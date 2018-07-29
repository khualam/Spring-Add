package demo;

import java.io.IOException;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.XmlMappingException;


public class ReaderWriter {
	private Marshaller marshaller;
	private Unmarshaller unmarshaller;
	
	public void write(Emp e , String filename)
	{
		try {
			marshaller.marshal(e,new StreamResult(filename));
		} 
		catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void read( String filename)
	{
		
		try {
		Emp e =(Emp)	unmarshaller.unmarshal(new StreamSource(filename));
		System.out.println("emp = " + e);
		} catch (Exception e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Marshaller getMarshaller() {
		return marshaller;
	}
	public void setMarshaller(Marshaller marshaller) {
		this.marshaller = marshaller;
	}
	public Unmarshaller getUnmarshaller() {
		return unmarshaller;
	}
	public void setUnmarshaller(Unmarshaller unmarshaller) {
		this.unmarshaller = unmarshaller;
	}
	
}
