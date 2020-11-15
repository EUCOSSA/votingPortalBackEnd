package com.eucossa.egerton.voting.services.candidate;

import com.eucossa.egerton.voting.model.candidate.Candidate;
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
public class CandidateService {
    private RepoManager repoManager;


    @Autowired
    public void setRepoManager(RepoManager repoManager) {
        this.repoManager = repoManager;
    }

    public Candidate saveCandidate(Candidate candidate) {
        if (candidateNotRegistered(candidate))
            return repoManager
                    .getCandidateRepo()
                    .save(candidate);

        return null;
    }


    public List<Candidate> getCandidates() {
        return repoManager
                .getCandidateRepo()
                .findAll();
    }


    public List<Candidate> saveCandidates(List<Candidate> candidates) {
        candidates = candidates
                .stream()
                .filter(this::candidateNotRegistered)
                .collect(Collectors.toList());

        return repoManager
                .getCandidateRepo()
                .saveAll(candidates);
    }

    private boolean candidateNotRegistered(Candidate candidate) {
        return !repoManager
                .getCandidateRepo()
                .existsByVoter(candidate.getVoter());
    }

    public Candidate getCandidate(int id) {
        return repoManager
                .getCandidateRepo()
                .findById(id)
                .orElse(null);
    }
}
