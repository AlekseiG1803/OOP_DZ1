package DZ1;

public class CreditAccount extends Account{

    public CreditAccount(double balance) {
        super(balance);

    }
    private double taxTake;

    @Override
    public void Take(double take) {
        taxTake = take * 1.01;

        if (0 < take && take <= getAmount() * 1.01) {
            super.Take(taxTake);

        } else {
            throw new IllegalArgumentException("Сумма должна быть больше 0 и на балансе должно быть достаточно денег для снятия");
        }
    }
}
