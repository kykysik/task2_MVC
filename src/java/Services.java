package java;

import java.util.ArrayList;

public class Services {
    private Model model = new Model();
    int defMin;
    int defMax;


    private static ArrayList arrayInt = new ArrayList();
    private static int rand_INT;

    Services(){
        rand_INT = rand(model.getMinBarrier(), model.getMaxBarrier());
        model.setValue(rand_INT);
        defMin = model.getMinBarrier();
        defMax = model.getMaxBarrier();
    }

    public void setRadnom(){
        rand_INT = rand(model.getMinBarrier(), model.getMaxBarrier());
        model.setValue(rand_INT);
    }
    public ArrayList getArrayInt() {
        return arrayInt;
    }

    public ArrayList setArrayInt() {
        return arrayInt = new ArrayList();
    }


    public boolean testOnCorrectValue(int res) {

        if(res == getRand_INT()){
            arrayInt.add(res);
        }

        if ( res < model.getMinBarrier() ||
                res > model.getMaxBarrier()) {
            arrayInt.add(res);

            return true;
        }


        return false;
    }

    public  int getRand_INT() {

        return rand_INT;
    }

    public boolean higherOrLess(int res){

        arrayInt.add(res);

        if(res > rand_INT){
            return false;
        }else  {
            return true;
        }
    }

    public int rand(int min, int max) {

        return  (int) (Math.random() * ++max) + min;
    }

    public void minMax(int min, int max) {

        model.setMinBarrier(min);
        model.setMaxBarrier(max);

        defMin = model.getMinBarrier();
        defMax = model.getMaxBarrier();
        setArrayInt();
        setRadnom();
        rand_INT = rand(model.getMinBarrier(), model.getMaxBarrier());
        model.setValue(rand_INT);
    }

}
