package data.repository;


import data.models.Account;

import java.util.Collection;

public interface AccountRepository extends {
    void create(Account account);

    int count();

    void delete(int id);

    Account findById(int id);

    int update(Account herAccount);

    Collection<Object> findAll();

}
