/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.mars.rover;

import kata.mars.rover.model.Point;
import kata.mars.rover.model.Planet;

/**
 *
 * @author maramax
 */
public class RoverController {
    
    Rover rover;
    private final Planet planet;

    public RoverController(Point coordinates, Planet planet, char direction) {
        this.planet = planet;
        new Assert(validationObstacles(coordinates) && validationPosition(coordinates));
        start(coordinates, direction);   
        
    }

    public void start(Point coordinates, char direction) {
        switch (Character.toUpperCase(direction)) {
            case 'N':
                rover = new RoverNorth(coordinates, planet);
                break;
            case 'S':
                rover = new RoverSouth(coordinates, planet);
                break;
            case 'E':
                rover = new RoverEast(coordinates, planet);
                break;
            case 'W':
                rover = new RoverWest(coordinates, planet);
                break;
        }
    }
    
    public void moveForward() {
        rover.moveForward();
        limits();
    }
    
    public void moveBackward() {
        rover.moveBackward();
        limits();
    }
    
    public void turnLeft() {
        rover = rover.turnLeft();
        limits();
    }
    
    public void turnRight() {
        rover = rover.turnRight();
        limits();
    }
    
    public void limits() {
        rover.validateIncreaseX();
        rover.validateDecreaseX();
        rover.validateIncreaseY();
        rover.validateDecreaseY();
    }

    @Override
    public String toString() {
        return "RoverManager{" + "rover=" + rover + '}';
    }

    private boolean validationPosition(Point coordinates) {
        return planet.validateStartPositionRover(coordinates);
    }

    private boolean validationObstacles(Point coordinates) {
        return planet.validateObstacles(coordinates);
    }
    
}
