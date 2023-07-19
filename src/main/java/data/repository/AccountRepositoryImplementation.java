package data.repository;

import data.models.Account;

import java.util.ArrayList;
import java.util.Objects;

public class AccountRepositoryImplementation implements AccountRepository{
    ArrayList<Account> accounts = new ArrayList<>();
    private int count = 0;
    @Override
    public void create(Account account) {
        account.setId(generateId());
        accounts.add(account);
        count+=1;


    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public void delete(int id) {
        accounts.removeIf(account -> Objects.equals(account.getId(), account.getId()));
        count-=1;
    }

    @Override
    public Account findById(int id) {
        for (Account account: accounts) {
            if (account.getId()==id)
                return account;

        }
        return null;
    }

    @Override
    public int update(Account herAccount) {
        for (Account account : accounts) {
            if (account.getId() == herAccount.getId()) {
                accounts.remove(herAccount);
                count -= 1;
                herAccount.setId(account.getId());
                accounts.add(herAccount);
                count += 1;
                return account.getId();
            }
        }
        return 0;
    }

    private int generateId() {
        return count;
    }
}
