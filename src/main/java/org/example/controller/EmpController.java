package org.example.controller;


import org.example.dto.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class EmpController
{

    //@GetMapping(value = "/v1/test",produces = APPLICATION_JSON_VALUE)
    //public String test()
    //{
      //  return "Test Application";
    //}
    //CRUD OPERATIONS
    //Read
    @RequestMapping("/")
    public String index(){
        return "Start";
    }
    @GetMapping("/Employee")
    public ResponseEntity fetchAllEmployee(){
        return new ResponseEntity(HttpStatus.OK);
    }
    @GetMapping("/Employee/{id}")
    public ResponseEntity fetchEmployeeById(@PathVariable("id")String id){
        return new ResponseEntity(HttpStatus.OK);
    }
//Create
    @PostMapping(value="/Employee",consumes = "application/json",produces = "application/json")
    public Employee createEmployee(@RequestBody Employee employee){
        return employee;
    }
//Delete
    @DeleteMapping("/Employee/{id}")
    public ResponseEntity deleteEmployee(@PathVariable("id")String id){
        return new ResponseEntity(HttpStatus.OK);
    }

}



