public enum Size {
    S("S",10,15),M("M",20,25),L("L",30,35),
    XL("XL",40,45),XXL("XXL",50,55);
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

