package com.rasitesdmr.studentlessonservice.controller;


import com.rasitesdmr.studentlessonservice.dto.request.StudentLessonRequest;
import com.rasitesdmr.studentlessonservice.dto.response.StudentLessonResponse;
import com.rasitesdmr.studentlessonservice.service.StudentLessonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentLesson")
@RequiredArgsConstructor
@Slf4j
public class StudentLessonController {

    private final StudentLessonService lessonService;

    @PostMapping("/studentLessonMatch")
   public ResponseEntity<StudentLessonResponse> studentLessonMatch(@RequestBody StudentLessonRequest studentLessonRequest){
       return new ResponseEntity<>(lessonService.studentLessonMatch(studentLessonRequest),HttpStatus.CREATED);
   }

}
