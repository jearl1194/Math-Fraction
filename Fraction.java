package fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this(0, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator can't be zero.");
        } else {
            this.denominator = denominator;
        }
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void showFractionForm() {
        System.out.printf("%d/%d", this.numerator, this.denominator);
    }

    public String determineLowestTerm() {
        int max = this.numerator < this.denominator ? this.numerator : this.denominator;
        int num = this.getNumerator();
        int den = this.getDenominator();
        boolean isLowestTerm = true;
        for (int i = max; i >= 2; --i) {
            if (num % i == 0 && den % i == 0) {
                num /= i;
                den /= i;
                isLowestTerm = false;
            }
        }
        if (isLowestTerm) {
            return "0/0";
        }
        return num + "/" + den;
    }

    public double determineDecimalEquivalent() {
        return (double) this.numerator / this.denominator;
    }

    public String determineFractionType() {
        String fractionType = (this.numerator < this.denominator) ? "Proper Fraction" : "Improper Fraction";
        if (this.numerator == this.denominator) {
            fractionType = "Whole Number";
        }
        return fractionType;
    }
}
