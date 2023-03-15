package animals;

import animals.Animal;

public abstract class Mammals extends Animal {
    String name;
    int age;
     public Mammals(String name, int age){
         this.name=name;
         this.age=age;
     }
     public int getAge(){
         return age;
     }
    public String getName(){
        return name;
    }
    public String voice() {
        return "Some voice";
    }
    public String getInfo(){
        return "Type of animals - " + getName() + "\nAge - " + getAge();
    }
}
