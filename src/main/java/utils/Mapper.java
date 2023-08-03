package utils;

import data.models.Account;
import data.repository.AccountRepository;
import data.repository.UserRepository;
import data.repository.UserRepositoryImplementation;
import dtos.requests.CreateAccountRequest;
import dtos.responses.CreateAccountResponse;

import static utils.AppUtils.ACCOUNT_SUCCESSFULLY_CREATED;

public class Mapper {
    private static final AccountRepository accountRepository;
    private static final UserRepository userRepository = new UserRepositoryImplementation();

    public static Account createAccountMap(CreateAccountRequest createAccountRequest) {
        Account account = new Account();
        account.setFirstName(createAccountRequest.getFirstName());
        account.setLastName(createAccountRequest.getLastName());
        accountRepository.create(account);
        return account;
    }

    public static Account map(Account account) {
        CreateAccountResponse createAccountResponse = new CreateAccountResponse();
//        createAccountResponse.setAccountNumber(generateAccountNumber());
        createAccountResponse.setMessage(ACCOUNT_SUCCESSFULLY_CREATED);
        return account;
    }

    private static String generateAccountNumber() {
        Account account = new Account();
        String phoneNumber = account.getPhoneNumber();
        String accountNumber = generateAccountNumberFromPhoneNumber(phoneNumber);
        System.out.println("Generated Account Number: " + accountNumber);
        return accountNumber;
    }

    private static String generateAccountNumberFromPhoneNumber(String phoneNumber) {
         String checkIfThePhoneNumberContainsOfDigitsOnly = phoneNumber.replaceAll("\\D", "");
        String prefix = "ACC-";
        String suffix = "-X";
        String generatedAccountNumber;
        generatedAccountNumber = prefix + checkIfThePhoneNumberContainsOfDigitsOnly + suffix;
        return generatedAccountNumber;


    }
}


