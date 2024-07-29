package ControllerCar;

import CarGear.Gear1;
import CarGear.Gear2;
import CarGear.Gear3;
import CarGear.gear;

public class Gear {
    public Gear(){
        //default
    }

   private gear shiftUp(){
       gear gear1 = new Gear1(gear.GEAR1);
       gear gear2 = new Gear2(gear.GEAR2);
       gear gear3 = new Gear3(gear.GEAR3);

       gear1.setNextGear(gear2);
       gear2.setNextGear(gear3);

       return gear1;
   }
   private gear shiftDown(){
       gear gear1 = new Gear1(gear.GEAR1);
       gear gear2 = new Gear2(gear.GEAR2);
       gear gear3 = new Gear3(gear.GEAR3);

       gear3.setNextGear(gear2);
       gear2.setNextGear(gear1);

       return gear2;
   }
   public void startShiftingUp (int gearLevel) {
       gear shift = shiftUp();
       shift.shiftGear(gearLevel);
   }
   public void startShiftingDown (int gearLevel) {
       gear shift = shiftDown();
       shift.shiftGear(gearLevel);
   }
}
