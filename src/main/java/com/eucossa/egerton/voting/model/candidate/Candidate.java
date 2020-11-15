package com.eucossa.egerton.voting.model.candidate;

import com.eucossa.egerton.voting.model.position.Position;
import com.eucossa.egerton.voting.model.voter.Voter;
import lombok.Data;

import javax.persistence.*;

/**
 * @author Odinga David
 * otienodavidodinga@gmail.com
 */
@Data
@Entity
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @OneToOne
    private Voter voter;
    private int year;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Position position;
    private String description;
    private int votes;
}
