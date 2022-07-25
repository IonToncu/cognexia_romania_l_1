import java.util.ArrayList;
import java.util.List;

public class Application {
    private static List<Account> users = new ArrayList<>();
    public static void main(String[] args) {
        submitUserDetails(123,
                "name",
                "password",
                1000,
                new KYCVerification("pan",
                        213,
                        "type",
                        "documentNumber"),
                new ContactDetails("HouseNumber",
                        "locality",
                        "city",
                        "state",
                        "country",
                        123,
                        1243354,
                        123),
                1);

        doDepositOperation(users.get(0), 1000);
        printBalance(users.get(0));
        doWithdrawalOperation(users.get(0), 500);
        printBalance(users.get(0));

    }

    public static void submitUserDetails(long accountNumber, String userName, String password, int balance, KYCVerification kycVerification, ContactDetails contactDetails, int cashback){
        users.add(new Account( accountNumber,
                                userName,
                                password,
                                balance,
                                kycVerification,
                                contactDetails,
                                cashback));

    }

    public static void doDepositOperation(Account account, int amount){
        account.deposit(amount);

    }
    public static void doWithdrawalOperation(Account account, int amount){
        account.withdrawal(amount);
    }
    public static void printUserAllDetails(Account account){
        System.out.println(account);
    }
    public static void printUserContactDetails(Account account){
        System.out.println(account.getContactDetails());
    }
    public static void printUserKYCDocumentDetails(Account account){
        System.out.println(account.getKycVerification());
    }
    public static void printBalance(Account account){
        System.out.println(account.getBalance());
    }
    public static void changeMobileNumber(Account account, long mobileNumber){
        account.getContactDetails().setMobileNumber(mobileNumber);
    }
    public static void changeEmailId(Account account, long emailId){
        account.getContactDetails().setEmailId(emailId);
    }


}
