package Quest_of_the_Ancient_Idol

import java.io.Serializable;


public class trapscene implements Serializable {
 
private String trapType;
private boolean trapTriggered;

private String getTrapType(){
    return trapType;
}

private void setTrapType(String trapType) {
    this.trapType = trapType;
}

private boolean getTrapTriggered(){
    return trapTriggered;
}

private void setTrapTriggered (){
    this.trapTriggered = trapTriggered;
}
}