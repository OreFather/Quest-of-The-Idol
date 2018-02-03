package Quest_of_the_Ancient_Idol;

import java.io.Serializable;

public class resourcescene implements Serializable {
 
private String itemType;
private int amount;

private String getItemType() {
    return itemType;
}
private void setItemType(String itemType){
    this.itemType = itemType;
}
private int getAmount() {
    return amount;
}
private void setAmount(int amount) {
    this.amount = amount;
}

 }