/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.Quest_of_the_Ancient_Idol.model;

import java.awt.Point;
/**
 *
 * @author maxwell
 */
public enum Actor {
    
    IndianaJones("Mr.Jones","He is the main character in this adventurous game", new Point(1,1));
    
    private String name;
    private String description;
    private Point coordinates;

    Actor(String name, String description, Point coordinates) {
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }
    
    
}
