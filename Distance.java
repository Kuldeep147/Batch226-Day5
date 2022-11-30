import java.util.Scanner;

public class Distance {
    int x;
    int y;
    double dist;
    void distance(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate : ");
        x = sc.nextInt();
        System.out.println("Enter y coordinate : ");
        y = sc.nextInt();
        dist = Math.sqrt(x * x + y * y);
        System.out.println(" Distance between point and origin : "+dist);
    }
    public static void main(String[] args) {
        Distance ob = new Distance();
        ob.distance();
    }
}