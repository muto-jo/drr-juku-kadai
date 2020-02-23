package jig.tutorial.domain.model.days;

/**
 * 貸出可能数
 */
public class LendingCount {
    private int value;

    public int getValue(){
        return value;
    }

    public LendingCount(int value){
        this.value = value;
    }
}