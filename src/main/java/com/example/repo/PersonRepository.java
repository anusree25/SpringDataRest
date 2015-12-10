package com.example.repo;

import com.example.model.Candidate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by ramakria on 11/30/2015.
 */

@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Candidate,Integer> {
	
	Logger log = LoggerFactory.getLogger(PersonRepository.class);

    @RestResource
    public List<Candidate> findCandidateByFirstName(@Param(value = "name")String firstName);;


}
