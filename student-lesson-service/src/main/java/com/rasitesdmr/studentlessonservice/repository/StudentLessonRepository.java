package com.rasitesdmr.studentlessonservice.repository;

import com.rasitesdmr.studentlessonservice.model.StudentLesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentLessonRepository extends JpaRepository<StudentLesson,Long> {

    boolean existsByStudentId(long studentId);

    boolean existsByLessonId(long lessonId);

}
