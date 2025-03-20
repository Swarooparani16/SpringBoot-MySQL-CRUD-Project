package com.Spring.with.postman.Spring.with.postman.controller;

import com.Spring.with.postman.Spring.with.postman.entity.Student;
import com.Spring.with.postman.Spring.with.postman.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudent")
//    we are adding data and requestion from the json by using this request body will get all this

    public Student postDetails(@RequestBody Student student)
    {
        return studentService.saveDetails(student);
    }
}
