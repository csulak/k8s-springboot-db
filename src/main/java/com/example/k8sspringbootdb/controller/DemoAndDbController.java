package com.example.k8sspringbootdb.controller;

import com.example.k8sspringbootdb.model.People;
import com.example.k8sspringbootdb.service.DemoAndDbService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoAndDbController {


    private DemoAndDbService demoAndDbService;

    public DemoAndDbController(DemoAndDbService demoAndDbService) {
        this.demoAndDbService = demoAndDbService;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping(value = "/people", method = RequestMethod.GET, produces = "application/json")
    public List<People> getPeople() {
        return demoAndDbService.getPeople();
    }

    @RequestMapping(value = "/people", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String countryInfoComplete(@RequestBody People people) {
        return demoAndDbService.createPeople(people);
    }

}
