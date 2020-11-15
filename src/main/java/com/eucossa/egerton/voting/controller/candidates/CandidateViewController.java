package com.eucossa.egerton.voting.controller.candidates;

import com.eucossa.egerton.voting.model.candidate.Candidate;
import com.eucossa.egerton.voting.services.ServicesManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Odinga David
 * otienodavidodinga@gmail.com
 */

@RestController
@RequestMapping(path = "/api/v1/candidates")
public class CandidateViewController {

    private ServicesManager servicesManager;

    @Autowired
    public void setServicesManager(ServicesManager servicesManager) {
        this.servicesManager = servicesManager;
    }

    @GetMapping
    public List<Candidate> viewCandidates() {

        return servicesManager
                .getCandidateService()
                .getCandidates();
    }

    @GetMapping("/{id}")
    public Candidate viewCandidate(@PathVariable int id) {

        return servicesManager
                .getCandidateService()
                .getCandidate(id);
    }
}
