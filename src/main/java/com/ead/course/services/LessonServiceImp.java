package com.ead.course.services;

import com.ead.course.repositories.LessonRepository;
import com.ead.course.services.impl.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImp implements LessonService {

    @Autowired
    private LessonRepository lessonRepository;

}
