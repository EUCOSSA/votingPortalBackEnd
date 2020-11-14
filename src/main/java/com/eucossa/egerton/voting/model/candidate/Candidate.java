package com.eucossa.egerton.voting.model.candidate;

import com.eucossa.egerton.voting.model.position.Position;
import com.eucossa.egerton.voting.model.voter.Voter;
import lombok.Data;

/**
 * @author Odinga David
 * otienodavidodinga@gmail.com
 */
@Data
public class Candidate {
    private int id;
    private Voter voter;
    private int year;
    private Position position;
    private String description;
    private int votes;
}
