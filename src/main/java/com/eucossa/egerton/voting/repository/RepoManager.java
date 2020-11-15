package com.eucossa.egerton.voting.repository;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Odinga David
 * otienodavidodinga@gmail.com
 */

@Getter
@Service
public class RepoManager {

    private CandidateRepo candidateRepo;
    private PositionRepo positionRepo;
    private VoterRepo voterRepo;

    @Autowired
    public void setCandidateRepo(CandidateRepo candidateRepo) {
        this.candidateRepo = candidateRepo;
    }

    @Autowired
    public void setPositionRepo(PositionRepo positionRepo) {
        this.positionRepo = positionRepo;
    }

    @Autowired
    public void setVoterRepo(VoterRepo voterRepo) {
        this.voterRepo = voterRepo;
    }
}
