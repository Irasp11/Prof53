package lesson2.bank;

import lesson2.bank.LoanIssuer;
import lesson2.bank.LoanTaker;

public class LoanTester {
    public static void main(String[] args) {
        LoanTaker misha = new LoanTaker("Misha", 21_000, 73);
        LoanIssuer dina = new LoanIssuer("Dina", true, false);
        LoanTaker alex = new LoanTaker("Alex", 26_000, 30);
        LoanIssuer foma = new LoanIssuer("Foma", false, false);
    }
}
