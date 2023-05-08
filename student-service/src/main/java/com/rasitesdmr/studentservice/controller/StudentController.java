package com.rasitesdmr.studentservice.controller;


import com.rasitesdmr.studentservice.dto.request.StudentCreateRequest;
import com.rasitesdmr.studentservice.dto.response.StudentCreateResponse;
import com.rasitesdmr.studentservice.dto.response.StudentIdResponse;
import com.rasitesdmr.studentservice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/createStudent")
    public ResponseEntity<StudentCreateResponse> createStudent (@RequestBody StudentCreateRequest studentCreateRequest){
        return new ResponseEntity<>(studentService.createStudent(studentCreateRequest), HttpStatus.CREATED);
    }

    @GetMapping("/getByStudentId")
    public ResponseEntity<StudentIdResponse> getByStudentId (@RequestParam(name = "studentId") long studentId){
        return new ResponseEntity<>(studentService.getByStudentId(studentId),HttpStatus.OK);
    }
}
