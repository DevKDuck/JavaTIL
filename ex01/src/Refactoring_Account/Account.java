package Refactoring_Account;

public class Account {
    private String bankaccount; // 계좌번호
    private String accountholder; // 계좌주
    private int amount; // 잔고

    public Account(String bankaccount, String accountholder, int amount){
        this.bankaccount = bankaccount;
        this.accountholder = accountholder;
        this.amount = amount;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getAccountholder() {
        return accountholder;
    }

    public void setAccountholder(String accountholder) {
        this.accountholder = accountholder;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String toString(){
        return this.bankaccount + "   " + this.accountholder + "   " + this.amount;
    }

    public void print() {
    	System.out.println(this);
    }


}
