package ControllerCar;

public class AirConditioner {
    private int airAmount = 0;

    public AirConditioner(){
        //default
    }
    public void turnOnCondition(int amount){
        System.out.println("the car condition is on with "+ amount +" units");
    }
    public void turnOffCondition(){
        System.out.println("the car condition is off");
        airAmount--;
    }
    public void setAirAmount(int newAmount){
        airAmount = newAmount;
    }
    public void airUp(int upBy){
        airAmount += upBy;
    }
    public void airDown(int downBy){
       if (airAmount>0) airAmount -=downBy;
    }
    public int getAirAmount(){
        return airAmount;
    }
}
