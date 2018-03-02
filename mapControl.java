

/**
 *
 * @author Colby
 */
package byui.cit260.Quest_of_the_Ancient_Idol.model;

public class mapControl {
    
    
    public static void changeLocation(int pos1, int pos2){
        if(validLocation(pos2)){
        playerlocation pos1 = pos2;
    }
    }
    public static boolean validLocation(int pos2){
        if(pos2 == rooms.get(pos2)){
            return true;
        }
    }
    
}
