package com.ead.course.services;

import com.ead.course.repositories.ModuleRepository;
import com.ead.course.services.impl.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleServiceImp implements ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;
}
