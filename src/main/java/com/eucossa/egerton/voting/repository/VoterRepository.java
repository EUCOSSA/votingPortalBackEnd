package com.eucossa.egerton.voting.repository;

import com.eucossa.egerton.voting.model.voter.Voter;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Odinga David
 * otienodavidodinga@gmail.com
 */
public interface VoterRepository extends JpaRepository<Voter, String> {

    boolean existsByRegNo(String regNo);
}
