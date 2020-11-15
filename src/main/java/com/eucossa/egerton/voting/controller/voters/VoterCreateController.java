package com.eucossa.egerton.voting.controller.voters;

import com.eucossa.egerton.voting.model.position.Position;
import com.eucossa.egerton.voting.model.voter.Voter;
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
@RequestMapping(path = "/api/v1/voter/add")
public class VoterCreateController {
    private ServicesManager servicesManager;

    @Autowired
    public void setServicesManager(ServicesManager servicesManager) {
        this.servicesManager = servicesManager;
    }

    @PostMapping
    public ResponseEntity<?> addVoter(@RequestBody Voter voter) {
        voter.setVoted(false);
        Voter voter1 =  servicesManager
                .getVoterService()
                .saveVoter(voter);

        return new ResponseEntity<>(voter1, HttpStatus.CREATED);
    }
}
