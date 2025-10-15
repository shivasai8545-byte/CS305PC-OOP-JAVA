import java.util.Scanner;
import java.util.InputMismatchException;
public class Solution {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            try{
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.print(x/y);
            }catch(InputMismatchException ie){
                System.out.println(ie.getClass().getName());
            }
            catch(ArithmeticException ae){
                System.out.println(ae.getClass().getName()+": " + ae.getMessage());
            }
              
    }
}

