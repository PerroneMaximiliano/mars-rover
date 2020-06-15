/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.mars.rover;

/**
 *
 * @author maramax
 */
public class Assert {
    
    public Assert(boolean predondition) {
        if (!predondition) {
            System.exit(0);
        }
    }
}
