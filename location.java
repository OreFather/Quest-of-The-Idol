package Quest_of_the_Ancient_Idol

import java.io.Serializable;


public class location implements Serializable {
 
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
return getVisited;
}
public void setVisited(boolean visited) {
this.visited = visited;
}

}