public class fractionSimplification {

    public static Fraction add(Fraction f1, Fraction f2) {          //Adding 2 Fraction
        int numerator = f1.num*f2.den + f2.num*f1.den;
        int denominator = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }
    
    public static int gcd(int num, int den) {             //Find Greatest common divisor
        int min = Math.min(num,den);
        for(int i=min; i>=1; i--) {
            if(num%i ==0 && den%i ==0) return i;
        }
        return min;
    }

    public static class Fraction {
        int num;
        int den;
        public Fraction(int num, int den) {              //Constructor
            this.num = num;
            this.den = den;
            simplify();
        }
        public void simplify() {
            int hcf = gcd(num,den);
            num /= hcf;
            den /= hcf;
        }
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,6);
        System.out.println(f1.num +"/"+ f1.den);
        Fraction f2 = new Fraction(2,8);
        System.out.println(f2.num +"/"+ f2.den);
        Fraction f3 = add(f1, f2);
        System.out.println(f3.num +"/"+ f3.den);

    }
    
}