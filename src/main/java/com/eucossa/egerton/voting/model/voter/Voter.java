package com.eucossa.egerton.voting.model.voter;

import lombok.Data;

/**
 * @author Odinga David
 * otienodavidodinga@gmail.com
 */
@Data
public class Voter {
    private int id;
    private String regNo;
    private String name;
    private boolean voted;
}
