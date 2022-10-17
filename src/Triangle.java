public class Triangle {
    private double base;
    private double height;

    public Triangle (double base,double height){
        this.base = base;
        this.height = height;
    }
    public double hypotenuse (){
        double a = Math.pow(base,2);
        double b = Math.pow(height,2);
        double c = Math.sqrt(a+b);
        return c;
    }
}
