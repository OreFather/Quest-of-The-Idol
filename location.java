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
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.column;
        hash = 37 * hash + this.row;
        hash = 37 * hash + (this.visited ? 1 : 0);
        hash = 37 * hash + this.amountRemaining;
        return hash;
    }

    public Location() {
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
        final Location other = (Location) obj;
        if (this.column != other.column) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.amountRemaining != other.amountRemaining) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "column=" + column + ", row=" + row + ", visited=" + visited + ", amountRemaining=" + amountRemaining + '}';
    }



}