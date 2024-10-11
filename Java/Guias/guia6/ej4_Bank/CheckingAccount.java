package Guias.guia6.ej4_Bank;

public class CheckingAccount extends BankAccount {
    private final double overdraft;

    public CheckingAccount(int id, double over) {
        super(id);
        this.overdraft = over;
    }

    @Override
    protected boolean canExtract(double amount) {
        return amount - balance <= overdraft;
    }

    public double getOverdraft() {
        return this.overdraft;
    }
}
