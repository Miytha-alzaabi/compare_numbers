import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Please Enter Your First Number:");
        int numb1 = read.nextInt();
        System.out.println("Please Enter Your 2nd Number:");
        int numb2 = read.nextInt();
        System.out.println("Please Enter Your 3rd Number:");
        int numb3 = read.nextInt();
        if(numb1 > numb2 && numb1 > numb3){
            System.out.println("The First Number is Larger Than Others");
        }else if(numb2 > numb3 && numb2 > numb3){
            System.out.println("The Second Number is Larger Than Others");
        }else{
           System.out.println("The Third Number is Larger Than Others");
        }
    }
}