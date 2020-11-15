package com.eucossa.egerton.voting.services.position;

import com.eucossa.egerton.voting.model.position.Position;
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
public class PositionService {

    private RepoManager repoManager;


    @Autowired
    public void setRepoManager(RepoManager repoManager) {
        this.repoManager = repoManager;
    }


    public Position savePosition(Position position) {
        if (positionNotAdded(position))
            return repoManager
            .getPositionRepo()
            .save(position);

        return null;
    }



    public List<Position> savePositions(List<Position> positions) {
        positions = positions
                .stream()
                .filter(this::positionNotAdded)
                .collect(Collectors.toList());

        return repoManager
                .getPositionRepo()
                .saveAll(positions);
    }


    private boolean positionNotAdded(Position position) {
        return !repoManager
                .getPositionRepo()
                .existsByName(position.getName());
    }
}
