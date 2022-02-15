import java.util.Scanner;
public class snakeEyes {
    public static int playDie(int numFaces) {
        int result;
        result = (int) (Math.random() * numFaces) + 1;
        return result;

    }
    public static int rollDie(int numRolls)
    {
        int D1, D2, D3, D4, D5, D6;
        int SnakeEyes = 0;
        for(int i = 0; i<=numRolls; i++)
        {
            D1 = playDie(6);
            D2 = playDie(6);
            D3 = playDie(6);
            D4 = playDie(6);
            D5 = playDie(6);
            D6 = playDie(6);
            int sum=D1+D2+D3+D4+D5+D6;
            if(sum == 6) {
                ++SnakeEyes;
            }
        }
        return SnakeEyes;
    }

    public static void main(String[] args) {
        int D1, D2, D3, D4, D5, D6;
        int snakeEyes100;
        int snakeEyes1000;
        int snakeEyes10000;
        int snakeEyes100000;
        System.out.println("Welcome to the dice roller!");
        System.out.println( "I am going to count how many snake Eyes you get in a certain amount of rolls," );
        System.out.println( "we will be rolling 6, 6 sided die! have fun!");
        snakeEyes100 = rollDie(100);
        snakeEyes1000 = rollDie(1000);
        snakeEyes10000 = rollDie(10000);
        snakeEyes100000= rollDie(100000);

        System.out.println("100: "+ snakeEyes100+ " snake eyes");
        System.out.println("1000: "+ snakeEyes1000+ " snake eyes");
        System.out.println("10000: "+ snakeEyes10000+ " snake eyes");
        System.out.println("100000: "+ snakeEyes100000+ " snake eyes");



        /*
        int D1;
        int D2;
        int D3;
        int D4;
        int D5;
        int D6;
        int snakeEyes = 0;
        Scanner scan = new Scanner((System.in));
        System.out.println("How many times would you like to roll?");
        int num = scan.nextInt();
        scan.close();

        System.out.println("the number entered by the user: "+num);
        for (int i = 0; i<=num; i++)
        {
            D1 = (int)(Math.random()*6+1);
            D2 = (int)(Math.random()*6+1);
            D3 = (int)(Math.random()*6+1);
            D4 = (int)(Math.random()*6+1);
            D5 = (int)(Math.random()*6+1);
            D6 = (int)(Math.random()*6+1);
            int sum = D1+D2+D3+D4+D5+D6;

            if(sum == 6)
                ++snakeEyes;
        }
        System.out.println("the amount of snake eyes thrown is: "+snakeEyes);
    }
 */

    }
}