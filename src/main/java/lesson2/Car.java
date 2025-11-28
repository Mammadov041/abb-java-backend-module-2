package lesson2;

public class Car {
    double speed;
    int gear;

    public Car(double speed,int gear){
        this.gear = gear;
        this.speed = speed;
    }

    public double getSpeed(){
        return this.speed;
    }

    public int getGear(){
        return  this.gear;
    }

    @Override
    public String toString() {
        return String.format("Car{speed=%f;gear=%d}",this.speed,this.gear);
    }

    public static String changeGear(int gear) {
        if(gear == 1){
            return "1";
        }
        if(gear == 2){
            return "2";
        }
        if(gear == 3 || gear == 4 || gear == 5){
            throw new IllegalArgumentException("Can not drive with 3 or 4 or 5");
        }
        return "no";
    }

}
