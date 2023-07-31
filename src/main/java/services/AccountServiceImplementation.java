package services;

import data.models.Account;
import data.repository.AccountRepository;
import dtos.requests.CreateAccountRequest;
import dtos.requests.LoginAccountRequest;
import dtos.responses.LoginAccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;

import static utils.Mapper.createAccountMap;
import static utils.Mapper.map;
@Service
public class AccountServiceImplementation implements AccountService {
    @Autowired
    AccountRepository accountRepository;
    private final int count = 0;
    @Override
    public Account createAccount(CreateAccountRequest createAccountRequest) {
        Account account = createAccountMap(createAccountRequest);
        accountRepository.create(account);
        map(account);
        return account;

    }

    @Override
    public int count() {
        return accountRepository.count();
    }

    @Override
    public Collection<Object> findAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public LoginAccountResponse loginAccount(LoginAccountRequest loginAccountRequest) {
        return null;
    }
}
