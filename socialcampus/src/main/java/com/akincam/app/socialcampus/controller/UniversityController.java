package com.akincam.app.socialcampus.controller;


import com.akincam.app.socialcampus.model.UniversityEntity;
import com.akincam.app.socialcampus.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/university")
public class UniversityController {

    private UniversityService universityService;

    @Autowired
    public UniversityController(UniversityService universityService){
        this.universityService = universityService;
    }

    @GetMapping
    public List<UniversityEntity> getUsers(){
        return universityService.getAllUser();
    }

    @GetMapping("/getUniversity")
    public UniversityEntity getUser(String name){
        return universityService.getUniByName(name);
    }
}
