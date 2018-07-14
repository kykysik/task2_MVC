package task2;

import java.io.Serializable;

public class Model implements Serializable {
    private int value;
    private int min = 0;
    private int MAX_RAND = 100;

    Model(){
        super();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMinBarrier(){
        return min;
    }

    public void setMinBarrier(int min) {
        this.min = min;
    }

    public int getMaxBarrier() {
        return MAX_RAND;
    }

    public void setMaxBarrier(int max) {
        this.MAX_RAND = max;
    }
}
