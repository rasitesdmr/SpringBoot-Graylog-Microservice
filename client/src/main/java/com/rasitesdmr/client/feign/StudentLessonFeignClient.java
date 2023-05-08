package com.rasitesdmr.client.feign;


import com.rasitesdmr.client.dto.request.StudentLessonRequest;
import com.rasitesdmr.client.dto.response.StudentLessonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "student-lesson-service", url = "http://localhost:1003/studentLesson")
public interface StudentLessonFeignClient {

    @PostMapping("/studentLessonMatch")
    StudentLessonResponse studentLessonMatch(@RequestBody StudentLessonRequest studentLessonRequest);

}
