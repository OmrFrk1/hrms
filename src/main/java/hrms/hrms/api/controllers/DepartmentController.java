package hrms.hrms.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.DepartmentService;
import hrms.hrms.entities.concretes.Department;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
	private DepartmentService departmentService;
	
	@Autowired
	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	@GetMapping("/getall")
	public List<Department> getAll(){
		return this.departmentService.getAll();
	}

}
