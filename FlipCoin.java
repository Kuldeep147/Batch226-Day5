import java.util.Scanner;

public class FlipCoin {
    double heads;
    double tails;
    int num;
    double flip;
    double percentageHeads;
    double percentageTails;
    public void Coin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer number : ");
        num = sc.nextInt();
        for(int i = 0; i < num; i++){
            flip = Math.random();
            if (flip > 0.5){
                heads++;
            }else {
                tails++;
            }
        }
        percentageHeads = (heads/num)*100;
        percentageTails = (tails/num)*100;
        System.out.println("percentage of heads is "+percentageHeads +" and percentage of tails is "+percentageTails);
    }

    public static void main(String[] args) {
        FlipCoin ob = new FlipCoin();
        ob.Coin();
    }
}