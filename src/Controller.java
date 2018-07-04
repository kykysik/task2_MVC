
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private ArrayList arrayInt;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    //Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        view.printMessage(View.GO);
        model.setMinBarrier(0);
        model.setMaxBarrier(100);
        model.setValue(inputIntValueWithScannerAndDiapason(sc));
        view.printMessage(View.OUR_INT + model.getValue());
        view.printMessage(View.STATISTICS + Arrays.asList(arrayInt));

        while (true){
            view.printMessage(View.MESSAGE_TO_EXIT);
            view.printMessage(View.MESSAGE_TO_CONTINUE);

            if(sc.next().equals(View.EXIT)){
                break;
            }
            view.printMessage(View.GO);
            view.printMessage(View.INPUT_MIN_DATA);
            int min = sc.nextInt();
            view.printMessage(View.INPUT_MAX_DATA);
            int max = sc.nextInt();
            model.setMinBarrier(min);
            model.setMaxBarrier(max);
            model.setValue(inputIntValueWithScannerAndDiapason(sc));
            view.printMessage(View.OUR_INT + model.getValue());
            view.printMessage(View.STATISTICS + Arrays.asList(arrayInt));
        }
    }
    // The Utility methods
    public int rand(int min, int max) {

        return  (int) (Math.random() * ++max) + min;
    }

    public int inputIntValueWithScannerAndDiapason(Scanner sc) {
        int res=0;
        arrayInt = new ArrayList();
        int rand_INT = rand(model.getMinBarrier(), model.getMaxBarrier());

        view.printMessage(View.INPUT_RAND +
                model.getMinBarrier()+ View.SPACE + model.getMaxBarrier());

        while( true ) {
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_DATA
                        + View.INPUT_RAND);
                arrayInt.add(sc.next());
            }

            if ( (res = Integer.parseInt(sc.next())) < model.getMinBarrier() ||
                    res > model.getMaxBarrier()) {
                arrayInt.add(res);
                view.printMessage(View.WRONG_RANGE_DATA
                        + View.INPUT_RAND);
                continue ;
            }

            arrayInt.add(res);
            if(res > rand_INT){
                view.printMessage(View.BIG);
            } else if (res < rand_INT) {
                view.printMessage(View.LESS);
            }else {
                break;
            }
        }
        return res;
    }
}
