package com.eucossa.egerton.voting.repository;

import com.eucossa.egerton.voting.model.position.Position;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Odinga David
 * otienodavidodinga@gmail.com
 */
public interface PositionRepo extends JpaRepository<Position, Integer> {

    boolean existsByName(String name);
}
