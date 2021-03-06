package task2;

import java.util.Scanner;

public class Controller {
    private Services services;
    private View view;
    private Model model;

    public Controller(Model model, Services services, View view) {
        this.model = model;
        this.services = services;
        this.view = view;
    }

    public void proc(){
        Scanner sc = new Scanner(System.in);
        view.printMessage(View.GO);
        view.printMessage(model.getMinBarrier() + View.SPACE + model.getMaxBarrier());
        wrongInput(sc);
        while (true) {
            view.printMessage(View.MESSAGE_TO_EXIT);
            view.printMessage(View.MESSAGE_TO_CONTINUE);
            if (sc.next().equals(View.EXIT)) {
                break;
            }

            inputMinMax(sc);
            view.printMessage(View.GO);
            wrongInput(sc);

        }
    }

    public void wrongInput(Scanner sc){
        int res;
        while (true) {
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_DATA
                        + View.INPUT_RAND);
                sc.next();
            }

            res = Integer.parseInt(sc.next());

            while (services.testOnCorrectValue(res)){
                view.printMessage(View.WRONG_RANGE_DATA);
                res = Integer.parseInt(sc.next());

            }

            if (res == services.getRand_INT()) {
                view.printMessage(View.STATISTICS + services.getArrayInt());
                break;

            } else if (services.higherOrLess(res)) {
                System.out.println("KEK" + services.getRand_INT());

                view.printMessage(View.LESS);
            } else {
                System.out.println("KEK" + services.getRand_INT());
                view.printMessage(View.HIGHER);
            }
        }
    }


    private void inputMinMax(Scanner sc) {
        view.printMessage(View.INPUT_MIN_DATA);

        while (!sc.hasNextInt()) {
            view.printMessage(View.NOT_NUM);
            sc.next();
        }
        int min = Integer.parseInt(sc.next());

        view.printMessage(View.INPUT_MAX_DATA);

        while (!sc.hasNextInt()) {
            view.printMessage(View.NOT_NUM);
            sc.next();
        }
        int max = Integer.parseInt(sc.next());

        services.minMax(min, max);

        view.printMessage(model.getMinBarrier() + View.SPACE + model.getMaxBarrier());

    }

}
