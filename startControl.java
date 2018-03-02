/**
 *
 * @author Colby
 */

package byui.cit260.Quest_of_the_Ancient_Idol.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import modelLayer.Player;
import controlLayer.GameControl;

public class startControl {
    
    
    
    public static void startNewGame(){
       
}
    public static void quitGame() {
        System.exit(0);
    }

    public static Game loadSavedGame(String player){
    
        
        return Game;
    }

    private static class Game {

        public Game() {
            
        }
    }
    
    
    public static String help() throws FileNotFoundException, IOException{
       BufferedReader br = new BufferedReader(new FileReader("help.txt"));
try {
    StringBuilder sb = new StringBuilder();
    String line = br.readLine();

    while (line != null) {
        sb.append(line);
        sb.append(System.lineSeparator());
        line = br.readLine();
    }
    String everything = sb.toString();
} finally {
    br.close();
}
        return null;
    }
    
    
    
    
    public static String options() throws FileNotFoundException, IOException{
       BufferedReader br = new BufferedReader(new FileReader("options.txt"));
try {
    StringBuilder sb = new StringBuilder();
    String line = br.readLine();

    while (line != null) {
        sb.append(line);
        sb.append(System.lineSeparator());
        line = br.readLine();
    }
    String everything = sb.toString();
} finally {
    br.close();
}
        return null;
    }
    
    
    public static void exit(){
        GameControl.save();
        System.exit(0);
    }
}
