/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;
// for insufficient exception handling
class ieh extends Exception
{
    // constructor
  public ieh(String message)
  {
      super(message);
  }
}
public class BankSystem
{
    static double balance=1000;
    
    // throws
    static void withdraw(double amount) throws ieh
    {
        if (amount>balance)
        {
            throw new ieh("NOT ENOUGH BALANCE!!");
        }
        balance-=amount;
        System.out.println("WITHDRAW SUCCESSFUL");
    }
    static void deposit(double amount)
    {
        balance+=amount;
         System.out.println("DEPOSIT SUCCESSFUL");
    }
    }

