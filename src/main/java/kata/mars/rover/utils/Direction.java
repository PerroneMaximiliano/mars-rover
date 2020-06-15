/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.mars.rover.utils;

/**
 *
 * @author maramax
 */
public enum Direction {
    NORTH('N'),
    SOUTH('S'),
    EAST('E'),
    WEST('W');
    
    private char value;
    
    private Direction(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
