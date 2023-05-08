package com.rasitesdmr.client.controller;

import com.rasitesdmr.client.dto.request.LessonCreateRequest;
import com.rasitesdmr.client.dto.response.LessonCreateResponse;
import com.rasitesdmr.client.feign.LessonFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesson")
@RequiredArgsConstructor
@Slf4j
public class LessonController {

    private final LessonFeignClient lessonFeignClient;

    @PostMapping("/createLesson")
    public ResponseEntity<LessonCreateResponse> createLesson(@RequestBody LessonCreateRequest lessonCreateRequest) {
        log.info(lessonCreateRequest.getName() + " dersi kayıt işlemi başladı...");
        return new ResponseEntity<>(lessonFeignClient.feignCreateLesson(lessonCreateRequest), HttpStatus.CREATED);
    }
}
