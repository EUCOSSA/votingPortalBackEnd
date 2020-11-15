package com.eucossa.egerton.voting.controller.candidates;

import com.eucossa.egerton.voting.model.candidate.Candidate;
import com.eucossa.egerton.voting.services.ServicesManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Odinga David
 * otienodavidodinga@gmail.com
 */


@RestController
@RequestMapping(path = "/api/v1/candidate/add")
public class CandidateCreateController {

    private ServicesManager servicesManager;

    @Autowired
    public void setServicesManager(ServicesManager servicesManager) {
        this.servicesManager = servicesManager;
    }

    @PostMapping
    public ResponseEntity<?> addCandidate(@RequestBody Candidate candidate) {
        Candidate candidate1 = servicesManager
                .getCandidateService()
                .saveCandidate(candidate);

        return new ResponseEntity<>(candidate1, HttpStatus.CREATED);

    }
}
