package com.arun.employee_service.service.impl;

import com.arun.employee_service.dto.ApiResponseDto;
import com.arun.employee_service.dto.DepartmentDto;
import com.arun.employee_service.dto.EmployeeDto;
import com.arun.employee_service.mapper.EmployeeMapper;
import com.arun.employee_service.model.Employee;
import com.arun.employee_service.repository.EmployeeRepository;
import com.arun.employee_service.service.ApiClient;
import com.arun.employee_service.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

//    private WebClient webClient;

    private ApiClient apiClient;
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        employee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public ApiResponseDto getEmployee(Long id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if(employee == null){
            return null;
        }
//        DepartmentDto departmentDto=webClient.get()
//                .uri("http://localhost:8081/api/departments/"+employee.getDepartmentCode())
//                .retrieve()
//                .bodyToMono(DepartmentDto.class)
//                .block();
        DepartmentDto departmentDto=apiClient.getDepartment(employee.getDepartmentCode());

        ApiResponseDto apiResponseDto=new ApiResponseDto();
        apiResponseDto.setEmployee(EmployeeMapper.mapToEmployeeDto(employee));
        apiResponseDto.setDepartment(departmentDto);
        return apiResponseDto;
    }
}
