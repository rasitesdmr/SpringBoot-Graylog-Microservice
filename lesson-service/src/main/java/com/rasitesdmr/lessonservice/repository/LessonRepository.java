package com.rasitesdmr.lessonservice.repository;


import com.rasitesdmr.lessonservice.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson,Long> {

    boolean existsByCode(String code);

    boolean existsById(long lessonId);
}
