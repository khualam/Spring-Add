package demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value="myserv")
@EnableTransactionManagement
public class MyService {
	@Autowired
	private DeptDAO deptdao;
	
	@Autowired
	private EmpDAO empdao;
	@Transactional(propagation=Propagation.REQUIRED)
	public void insert(Dept d, Emp[] arr)
	{
		deptdao.create(d);
		for (int i = 0; i < arr.length; i++) {
			empdao.create(arr[i]);
		}
	}
	
	
	public DeptDAO getDeptdao() {
		return deptdao;
	}

	public void setDeptdao(DeptDAO deptdao) {
		this.deptdao = deptdao;
	}

	public EmpDAO getEmpdao() {
		return empdao;
	}

	public void setEmpdao(EmpDAO empdao) {
		this.empdao = empdao;
	}
	
}
