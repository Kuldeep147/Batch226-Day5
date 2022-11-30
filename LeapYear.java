import java.util.Scanner;

public class LeapYear {
    int year;
    void leapYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check leap or not : ");
        year = sc.nextInt();
        if (year >= 1000 && year <= 9999){
            if (year%4 == 0 && year%100 != 0 || year%400 == 0 ){
                System.out.println(year+" is an Leap year");
            } else {
                System.out.println(year+" is not an Leap year");
            }
        }else {
            System.out.println("enter valid four digit year");
        }
    }
    public static void main(String[] args) {
        LeapYear ob = new LeapYear();
        ob.leapYear();
    }
}