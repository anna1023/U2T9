public class TriangleRunner {
    public static void main (String[] args){
        Triangle triangle1 = new Triangle(3,4);
        Triangle triangle2 = new Triangle(6.5,10.7);
        Triangle triangle3 = new Triangle(12,12);
        double hypotenuse1 = triangle1.hypotenuse();
        double hypotenuse2 = triangle2.hypotenuse();
        double hypotenuse3 = triangle3.hypotenuse();
        System.out.println(hypotenuse1);
        System.out.println(hypotenuse2);
        System.out.println(hypotenuse3);
    }

}
