package java;

public class Main {
    public static void main(String[] args) {
        // Initialization
        Services services = new Services();
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, services, view);
        // Run
        controller.proc();

    }
}
