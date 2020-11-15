package com.eucossa.egerton.voting.services.voter;

import com.eucossa.egerton.voting.model.voter.Voter;
import com.eucossa.egerton.voting.repository.RepoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Odinga David
 * otienodavidodinga@gmail.com
 */

@Service
public class VoterService {

    private RepoManager repoManager;


    @Autowired
    public void setRepoManager(RepoManager repoManager) {
        this.repoManager = repoManager;
    }

    public Voter saveVoter(Voter voter) {
        if(voterNotRegistered(voter)) {
            return repoManager
                    .getVoterRepo()
                    .save(voter);
        }

        return null;
    }

    public List<Voter> saveAllVoters(List<Voter> voters) {

       voters = voters.stream()
                .filter(this::voterNotRegistered)
                .collect(Collectors.toList());

        return repoManager
                .getVoterRepo()
                .saveAll(voters);
    }

    public Voter getVoter(String regNo) {
        return repoManager
                .getVoterRepo()
                .findById(regNo)
                .orElse(null);
    }


    private boolean voterNotRegistered(Voter voter) {
        return !repoManager
                .getVoterRepo()
                .existsByRegNo(voter.getRegNo());
    }

    public List<Voter> getVoters() {
        return repoManager
                .getVoterRepo()
                .findAll();
    }
}
