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

    private CandidateRepository candidateRepo;
    private PositionRepository positionRepo;
    private VoterRepository voterRepo;

    @Autowired
    public void setCandidateRepo(CandidateRepository candidateRepo) {
        this.candidateRepo = candidateRepo;
    }

    @Autowired
    public void setPositionRepo(PositionRepository positionRepo) {
        this.positionRepo = positionRepo;
    }

    @Autowired
    public void setVoterRepo(VoterRepository voterRepo) {
        this.voterRepo = voterRepo;
    }
}
