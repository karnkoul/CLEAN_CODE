package CLEAN_CODE;

public class BankAccount implements BankAccountInterface{
    private String bankHolderName;
    private int bankAccountNumber;
    private double bankAccountBalance = 0.00;
    private boolean bankAccountChequeBookIssued = false;
    private DebitCard DB;

    public void withdraw(double amount){
        this.bankAccountBalance -= amount;
    }
    public void deposit(double amount){
        this.bankAccountBalance += amount;
    }


    public BankAccount(String bankHolderName, int bankAccountNumber, double bankAccountBalance, boolean bankAccountChequeBookIssued) {
        this.bankHolderName = bankHolderName;
        this.bankAccountNumber = bankAccountNumber;
        this.bankAccountBalance = bankAccountBalance;
        this.bankAccountChequeBookIssued = bankAccountChequeBookIssued;
    }


    public BankAccount(String bankHolderName, int bankAccountNumber, double bankAccountBalance, boolean bankAccountChequeBookIssued, DebitCard DB) {
        this(bankHolderName, bankAccountNumber, bankAccountBalance, bankAccountChequeBookIssued);
        this.DB = DB;
    }
    

    @Override
    public String toString() {
        return "{" +
            " bankHolderName='" + getBankHolderName() + "'" +
            ", bankAccountNumber='" + getBankAccountNumber() + "'" +
            ", bankAccountBalance='" + getBankAccountBalance() + "'" +
            ", bankAccountChequeBookIssued='" + isBankAccountChequeBookIssued() + "'" +
            ", DB='" + getDB() + "'" +
            "}";
    }


    public String getBankHolderName() {
        return this.bankHolderName;
    }

    public void setBankHolderName(String bankHolderName) {
        this.bankHolderName = bankHolderName;
    }

    public int getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public double getBankAccountBalance() {
        return this.bankAccountBalance;
    }

    public void setBankAccountBalance(double bankAccountBalance) {
        this.bankAccountBalance = bankAccountBalance;
    }

    public boolean isBankAccountChequeBookIssued() {
        return this.bankAccountChequeBookIssued;
    }

    public boolean getBankAccountChequeBookIssued() {
        return this.bankAccountChequeBookIssued;
    }

    public void setBankAccountChequeBookIssued(boolean bankAccountChequeBookIssued) {
        this.bankAccountChequeBookIssued = bankAccountChequeBookIssued;
    }

    public DebitCard getDB() {
        return this.DB;
    }

    public void setDB(DebitCard DB) {
        this.DB = DB;
    }
    @Override
    public void withdraw() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void deposit() {
        // TODO Auto-generated method stub
        
    }

}
