package com.management.org.controller;

import com.management.org.entity.School;
import com.management.org.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping("/school")
    public long createSchool(@RequestBody School school){
        return schoolService.addSchool(school);
    }

    @GetMapping("/schools")
    public List<School> getSchools(){
        return schoolService.getSchools();
    }

}
