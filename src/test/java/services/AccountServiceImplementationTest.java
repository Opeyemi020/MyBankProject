//package services;
//
//import data.models.Account;
//import dtos.requests.CreateAccountRequest;
//import dtos.requests.LoginAccountRequest;
//import dtos.responses.LoginAccountResponse;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class AccountServiceImplementationTest {
//    AccountService accountService = new AccountServiceImplementation();
//    Account createAccountResponse;
//    @DisplayName("test That Account Can Be Created ->")
//    @Test public void testThatAccountCanBeCreated(){
//        CreateAccountRequest createAccountRequest = new CreateAccountRequest();
//        createAccountRequest.setFirstName("aiyeola");
//        createAccountRequest.setLastName("Oluwatobiloba");
//        createAccountRequest.setOtherName("Esther");
//        createAccountRequest.setEmailAddress("ilovejesus@gmail.com");
//        createAccountRequest.setPhoneNumber("09053533053");
//        createAccountResponse = accountService.createAccount(createAccountRequest);
//        assertNotNull(createAccountResponse);
//
//
//    }
//    @DisplayName("Create One Account ->")
//    @Test public void createOneAccount_countIsOneTest() {
//        CreateAccountRequest createAccountRequest = new CreateAccountRequest();
//        createAccountRequest.setFirstName("aiyeola");
//        createAccountRequest.setLastName("Oluwatobiloba");
//        createAccountRequest.setOtherName("Esther");
//        createAccountRequest.setEmailAddress("ilovejesus@gmail.com");
//        createAccountRequest.setPhoneNumber("09053533053");
//        createAccountResponse = accountService.createAccount(createAccountRequest);
//        assertNotNull(createAccountResponse);
//        assertEquals(1,accountService.count());
//    }
//    @DisplayName("account Can Be Logged In ->")
//    @Test public void testThatAccountCanBeLoggedIn() {
//        CreateAccountRequest createAccountRequest = new CreateAccountRequest();
//        createAccountRequest.setFirstName("aiyeola");
//        createAccountRequest.setLastName("Oluwatobiloba");
//        createAccountRequest.setOtherName("Esther");
//        createAccountRequest.setEmailAddress("ilovejesus@gmail.com");
//        createAccountRequest.setPhoneNumber("09053533053");
//        createAccountResponse = accountService.createAccount(createAccountRequest);
//        assertEquals(1,accountService.findAllAccount().size());
//        LoginAccountRequest loginAccountRequest = new LoginAccountRequest();
//        loginAccountRequest.setPassword(loginAccountRequest.getUsername());
//        loginAccountRequest.setPassword(loginAccountRequest.getPassword());
//        loginAccountRequest.setId(loginAccountRequest.getId());
//        LoginAccountResponse loginAccountResponse = accountService.loginAccount(loginAccountRequest);
//        assertNotNull(loginAccountResponse);
//
//    }
//
//
//}