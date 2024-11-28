package com.arun.employee_service.service;

import com.arun.employee_service.dto.ApiResponseDto;
import com.arun.employee_service.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//For the Feign client, we need to specify the URL of the service we want to call
//@FeignClient(url = "http://localhost:8081/", value = "department-service")

//We can also use the service name instead of the URL
//using eureka service registry
@FeignClient(name = "DEPARTMENT-SERVICE")
public interface ApiClient {
    @GetMapping("api/departments/{department-code}")
    public DepartmentDto getDepartment(@PathVariable("department-code") String departmentCode);
}
