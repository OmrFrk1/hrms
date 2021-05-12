package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.entities.concretes.Department;
import hrms.hrms.entities.concretes.User;

public interface DepartmentService {
	List<Department> getAll();
}
