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

@Repository(value="deptdao")
@EnableTransactionManagement
@Transactional(propagation=Propagation.REQUIRED)
public class DeptDAO {
	private HibernateTemplate template;
	@Autowired
	private SessionFactory sf;
	
	@PostConstruct
	public void m1()
	{
		template = new HibernateTemplate(sf);
		System.out.println("Template = " + template);
	}
	@Transactional( propagation=Propagation.REQUIRES_NEW)
	public void create(Dept d)
	{

		template.save(d);
	}
	
	public void delete(int deptno)
	{
		Dept d= template.get(Dept.class,deptno);
		if (d == null)
		{
			System.out.println("Deptno " + deptno +"  doesn't exist...");
			return ;
		}
		template.delete(d);
	}
	
	public void update(Dept dept)
	{
		try {
			template.update(dept);
		} catch (DataAccessException e) {
			System.out.println("Deptno " + dept.getDeptno() +"  doesn't exist ");
		}
		
	}
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public void list()
	{
		List<Dept> list = (List<Dept>) template.find("select d from Dept d");
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}
	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	
	
	
}
