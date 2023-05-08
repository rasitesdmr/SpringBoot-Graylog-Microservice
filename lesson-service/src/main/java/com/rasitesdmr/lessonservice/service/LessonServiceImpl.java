package com.rasitesdmr.lessonservice.service;


import com.rasitesdmr.lessonservice.dto.request.LessonCreateRequest;
import com.rasitesdmr.lessonservice.dto.response.LessonCreateResponse;
import com.rasitesdmr.lessonservice.dto.response.LessonIdResponse;
import com.rasitesdmr.lessonservice.exception.AlreadyAvailableException;
import com.rasitesdmr.lessonservice.exception.NotAvailableException;
import com.rasitesdmr.lessonservice.model.Lesson;
import com.rasitesdmr.lessonservice.repository.LessonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class LessonServiceImpl implements LessonService {

    private final LessonRepository lessonRepository;

    @Override
    public LessonCreateResponse createLesson(LessonCreateRequest lessonCreateRequest) {


        if (lessonRepository.existsByCode(lessonCreateRequest.getCode().toUpperCase())) {
            log.error(lessonCreateRequest.getCode() + " coda sahip ders zaten mevcut!");
            throw new AlreadyAvailableException(lessonCreateRequest.getCode() + " coda sahip ders zaten mevcut!");
        }

        Lesson lesson = new Lesson();
        lesson.setName(lessonCreateRequest.getName().toUpperCase());
        lesson.setCode(lessonCreateRequest.getCode().toUpperCase());
        lesson.setActive(true);

        lessonRepository.save(lesson);
        log.info(lesson.getName() + " dersi kayıt işlemi tamamlandı.");

        LessonCreateResponse lessonCreateResponse = new LessonCreateResponse();
        lessonCreateResponse.setId(lesson.getId());
        lessonCreateResponse.setName(lesson.getName());
        lessonCreateResponse.setCode(lesson.getCode());
        lessonCreateResponse.setActive(lesson.isActive());

        return lessonCreateResponse;
    }

    @Override
    public LessonIdResponse getByLessonId(long lessonId) {

        if (!lessonRepository.existsById(lessonId)) {
            log.error(lessonId + " id ye sahip ders bulunamadı !");
            throw new NotAvailableException(lessonId + " id ye sahip ders bulunamadı !");
        }

        Lesson lesson = lessonRepository.findById(lessonId).get();
        LessonIdResponse lessonIdResponse = new LessonIdResponse();
        lessonIdResponse.setId(lesson.getId());
        lessonIdResponse.setName(lesson.getName());
        lessonIdResponse.setCode(lesson.getCode());
        lessonIdResponse.setActive(lesson.isActive());
        return lessonIdResponse;
    }


    public void logPeriodically() {

        for (int i = 0; i <100000 ; i++) {
            log.error("Test error mesajı");
            log.info("Test info mesajı");
        }
    }
}
