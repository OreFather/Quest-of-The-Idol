/**
 *
 * @author Colby
 */
package quest_of_the_ancient_idol;

import java.io.Serializable;
import java.util.Objects;

public class RegularSceneType implements Serializable {
    private String description;
    private boolean blocked;
    private String symbol;

    public RegularSceneType() {
    }
    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.description);
        hash = 43 * hash + (this.blocked ? 1 : 0);
        hash = 43 * hash + Objects.hashCode(this.symbol);
        return hash;
    }

    @Override
    public String toString() {
        return "RegularSceneType{" + "description=" + description + ", blocked=" + blocked + ", symbol=" + symbol + '}';
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
        final RegularSceneType other = (RegularSceneType) obj;
        if (this.blocked != other.blocked) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        return true;
    }

    

}
