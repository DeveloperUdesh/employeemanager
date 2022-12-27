package tech.getarrays.employeemanager;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import tech.getarrays.employeemanager.model.Employee;

public class JsonGenerator {

    public static void main(String[] args) throws JsonProcessingException {
        Employee employee = new Employee("Udesh M","udeshm@gmail.com","SoftwareEngineer","0123456789","testimage");
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(employee);
        System.out.println(jsonString);

    }
}
