package com;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    //Make assertions about what we expect to happen
    //Test suites that we write cover against the situations that we test against
    @org.junit.jupiter.api.Test
    public void practiceTest() {
        assertEquals(21, 21); //first parameter is what we expect, second is the actual passed
        //You can have more than one assertion in a test BUT IT'S
        //BEST PRACTICE TO ADD ONE TEST, PER TEST CONDITION (ONE ASSERTION)

        //The test should be able to run and pass on its own

        //What happens in one test method SHOULD NOT depend on another test method
        //Can't have instance variables in a test
    }

    //Unit Tests usually only test one method
    @org.junit.jupiter.api.Test
    public void deposit() throws Exception{
        BankAccount account = new BankAccount("Elvira", "Valadez", 2000.00, BankAccount.checking);
        double balance = account.deposit(500.00, true);
        assertEquals(2500.00, balance, 0); //when comparing doubles, the delta allows some lee-way in the values ex: 199.99 --> 199.999999
    }

    @org.junit.jupiter.api.Test
    public void withdraw() throws Exception {
        fail("This test has yet to be implemented.");
    }

    @org.junit.jupiter.api.Test
    public void getBalanceDeposit() throws Exception {
        BankAccount account = new BankAccount("Elvira", "Valadez", 2000.00, BankAccount.checking);
        account.deposit(500.00, true);
        assertEquals(2500.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    public void getBalanceWithdraw() throws Exception {
        BankAccount account = new BankAccount("Elvira", "Valadez", 2000.00, BankAccount.checking);
        account.withdraw(500.00, true);
        assertEquals(1500.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    public void isCheckingTrue() {
        BankAccount account = new BankAccount("Elvira", "Valadez", 2000.00, BankAccount.checking);
        assertTrue(account.isChecking()); //to return true or false checking if it returns true
    }
}