package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
//     private int amount;

    @Test
    void depositMoneyTest() {


//given
        Account davidAccount = new Account();


//when
        davidAccount.deposit(2000);

//assert

        int balance = davidAccount.getBalance();
        assertEquals(2000, balance);
    }


    @Test
     void depositTwiceTest() {

        Account davidAccount = new Account();
        int defaultBalance = davidAccount.getBalance();
        davidAccount.deposit(5000);
        davidAccount.deposit(2000);
        int balance = defaultBalance + 7000;
        assertEquals(balance, davidAccount.getBalance());
    }
        @Test
        void withdrawMoneyTest(){
            //given
            Account davidAccount = new Account();
        int defaultBalance = davidAccount.getBalance();

        davidAccount.withdraw(5000);
        //when
        davidAccount.withdraw(3000);
        //then;
            int balance = defaultBalance - 8000;
        assertEquals(balance, davidAccount.getBalance());
        }

        @Test
    void multiplyBalanceTest(){
            Account davidAccount = new Account();

            int balance = davidAccount.getBalance();
            davidAccount.multiply(2);

//assert
                int newBalance = balance * 2;
            assertEquals(newBalance, davidAccount.getBalance());

        }

}