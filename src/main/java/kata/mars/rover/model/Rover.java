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
public abstract class Rover {
    
    Point coordinates;
    Planet planet;

    public Rover(Point coordinates, Planet planet) {
        this.coordinates = coordinates;
        this.planet = planet;
    }
    
    public abstract void moveForward();
    
    public abstract void moveBackward();
    
    public abstract Rover turnLeft();
    
    public abstract Rover turnRight();
    
    public abstract void validateIncreaseX();
    
    public abstract void validateIncreaseY();
    
    public abstract void validateDecreaseX();
    
    public abstract void validateDecreaseY();
}
