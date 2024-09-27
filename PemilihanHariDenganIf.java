import java.util.Scanner;
public class PemilihanHariDenganIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int numbers;

        System.out.print("Enter your number : ");
        numbers = sc.nextInt();

        if(numbers >= 1 && numbers <= 5){
            System.out.println("Weekday");
        }else if(numbers == 6 || numbers == 7){
            System.out.println("Weekend");
        }else{
            System.out.println("Invalid number");
        }

    }
}