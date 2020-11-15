package com.eucossa.egerton.voting.services;

import com.eucossa.egerton.voting.services.candidate.CandidateService;
import com.eucossa.egerton.voting.services.position.PositionService;
import com.eucossa.egerton.voting.services.voter.VoterService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Odinga David
 * otienodavidodinga@gmail.com
 */

@Getter
@Service
public class ServiceManger {

    private VoterService voterService;
    private PositionService positionService;
    private CandidateService candidateService;

    @Autowired
    public void setVoterService(VoterService voterService) {
        this.voterService = voterService;
    }

    @Autowired
    public void setPositionService(PositionService positionService) {
        this.positionService = positionService;
    }

    @Autowired
    public void setCandidateService(CandidateService candidateService) {
        this.candidateService = candidateService;
    }
}
