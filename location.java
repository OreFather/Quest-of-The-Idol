//package Quest_of_the_Ancient_Idol
package byui.cit260.Quest_of_the_Ancient_Idol.model;


import java.io.Serializable;


public class Location implements Serializable {
 
    private int column;
    private int row;
    private boolean visited;
    private int amountRemaining;

  public int getColumn() {
    return column;
    }
 public void setColumn(int column) {
    this.column = column;
}
public int getRow() {
    return row;
}
public void setRow(int row){
    this.row = row;
}
public  boolean getVisited(){
return visited;
}
public void setVisited(boolean visited) {
this.visited = visited;
}
@Override
public String toString(){
    return "location{" + "location=" + location + ", column" + column + ", row" + row"}";
}

@Override
public int hashCode(){
    
}
}