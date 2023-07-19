package data.repository;

import data.models.Account;

public interface AccountRepository {
    void create(Account account);

    int count();

    void delete(int id);

    Account findById(int id);

    int update(Account herAccount);

}
