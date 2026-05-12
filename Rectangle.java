import java.util.Scanner;


public class Rectangle {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            int length = 0; //in meters
            int width = 0; //in meters
            int area = 0;
            int perimeter = 0; 

            System.out.print("The length of the Garden: ");
            length = scanner.nextInt();

            System.out.print("The width of the Garden: ");
            width = scanner.nextInt();

            area = length * width; //in sqaure meters
            perimeter = 2 * (length + width);

            System.out.println("The Area of the Garden is " +  area + " square meters");
            System.out.println("The Perimeter of the Garden is " + perimeter + " meters");
        }



    }
}
