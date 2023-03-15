public enum Size {
    S("S",10,10),M("M",15,15),L("L",20,20),
    XL("XL",25,25),XXL("XXL",30,30);
    private String name;
    private double width;
    private double length;

    Size(String name, double width, double length){
        this.name=name;
        this.width=width;
        this.length=length;
    }
    public String getName(){
        return name;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }

}

