package com.rasitesdmr.studentservice.service;


import com.rasitesdmr.studentservice.dto.request.StudentCreateRequest;
import com.rasitesdmr.studentservice.dto.response.StudentCreateResponse;
import com.rasitesdmr.studentservice.dto.response.StudentIdResponse;

public interface StudentService {

    StudentCreateResponse createStudent (StudentCreateRequest studentCreateRequest);

    StudentIdResponse getByStudentId(long studentId);
}
