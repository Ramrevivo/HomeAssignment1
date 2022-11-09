import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){

    // ask the user to input 3 numbers - a, b and c
        // and solve create a quadratic equation calculator

        // number input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // discriminant calculation and result variable's initializations for further use
        double discriminant = ((b*b) - 4 * a * c);
        double resultOne;
        double resultTwo;

        //for invalid answer/math error
        if (discriminant < 0) {
            System.out.println("There are no valid answers for this equation.");
        } else
            // for one answer
            if (discriminant == 0){
                resultOne = (-b)/(2*a);
                System.out.print("There's only one answer: " + resultOne);
            } else
                //for two answers
                if (discriminant > 0){
                    resultOne = (( (-b) - Math.sqrt((discriminant) / (2*a))));
                    resultTwo = (( (-b) + Math.sqrt((discriminant) / (2*a))));
                    System.out.println("There are two answers: " + "x1 = " + resultOne + " " + "x2 = " + resultTwo);

            }
}
}
