package ControllerCar;

public class ControlCar {
    private Engine V8;
    private AirConditioner conditioner;
    private CarLights lights ;
    private Gear Dsg;

    public ControlCar (){
        V8 = new Engine();
        conditioner = new AirConditioner();
        lights = new CarLights();
        Dsg = new Gear();
    }
    public void startingCarSetup(){
        V8.startEngine();
        conditioner.turnOnCondition(1);
        lights.turnOnLights();
    }
    public void turnOffCar(){
        conditioner.turnOffCondition();
        V8.turnOffEngine();
        lights.turnOffLights();
    }
    public void speedUp (int gearLevel) {
        Dsg.startShiftingUp(gearLevel);
    }
    public void slowDown (int gearLevel) {
        Dsg.startShiftingDown(gearLevel);
    }

}
