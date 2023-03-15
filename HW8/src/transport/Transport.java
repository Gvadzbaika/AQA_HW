package transport;

public abstract class Transport {
     private int speed;
     String color;
     String name;
     public Transport(int speed, String color, String name){
         this.name=name;
         this.color=color;
         this.speed=speed;
     }
    public double getSpeed(){
        return speed;
    }
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }

    public String getInfo(){
        return "Type of transport - " + getName() + "\nSpeed - " + getSpeed() + "\nColor - " + getColor();
    }
}
