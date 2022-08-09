package CLEAN_CODE;

import CLEAN_CODE.BankAccount;
import CLEAN_CODE.DebitCard;

public class main {
    public static void main(String[] args) {
        DebitCard db1 = new DebitCard("Karn Koul", 100000, 812, "08/2029");
        BankAccount b1 = new BankAccount("Karn Koul", 100000, 0, false, db1);
        System.out.println(b1);
        db1.depositViaDebitCard(b1 , 1000);
        System.out.println(b1);
        db1.withdrawViaDebitCard(b1 , 500);
        System.out.println(b1);
    }
}