import ControllerCar.ControlCar;
import ControllerHome.ControlHome;

public class MainController {
    private ControlCar carController;
    private ControlHome homeController;

    public MainController(){
        carController = new ControlCar();
        homeController = new ControlHome();
    }

    public void goOutSetup(){
        homeController.turnOffLight();
        homeController.alarmReady();
        carController.startingCarSetup();
    }
    public void backHome(){
        carController.turnOffCar();
        homeController.welcoming();
        homeController.turnOnLight();
    }
    public void driving(){
        carController.startingCarSetup();
        carController.speedUp(1);
        carController.slowDown(3);
        carController.turnOffCar();
    }

}
