package com.arun.employee_service.service;

import com.arun.employee_service.dto.ApiResponseDto;
import com.arun.employee_service.dto.EmployeeDto;

public interface EmployeeService {
     EmployeeDto saveEmployee(EmployeeDto employeeDto);
     ApiResponseDto getEmployee(Long id);
}
