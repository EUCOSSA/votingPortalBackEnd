package com.eucossa.egerton.voting.model.voter;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Odinga David
 * otienodavidodinga@gmail.com
 */
@Data
@Entity
public class Voter {

    @Id()
    private String regNo;
    private String name;
    private boolean voted;
}
