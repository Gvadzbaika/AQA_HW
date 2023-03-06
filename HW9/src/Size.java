public enum Size {
    S("S"),M("M"),L("L"),XL("XL"),XXL("XXL");
    private String name;
    private double width;
    private double length;

    Size(String name){
        this.name=name;
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
