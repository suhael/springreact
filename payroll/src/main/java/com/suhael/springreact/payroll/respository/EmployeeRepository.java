package com.suhael.springreact.payroll.respository;

import com.suhael.springreact.payroll.models.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}
