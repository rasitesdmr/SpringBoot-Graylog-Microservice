package com.rasitesdmr.studentlessonservice.service;


import com.rasitesdmr.studentlessonservice.dto.request.StudentLessonRequest;
import com.rasitesdmr.studentlessonservice.dto.response.StudentLessonResponse;

public interface StudentLessonService {

    StudentLessonResponse studentLessonMatch (StudentLessonRequest studentLessonRequest);
}
