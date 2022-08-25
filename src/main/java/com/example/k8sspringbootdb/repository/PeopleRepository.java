package com.example.k8sspringbootdb.repository;

import com.example.k8sspringbootdb.model.PeopleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends CrudRepository<PeopleEntity, String> {


}
