package com.rasitesdmr.studentservice.repository;


import com.rasitesdmr.studentservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    boolean existsByIdentityNumber(String identityNumber);

    boolean existsById(long studentId);
    boolean existsBySchoolNumber(String schoolNumber);


}
