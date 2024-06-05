import java.util.Scanner;

public class AgeValidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();
        
        boolean drivingUnderAge = false;
        
        if (idade <= 18) {
            drivingUnderAge = true;
        }
        
        System.out.println("drivingUnderAge: " + drivingUnderAge);
    }
}