package com.hsbc.oop02;

public class Test3 {
    public static void main(String[] args) {
        Account accounts[] = new Account[5];
        accounts[0] = new Saving(10101, "Vaishnavi", 30000, 4.5);
        accounts[1] = new Current(10102, "Achyuta", 20000, 45000);
        accounts[2] = new Saving(10103, "Ishan", 56000, 4.5);
        accounts[3] = new Saving(10104, "Harsh", 24000, 4.3);
        accounts[4] = new Current(10105, "Ashitosh", 120000, 12000);

        Account lotteryAccount = selectRandomAccountForLottery(accounts);
        sendLotteryNotification(lotteryAccount);
    }
    public static Account selectRandomAccountForLottery(Account acc[]){
        return null;
    }
    public static void sendLotteryNotification(Account lotteryAccount){

    }
}
