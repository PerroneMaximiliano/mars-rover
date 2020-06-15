/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.mars.rover.view;

import java.util.ArrayList;
import java.util.List;
import kata.mars.rover.controller.RoverController;
import kata.mars.rover.model.Point;
import kata.mars.rover.model.Planet;

/**
 *
 * @author maramax
 */
public class ConsoleView {

    public static void main(String[] args) {
        List<Point> obstacles = new ArrayList<>();
        obstacles.add(new Point(2, 2));
        Planet planet = new Planet(5, 5, obstacles);
        RoverController controller = new RoverController(new Point(2, 7), planet, 'n');
        controller.moveForward();
        controller.moveForward();
        System.out.println(controller);
    }
}
