package com.rasitesdmr.client.feign;


import com.rasitesdmr.client.dto.request.LessonCreateRequest;
import com.rasitesdmr.client.dto.response.LessonCreateResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "lesson-service", url = "http://localhost:1002/lesson")
public interface LessonFeignClient {



    @PostMapping(value = "/createLesson", consumes = MediaType.APPLICATION_JSON_VALUE)
    LessonCreateResponse feignCreateLesson(@RequestBody LessonCreateRequest lessonCreateRequest);
    

}
