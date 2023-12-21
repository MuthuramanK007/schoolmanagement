package com.management.org.service.impl;


import com.management.org.entity.School;
import com.management.org.repository.SchoolRepository;
import com.management.org.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolRepository schoolDb;

    @Override
    public long addSchool(School school) {
    return schoolDb.save(school).getId();
    }

    @Override
    public List<School> getSchools() {
       return schoolDb.findAll();
    }
}
