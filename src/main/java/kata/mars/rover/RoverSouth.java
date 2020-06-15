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
public class RoverSouth extends Rover {

    public RoverSouth(Point coordinates, Planet planet) {
        super(coordinates, planet);
    }
    

    @Override
    public void moveForward() {
        coordinates.decreaseY();
    }

    @Override
    public void moveBackward() {
        coordinates.increaseY();
    }

    @Override
    public Rover turnLeft() {
        return new RoverEast(coordinates, planet);
    }

    @Override
    public Rover turnRight() {
        return new RoverWest(coordinates, planet);
    }

    @Override
    public String toString() {
        return "RoverSouth{" + "coordinates=" + coordinates + '}';
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
