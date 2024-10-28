package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.EmployeeModel;

public interface EmployeeRepository extends CrudRepository<EmployeeModel ,Integer>{

}
