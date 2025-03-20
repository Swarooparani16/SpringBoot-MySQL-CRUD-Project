package com.Spring.with.postman.Spring.with.postman.service;

import com.Spring.with.postman.Spring.with.postman.Repository.StudentRepo;
import com.Spring.with.postman.Spring.with.postman.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    //we didnot directly connect to the entity so we use repo in order entity layer here
    //and all the related is present in the service layer
    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student)
    {
        return studentRepo.save(student);

    }
}
