package DZ1;

public class Homework {
    public static void main(String[] args) {

    CreditAccount creditAccount = new CreditAccount(101);
    creditAccount.Take(100);
        System.out.println(creditAccount.getAmount());
    }
}
