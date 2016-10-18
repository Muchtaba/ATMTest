/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atm;

/**
 *
 * @author mukaz1657
 */
public class AtmTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Atm user1 = new Atm();
        
        String output = "Welcome to BMO \n your account has succesfully been setup";
        output += "\n Please choose service";
        output += "\n 1. Withdraw";
        output += "\n 2. Deposit";
        output += "\n 3. Display Balance";
        int numChoice = scan.nextInt();
        if(numChoice==1){
            output += "\n Please enter amount to withdraw";
        }else if (numChoice==2){
            output += "\n Please enter amount to Deposit";
        }else if (numChoice==3){
            output += "\n Balance: " + moneyBalance;
        }else{
            output += "\n Please choose one of the services listed above";
        }
    }
    
}
