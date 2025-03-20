package com.Spring.with.postman.Spring.with.postman.Repository;

import com.Spring.with.postman.Spring.with.postman.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//it is the layer which is used to connect with entity and the database where
//we rise the queries or anything
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
