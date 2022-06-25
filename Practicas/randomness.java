package Practicas;
import java.util.Random;
public class randomness{
    public static void main(String[]args){
        Random rn = new Random();
        int z =rn.nextInt(6)+1;
        boolean bool= rn.nextBoolean();
        System.out.println(bool+""+z);
    }
    


}