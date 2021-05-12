package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.DepartmentService;
import hrms.hrms.dataAcces.abstracts.DepartmentDao;
import hrms.hrms.entities.concretes.Department;;

@Service
public class DepartmentManager implements DepartmentService{
	
	private DepartmentDao departmentDao;
	
	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}
	
	@Override
	public List<Department> getAll() {
		
		return this.departmentDao.findAll();
	}
	
}
