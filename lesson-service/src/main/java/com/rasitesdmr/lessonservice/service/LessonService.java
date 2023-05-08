package com.rasitesdmr.lessonservice.service;


import com.rasitesdmr.lessonservice.dto.request.LessonCreateRequest;
import com.rasitesdmr.lessonservice.dto.response.LessonCreateResponse;
import com.rasitesdmr.lessonservice.dto.response.LessonIdResponse;

public interface LessonService {
    LessonCreateResponse createLesson(LessonCreateRequest lessonCreateRequest);

    LessonIdResponse getByLessonId(long lessonId);
    void logPeriodically();
}
