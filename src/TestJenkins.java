import java.util.Random;

public class TestJenkins {
    public static void main(String[]args)
    {
        Random rand = new Random(); //instance of random class
        int num = 0;
        int upperbound = 25;

        //generate random values from 0-24
        num = rand.nextInt(upperbound);
        System.out.println("The random number is: "+num);
    }
}
