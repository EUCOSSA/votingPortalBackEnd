package com.eucossa.egerton.voting.controller.positions;

import com.eucossa.egerton.voting.model.position.Position;
import com.eucossa.egerton.voting.services.ServicesManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Odinga David
 * otienodavidodinga@gmail.com
 */

@RestController
@RequestMapping(path = "/api/v1/positions")
public class PositionViewController {

    private ServicesManager servicesManager;

    @Autowired
    public void setServicesManager(ServicesManager servicesManager) {
        this.servicesManager = servicesManager;
    }

    @GetMapping
    public List<Position> viewPositions() {

        return servicesManager
                .getPositionService()
                .getPositions();
    }

    @GetMapping("/{id}")
    public Position viewCaPosition(@PathVariable int id) {

        return servicesManager
                .getPositionService()
                .getPosition(id);
    }
}
