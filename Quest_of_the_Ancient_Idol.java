/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest_of_the_ancient_idol;

import byui.cit260.Quest_of_the_Ancient_Idol.model.Actor;
import byui.cit260.Quest_of_the_Ancient_Idol.model.Player;

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
        
        playerOne.setName("Jones");
        playerOne.setBestTime(8.00);
        
        Actor.IndianaJones.getName();
        Actor.IndianaJones.getDescription();
        
        String playerOneName = playerOne.getName();
        double playerOneBestTime = playerOne.getBestTime();
        
        
        System.out.println(playerOne.toString());
        //System.out.println("Name = " + playerOneName + ", time = " + playerOneBestTime);
    }
    
    
    
}
