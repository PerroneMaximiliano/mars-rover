/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.mars.rover.model;

/**
 *
 * @author maramax
 */
public class RoverWest extends Rover {
    
    public RoverWest(Point coordinates, Planet planet) {
        super(coordinates, planet);
    }
    @Override
    public void moveForward() {
        coordinates.decreaseX();
    }

    @Override
    public void moveBackward() {
        coordinates.increaseX();
    }

    @Override
    public Rover turnLeft() {
        return new RoverSouth(coordinates, planet);
    }

    @Override
    public Rover turnRight() {
        return new RoverNorth(coordinates, planet);
    }

    @Override
    public String toString() {
        return "RoverWest{" + "coordinates=" + coordinates + '}';
    }

    @Override
    public void validateIncreaseX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validateIncreaseY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validateDecreaseX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validateDecreaseY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
