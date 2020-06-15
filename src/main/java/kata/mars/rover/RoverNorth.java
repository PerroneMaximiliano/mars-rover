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
public class RoverNorth extends Rover {

    public RoverNorth(Point coordinates, Planet planet) {
        super(coordinates, planet);
    }

    @Override
    public void moveForward() {
        coordinates.increaseY();
    }

    @Override
    public void moveBackward() {
        coordinates.decreaseY();
    }

    @Override
    public Rover turnLeft() {
        return new RoverWest(coordinates, planet);
    }

    @Override
    public Rover turnRight() {
        return new RoverEast(coordinates, planet);
    }
    
    @Override
    public String toString() {
        return "RoverNorth{" + "coordinates=" + coordinates + '}';
    }

    @Override
    public void validateIncreaseX() {
        if (coordinates.getX() > planet.getWidth()) {
            coordinates.setX(1);
        }
    }

    @Override
    public void validateIncreaseY() {
        if (coordinates.getY() > planet.getHeight()) {
            coordinates.setY(1);
        }
    }

    @Override
    void validateDecreaseX() {
        
    }

    @Override
    void validateDecreaseY() {
        
    }
    
}
