package task2;

import java.util.ArrayList;

public class Services {
    private Model model;



    private static ArrayList arrayInt = new ArrayList();
    private static int rand_INT;

    Services(Model model){
        this.model = model;
        rand_INT = rand(model.getMinBarrier(), model.getMaxBarrier());
        model.setValue(rand_INT);
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

        return  (int) (Math.random() * (max-min)+1) + min;
    }

    public void minMax(int min, int max) {

        model.setMinBarrier(min);
        model.setMaxBarrier(max);
        setArrayInt();
        setRadnom();
    }

}
