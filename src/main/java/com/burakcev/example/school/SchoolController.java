package com.burakcev.example.school;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class SchoolController {

    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping("/schools")
    public List<SchoolDto> findAll(){
        return schoolService.findAll();
    }

    @PostMapping("/schools")
    public SchoolDto create(@RequestBody SchoolDto dto){
        return schoolService.create(dto);
    }

}
