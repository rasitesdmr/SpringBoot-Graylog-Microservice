package com.rasitesdmr.client.feign;

import com.rasitesdmr.client.dto.request.StudentCreateRequest;
import com.rasitesdmr.client.dto.response.StudentCreateResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "student-service", url = "http://localhost:1001/student")
public interface StudentFeignClient {
    @PostMapping(value = "/createStudent", consumes = MediaType.APPLICATION_JSON_VALUE)
    StudentCreateResponse feignCreateStudent(@RequestBody StudentCreateRequest studentCreateRequest);

}
