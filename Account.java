package DZ1;

public class Account {

    private double balance;

    public Account() {
        this(0);
    }

    Account (double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return balance;
    }

    public void Put(double put) {
        if (put > 0) {
            this.balance += put;
        } else {
            throw new IllegalArgumentException("Сумма должна быть больше 0");
        }
    }

    public void Take(double take) {
        if (0 < take && take <= balance) {
            this.balance -= take;
        } else {
            throw new IllegalArgumentException("Сумма должна быть больше 0 и на балансе должно быть достаточно денег для снятия");
        }
    }



}
