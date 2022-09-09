package com.sunglowsys;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.resource.EmployeeResource;
import com.sunglowsys.service.impl.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.lang.reflect.Array;
import java.net.URI;
import java.util.Arrays;
import java.util.Optional;

@ExtendWith(SpringExtension.class)
@WebMvcTest(value = EmployeeResource.class)
public class EmployeeResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    Employee employee = new Employee("madhu","chauhan","767665654","mk@gmail.com");

    @Test
    public void retrieveDetailsForEmployee() throws Exception {
        employee.setId(1L);
        Mockito.when(employeeService.findOne(Mockito.anyLong())).thenReturn(Optional.ofNullable(employee));
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/employees/1").accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());
        String expected = "{\"id\": 1, \"firstName\": \"madhu\", \"lastName\": \"chauhan\", \"mobile\": \"767665654\", \"email\": \"mk@gmail.com\"}";
        JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(),false);

    }

    public void createEmployee() throws Exception {
        Employee mockEmployee = new Employee("gauri","pundhir","8976554323","gk@gmail.com");
        Mockito.when(employeeService.save(employee(Mockito.anyString(),Mockito.any(Employee.class)));
    }




}



