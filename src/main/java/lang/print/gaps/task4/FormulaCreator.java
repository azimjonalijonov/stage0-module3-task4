package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
    int a = 5,b =5;
        double v = (9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);
        double t = (9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * (a + b - 4 * a * b) / 2;
        double c =(9 * a * a - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);
        double c1 =(9 * (a ^ 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);
        double c11 =(9 * (a * a) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);
        double c2 =(9*Math.pow(a, 2) - 5*b + 2 + a - 7) * ((a + b - 4*a*b) / 2);
        double c22 =(9 * a * a - 5 * b + 2 + a - 7) * (a + b - 4 * a * b) / 2;

        }

}
