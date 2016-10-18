/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import java.util.Scanner;
/**
 *
 * @author mukaz1657
 */
public class Atm {

    Scanner scan = new Scanner (System.in);
    private double moneyBalance, moneyWithdraw, moneyDeposit;

    public Atm() {
        moneyBalance = 0;
        moneyWithdraw = 0;
        moneyDeposit = 0;
    }

    public Atm(double mnyBalance, double mnyWithdraw, double mnyDeposit) {
        moneyBalance = mnyBalance;
        moneyWithdraw = mnyWithdraw;
        moneyDeposit = mnyDeposit;
    }
    
    public String toString() {
        
        return output;
    }
}
