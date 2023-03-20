package week1;

public class Week1 {
    
    // This is the main method, here we the begin program execution.....
    public static void main(String[] args) {
        int radius = 11235; // radius = yarıçap
        double pi = 3.1415;
        double area = pi * radius * radius; // pi x radius^2 / 3.1415 * 12 * 12
        double circumference = 2 * pi * radius; // 2pixr / 2 * 3.1415 * 12 / çember çevre
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
        
        int lenght = 10;
        int width = 3;
        int rectangleArea = lenght * width; // dikdörtgen alanı = boy * en
        int rectanglePerimeter = 2 * (lenght + width); // dikdörtgen çevresi = 2 * (en + boy)
        System.out.println("Area of rectangle: " + rectangleArea);
        System.out.println("Perimeter of rectangle: " + rectanglePerimeter);
        
        int a1 = 10;
        int a2 = 16;
        int a3 = 23;
        double sum = a1 + a2 + a3;
        double average = sum / 3;
        //double average = a1 + a2 + a3 / 3.0; // WRONG
        System.out.println(average);
    }
}