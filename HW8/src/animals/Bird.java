package animals;

import animals.Animal;

public abstract class Bird extends Animal {
   private String name;
   private String color;
    public Bird(String name, String color){
        this.name=name;
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }

    public String voice(){
        return "some strange sound";
    }

    public String getInfo(){
        return "Type of animals - " + getName() + "\nColor - " + getColor();
    }
}
