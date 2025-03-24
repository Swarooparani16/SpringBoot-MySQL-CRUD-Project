package com.Spring.with.postman.Spring.with.postman.service;

import com.Spring.with.postman.Spring.with.postman.Repository.StudentRepo;
import com.Spring.with.postman.Spring.with.postman.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Student getDetailsById(int id)
    {
        return studentRepo.findById(id).orElse(null);
    }

    //public List<Student> getAlldetails()
    //{
       // return studentRepo.findAll();
   // }

    public Student updateDetail(Student student)
    {
        Student updateStudent = studentRepo.findById(student.getId()).orElse(null);
        if(updateStudent!=null)
        {
            updateStudent.setMarks(student.getMarks());
            updateStudent.setName(student.getName());
            return studentRepo.save(updateStudent);
        }
        return null;

    }

    public String deleteStudent(int id)
    {
        if(studentRepo.existsById(id)) {
            studentRepo.deleteById(id);
            return "deleted" + id;
        }
        else {
            return "not their that id";
        }
    }

    public List<Student>  saveListStudents(List<Student> students)
    {
        return studentRepo.saveAll(students);
    }
}
