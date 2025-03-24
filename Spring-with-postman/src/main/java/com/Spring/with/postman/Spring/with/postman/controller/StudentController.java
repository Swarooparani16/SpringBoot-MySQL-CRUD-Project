package com.Spring.with.postman.Spring.with.postman.controller;

import com.Spring.with.postman.Spring.with.postman.entity.Student;
import com.Spring.with.postman.Spring.with.postman.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudent")
//    we are adding data and requestion from the json by using this request body will get all this
//
    public Student postDetails(@RequestBody Student student)
    {
        return studentService.saveDetails(student);
    }

    @GetMapping("/getstudent")
    public List<Student> getDetails()
    {
        return studentService.getAlldetails();
    }
    @GetMapping("/getStudentById/{id}")
    public Student getDetailsById(@PathVariable int id)
    {
        return studentService.getDetailsById(id);
    }
    @PutMapping("/updateDetails")
    public Student updateStudentDetails(@RequestBody Student student)
    {
        return studentService.updateDetail(student);
    }
    @DeleteMapping("/deteleDetails/{id}")
    public String deleteStudentDetails(@PathVariable int id)
    {
        return studentService.deleteStudent(id);
    }
    @PostMapping("/addStudentList")
    public List<Student>  savestudentlist(@RequestBody List<Student> students)
    {
        return studentService.saveListStudents(students);
    }
}
