package entities;

public class BusinessAccount extends Account {
    public Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loadnLimit) {
        super(number, holder, balance);
        this.loanLimit = loadnLimit;
    }

    public Double getLoanLimit() {
        return this.loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if(amount <= loanLimit){
            balance += amount - 10.0;
        }
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }


}