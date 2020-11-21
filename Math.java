import java.util.Scanner;
import fraction.Fraction;

public class Math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isContinue = true;
        int numerator;
        int denominator;
        while (isContinue) {
            System.out.print("Enter the numerator --> ");
            numerator = input.nextInt();
            System.out.print("Enter the denominator --> ");
            denominator = input.nextInt();
            Fraction fraction = new Fraction(numerator, denominator);

            System.out.println("***************OUTPUT***************");
            System.out.printf("\n\tNUMERATOR\t\t:\t%d", fraction.getNumerator());
            System.out.printf("\n\tDENOMINATOR\t\t:\t%d", fraction.getDenominator());
            System.out.printf("\n\tFRACTION\t\t:\t");
            fraction.showFractionForm();
            System.out.printf("\n\tLOWEST TERM\t\t:\t%s", fraction.determineLowestTerm());
            System.out.printf("\n\tDECIMAL EQUIVALENT\t:\t%s", fraction.determineDecimalEquivalent());
            System.out.printf("\n\tFRACTION TYPE\t\t:\t%s", fraction.determineFractionType());

            System.out.print("\n\nInput again? [y/n] --> ");
            isContinue = input.next().toLowerCase().equals("y");
            System.out.println();
        }
        input.close();
    }
}