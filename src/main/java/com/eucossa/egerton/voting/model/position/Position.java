package com.eucossa.egerton.voting.model.position;

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
public class Position {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;
    private String name;
}
