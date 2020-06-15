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
public abstract class Rover {
    
    Point coordinates;
    Planet planet;

    public Rover(Point coordinates, Planet planet) {
        this.coordinates = coordinates;
        this.planet = planet;
    }
    
    abstract void moveForward();
    
    abstract void moveBackward();
    
    abstract Rover turnLeft();
    
    abstract Rover turnRight();
    
    abstract void validateIncreaseX();
    
    abstract void validateIncreaseY();
    
    abstract void validateDecreaseX();
    
    abstract void validateDecreaseY();
}
