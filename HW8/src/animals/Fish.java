package animals;

import animals.Animal;

public abstract class Fish extends Animal {
    private int size;
    public Fish(int size){
        this.size=size;
    }
    public int getSize(){
        return size;
    }

    public String voice(){
        return "....";
    }

}