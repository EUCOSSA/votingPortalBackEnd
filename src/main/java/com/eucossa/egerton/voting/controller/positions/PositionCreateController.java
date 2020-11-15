package com.eucossa.egerton.voting.controller.positions;

import com.eucossa.egerton.voting.model.position.Position;
import com.eucossa.egerton.voting.services.ServicesManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Odinga David
 * otienodavidodinga@gmail.com
 */

@RestController
@RequestMapping(path = "api/v1/position/add/")
public class PositionCreateController {

    private ServicesManager servicesManager;

    @Autowired
    public void setServicesManager(ServicesManager servicesManager) {
        this.servicesManager = servicesManager;
    }

    @PostMapping
    public ResponseEntity<?> addPosition(@RequestBody Position position) {
        Position position1 =  servicesManager.getPositionService().savePosition(position);
        return new ResponseEntity<>(position1, HttpStatus.CREATED);
    }
}
