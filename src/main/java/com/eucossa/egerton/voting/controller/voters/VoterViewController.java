package com.eucossa.egerton.voting.controller.voters;

import com.eucossa.egerton.voting.model.candidate.Candidate;
import com.eucossa.egerton.voting.model.voter.Voter;
import com.eucossa.egerton.voting.services.ServicesManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Odinga David
 * otienodavidodinga@gmail.com
 */

@RestController
@RequestMapping(path = "/api/v1/voters")
public class VoterViewController {

    private ServicesManager servicesManager;

    @Autowired
    public void setServicesManager(ServicesManager servicesManager) {
        this.servicesManager = servicesManager;
    }

    @GetMapping
    public List<Voter> viewVoters() {

        return servicesManager
                .getVoterService()
                .getVoters();
    }

    @GetMapping("/getOne")
    public Voter viewVoter(@RequestParam String regNo) {

        return servicesManager
                .getVoterService()
                .getVoter(regNo);
    }
}
