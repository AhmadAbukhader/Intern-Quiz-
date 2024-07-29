import ControllerHome.ControlHome;
import java.util.List;
import java.util.ArrayList;


public class FacadeDemo {
    public static void main(String[] args) {
        MainController controller = new MainController();

        controller.goOutSetup();
        System.out.println(" ");
        controller.driving();
        System.out.println(" ");
        controller.backHome();

    }
}
