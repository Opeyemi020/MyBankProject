package services;

import data.models.Account;
import dtos.requests.CreateAccountRequest;
import dtos.requests.LoginAccountRequest;
import dtos.responses.LoginAccountResponse;

import java.util.Collection;

public interface AccountService {

    Account createAccount(CreateAccountRequest createAccountRequest);

    int count();

    Collection<Object> findAllAccount();

    LoginAccountResponse loginAccount(LoginAccountRequest loginAccountRequest);

}
