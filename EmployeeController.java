package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.models.EmployeeModel;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository er;
	
	@PostMapping("Insert")
	public String insert(EmployeeModel em)
	{
		try
		{
			er.save(em);
			return "Recored Inserted";
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		return "stored";
	}
	
	@PostMapping("Delete")
	public String delete(int id)
	{
		try
		{
			er.deleteById(id);
			return "Recored Deleted";
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		return "stored";
	}
	
	@PostMapping("Update")
	public String update(@ModelAttribute EmployeeModel model)
	{
		try
		{
			er.save(model);
			return "Recored updated";
		}
		catch(Exception e)
		{
			e.printStackTrace();;
		}
		return "stored";
	}
	
	@GetMapping("display")
	public Iterable<EmployeeModel>getall()
	{
		return er.findAll();
	}
}
