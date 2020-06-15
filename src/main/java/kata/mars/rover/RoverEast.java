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
public class RoverEast extends Rover {

    public RoverEast(Point coordinates, Planet planet) {
        super(coordinates, planet);
    }
    
    @Override
    public void moveForward() {
        coordinates.increaseX();
    }

    @Override
    public void moveBackward() {
        coordinates.decreaseX();
    }

    @Override
    public Rover turnLeft() {
        return new RoverNorth(coordinates, planet);
    }

    @Override
    public Rover turnRight() {
        return new RoverSouth(coordinates, planet);
    }

    @Override
    public String toString() {
        return "RoverEast{" + "coordinates=" + coordinates + '}';
    }

    @Override
    void validateIncreaseX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void validateIncreaseY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void validateDecreaseX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void validateDecreaseY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
