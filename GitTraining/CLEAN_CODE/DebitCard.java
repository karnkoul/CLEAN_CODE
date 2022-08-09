package CLEAN_CODE;

public class DebitCard implements DebitCardInterface{
    private String debitCardHolderName;
    private int debitCardNumber;
    private int cvv;
    private String expiryDate;

    public void depositViaDebitCard(BankAccount acc , double amount ){
        acc.deposit(amount);
        double savingAmount = acc.getBankAccountBalance();

        System.out.println("Amount deposited.New balance is: "+savingAmount);
    }
    public void withdrawViaDebitCard(BankAccount acc , double amount){
        acc.withdraw(amount);
        double savingWithdrawAmount = acc.getBankAccountBalance();

        System.out.println("Amount withdrawn.New balance is: "+savingWithdrawAmount);
    
    }


    public DebitCard(String debitCardHolderName, int debitCardNumber, int cvv, String expiryDate) {
        this.debitCardHolderName = debitCardHolderName;
        this.debitCardNumber = debitCardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public String getDebitCardHolderName() {
        return this.debitCardHolderName;
    }

    public void setDebitCardHolderName(String debitCardHolderName) {
        this.debitCardHolderName = debitCardHolderName;
    }

    public int getDebitCardNumber() {
        return this.debitCardNumber;
    }

    public void setDebitCardNumber(int debitCardNumber) {
        this.debitCardNumber = debitCardNumber;
    }

    public int getCvv() {
        return this.cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "{" +
            " debitCardHolderName='" + getDebitCardHolderName() + "'" +
            ", debitCardNumber='" + getDebitCardNumber() + "'" +
            ", cvv='" + getCvv() + "'" +
            ", expiryDate='" + getExpiryDate() + "'" +
            "}";
    }
    @Override
    public void depositViaDebitCard() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void withdrawViaDebitCard() {
        // TODO Auto-generated method stub
        
    }
}
