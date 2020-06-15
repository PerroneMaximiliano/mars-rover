/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.mars.rover.model;

import java.util.List;

/**
 *
 * @author maramax
 */
public class Planet {
    
    private final int width;
    
    private final int height;
    
    private final List<Point> obstacles;

    public Planet(int width, int height, List<Point> obstacles) {
        this.width = width;
        this.height = height;
        this.obstacles = obstacles;
    }

    public List<Point> getObstacles() {
        return obstacles;
    }
    
    public boolean validateStartPositionRover(Point coordinates) {
        if (coordinates.getX() > width || coordinates.getY() > height) {
            return false;
        }
        return true;
    }

    public boolean validateObstacles(Point coordinates) {
        for (Point obst : getObstacles()) {
            if (obst.getX() == coordinates.getX() && obst.getY() == coordinates.getY()) {
                return false;
            }
        }
        return true;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
