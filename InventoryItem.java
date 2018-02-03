/**
 *
 * @author Colby
 */
package quest_of_the_ancient_idol;

import java.io.Serializable;
import java.util.Objects;
public class InventoryItem implements Serializable {
    
    private String itemType;
    private int itemAmmount;

    private Game game;
    private ArrayList<ResourceScene> resourceScene = new ArrayList<ResourceScene>();
    
    public InventoryItem() {
    }
    
    public Game getGame(){
        return game;
    }
    public void setGame(Game game){
        this.game = game;
    }
    
    public ArrayList<ResourceScene> getScene(){
        return scene;
    }
    public void setScene(ArrayList<ResourceScene> scene){
        this.scene = scene;
    }
    
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemAmmount() {
        return itemAmmount;
    }

    public void setItemAmmount(int itemAmmount) {
        this.itemAmmount = itemAmmount;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.itemType);
        hash = 97 * hash + this.itemAmmount;
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "itemType=" + itemType + ", itemAmmount=" + itemAmmount + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryItem other = (InventoryItem) obj;
        if (this.itemAmmount != other.itemAmmount) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }
    
    
    
}
