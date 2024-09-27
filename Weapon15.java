import java.util.Scanner;
public class Weapon15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean combat;
        int range;

        System.out.print("Is your combat close? (true/false): ");
        combat = sc.nextBoolean();

        if(combat || combat == false){
            System.out.print("Input your range (m): ");
            range = sc.nextInt();
            if(range >= 5){
                System.out.println("use ranged weapon");
            }else{
                System.out.println("use melee weapon");
            }
        }else{
             System.out.print("Please Choose your combat (close/ranged) ");
             System.out.print("Is your combat close? (true/false): ");
             combat = sc.nextBoolean();
    }
}

}

