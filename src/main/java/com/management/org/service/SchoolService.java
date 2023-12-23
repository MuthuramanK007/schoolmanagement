package com.management.org.service;

import com.management.org.entity.School;

import java.util.List;

public interface SchoolService {
    public long addSchool(School school);
    public List<School> getSchools();
}
