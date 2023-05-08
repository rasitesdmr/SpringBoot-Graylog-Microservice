package com.rasitesdmr.lessonservice.controller;


import com.rasitesdmr.lessonservice.dto.request.LessonCreateRequest;
import com.rasitesdmr.lessonservice.dto.response.LessonCreateResponse;
import com.rasitesdmr.lessonservice.dto.response.LessonIdResponse;
import com.rasitesdmr.lessonservice.service.LessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lesson")
@RequiredArgsConstructor
public class LessonController {

    private final LessonService lessonService;

    @PostMapping("/createLesson")
    public ResponseEntity<LessonCreateResponse> createLesson(@RequestBody LessonCreateRequest lessonCreateRequest){
        return new ResponseEntity<>(lessonService.createLesson(lessonCreateRequest), HttpStatus.CREATED);
    }

    @GetMapping("/getByLessonId")
    public ResponseEntity<LessonIdResponse> getByLessonId (@RequestParam(name = "lessonId") long lessonId){
        return new ResponseEntity<>(lessonService.getByLessonId(lessonId),HttpStatus.OK);
    }

    @GetMapping("/log")
    public void logPeriodically(){
        lessonService.logPeriodically();
    }

}
