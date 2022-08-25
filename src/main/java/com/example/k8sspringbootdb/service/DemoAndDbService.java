package com.example.k8sspringbootdb.service;

import com.example.k8sspringbootdb.model.People;
import com.example.k8sspringbootdb.model.PeopleEntity;
import com.example.k8sspringbootdb.repository.PeopleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DemoAndDbService {

    private PeopleRepository peopleRepository;

    public DemoAndDbService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<People> getPeople() {
        List<PeopleEntity> peopleEntityList = (List<PeopleEntity>) peopleRepository.findAll();

        return peopleEntityList.stream()
                .map(this::convertToPeople)
                .collect(Collectors.toList());
    }


    public String createPeople(People people) {

        PeopleEntity peopleEntity = convertToPeopleEntity(people);
        PeopleEntity peoplePersisted = peopleRepository.save(peopleEntity);

        return peoplePersisted.getPeopleId();

    }



    private PeopleEntity convertToPeopleEntity(final People people){

        return new PeopleEntity(
                people.getName(),
                people.getLastName(),
                people.getGenre());
    }

    private People convertToPeople(final PeopleEntity peopleEntity){

        return new People(
                peopleEntity.getPeopleId(),
                peopleEntity.getName(),
                peopleEntity.getLastName(),
                peopleEntity.getGenre());
    }





}
