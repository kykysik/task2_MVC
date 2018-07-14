package task2;

public class Main {
    public static void main(String[] args) {
        // Initialization
        View view = new View();
        Model model = new Model();
        Services services = new Services(model);
        Controller controller = new Controller(model, services, view);
        // Run
        controller.proc();

    }
}
