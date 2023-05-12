package com.cinqict.workshop.employee;

import com.cinqict.workshop.controller.EmployeeController;
import com.cinqict.workshop.domain.Employee;
import com.cinqict.workshop.repository.EmployeeRepository;
import com.cinqict.workshop.repository.InMemoryEmployeeRepository;
import com.cinqict.workshop.service.EmployeeService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeControllerTest {

    final private EmployeeRepository repository = new InMemoryEmployeeRepository();
    final private EmployeeService service = new EmployeeService(repository);
    final private EmployeeController controller = new EmployeeController(service);
    @Test
    void add() {
        final Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Doo");
        employee.setCompanyId("12345");
        assertThat(controller.create(employee)).isEqualTo(employee);
    }
}
