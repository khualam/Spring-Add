package demo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository(value="empdao")
@EnableTransactionManagement
@Transactional(propagation=Propagation.REQUIRED)
public class EmpDAO {
	private HibernateTemplate template;
	@Autowired
	private SessionFactory sf;
	
	@PostConstruct
	public void m1()
	{
		template = new HibernateTemplate(sf);
		System.out.println("Template = " + template);
	}
	
	public void create(Emp d)
	{
		template.save(d);
	}
	

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	
	
	
}
