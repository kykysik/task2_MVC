public class Model {
    private int value;
    private int min;
    private int max;

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
        return max;
    }

    public void setMaxBarrier(int max) {
        this.max = max;
    }
}
