public class Account {
    private long accountNumber;
    private String userName;
    private String password;
    private int balance;
    private KYCVerification kycVerification;
    private ContactDetails contactDetails;
    private int cashback;


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", kycVerification=" + kycVerification +
                ", contactDetails=" + contactDetails +
                ", cashback=" + cashback +
                '}';
    }

    public  int deposit(int amount){
        this.balance+= amount;
        return this.balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public KYCVerification getKycVerification() {
        return kycVerification;
    }

    public void setKycVerification(KYCVerification kycVerification) {
        this.kycVerification = kycVerification;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public int getCashback() {
        return cashback;
    }

    public void setCashback(int cashback) {
        this.cashback = cashback;
    }

    public Account(long accountNumber, String userName, String password, int balance, KYCVerification kycVerification, ContactDetails contactDetails, int cashback) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.password = password;
        this.balance = balance;
        this.kycVerification = kycVerification;
        this.contactDetails = contactDetails;
        this.cashback = cashback;
    }

    public int withdrawal(int amount){
        if(amount < this.balance){
            this.balance-=amount;
            this.balance+=(amount/100)*cashback;
            System.out.println("The operation was completed successfully");
        }else{
            System.out.println("The operation cannot be completed");
            return 0;
        }
        return 0;
    }
}
