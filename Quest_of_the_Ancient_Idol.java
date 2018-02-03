/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest_of_the_ancient_idol;

import byui.cit260.Quest_of_the_Ancient_Idol.model.Actor;
import byui.cit260.Quest_of_the_Ancient_Idol.model.Location;
import byui.cit260.Quest_of_the_Ancient_Idol.model.Map;
import byui.cit260.Quest_of_the_Ancient_Idol.model.Player;
import byui.cit260.Quest_of_the_Ancient_Idol.model.RegularSceneType;

/**
 *
 * @author maxwell
 */
public class Quest_of_the_Ancient_Idol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        Location locationOne = new Location();
        Map mapOne = new Map();
        RegularSceneType regScType = new RegularSceneType();
        
        playerOne.setName("Mr. Jones");
        playerOne.setBestTime(8.00);
        locationOne.setColumn(5);
        locationOne.setRow(10);
        //mapOne.setLocation();
        mapOne.setDescription("This room is where the booby traps are!");
        
        
        
        Actor.IndianaJones.getName();
        String actOne = Actor.IndianaJones.getDescription();
        
        String actTwo = Actor.IndianaJones.getName();
        
        String playerOneName = playerOne.getName();
        double playerOneBestTime = playerOne.getBestTime();
        int locationOneColumn = locationOne.getColumn();
        int locationOneRow = locationOne.getRow();
        String mapOneDescription = mapOne.getDescription();
        String regScTypeDescription = regScType.getDescription();
        
        
        String playerOneActor = playerOne.getName();
        
        
        System.out.println(playerOne.toString());
        System.out.println(actTwo.toString() + "\n" + actOne.toString() + "\n" + mapOne.toString() + "\n" + regScType.toString());
        //System.out.println(actOne.toString());
        //System.out.println("Name = " + playerOneName + ", time = " + playerOneBestTime);
        System.out.println("Column = " + locationOneColumn + ", Row = " + locationOneRow);
    }
    
    
    
}
