public class View {
    // Text's constants
    public static final String INPUT_RAND = "Value : ";
    public static final String INPUT_MIN_DATA = "Input MIN value = ";
    public static final String INPUT_MAX_DATA = "Input MAX value = ";
    public static final String WRONG_INPUT_DATA =
            "Wrong input! Repeat please! ";
    public static final String OUR_INT = "INT value = ";
    public static final String SPACE = " - ";
    public static final String GO = "Let's started!";
    public static final String WRONG_RANGE_DATA = "You went beyond the limit. Try again.";
    public static final String HIGHER = "Your number is HIGHER";
    public static final String LESS = "Your number is LESS";
    public static final String EXIT = "exit";
    public static final String EXCEPTION = "Min argument can't be higher than Max. Try again.";
    public static final String MESSAGE_TO_EXIT = "Enter 'exit' If you want to exit";
    public static final String MESSAGE_TO_CONTINUE = "Enter anything If you want to continue";
    public static final String STATISTICS = "Your statistics: ";

    public void printMessage(String message){
        System.out.println(message);
    }

}
