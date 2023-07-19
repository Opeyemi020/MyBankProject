package data.repository;

import data.models.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AccountRepositoryImplementationTest {
    AccountRepository accountRepository;
    @BeforeEach public void startWith(){
        accountRepository = new AccountRepositoryImplementation();
    }
    @Test
    public void accountExistTest() {
        Account account = new Account();
        accountRepository.create(account);
        Assertions.assertNotNull(accountRepository.count());
    }
    @DisplayName("test That Account Can Be Created ->")
    @Test public void testThatAccountCanBeCreated(){
        Account account = new Account();
        accountRepository.create(account);
        Assertions.assertEquals(1,accountRepository.count());
    }
    @DisplayName("test That multiple Multiple Account Can Be Created ->")
    @Test public void testThatMultipleAccountCanBeCreated(){
        Account account = new Account();
        Account hisAccount = new Account();
        Account herAccount = new Account();
        accountRepository.create(account);
        accountRepository.create(herAccount);
        accountRepository.create(hisAccount);
        Assertions.assertEquals(3,accountRepository.count());
    }
    @DisplayName("test That Account Can Be Deleted ->")
    @Test public void testThatAccountCanBeDeletedByAccountId(){
        Account account = new Account();
        Account hisAccount = new Account();
        Account herAccount = new Account();
        accountRepository.create(account);
        accountRepository.create(herAccount);
        accountRepository.create(hisAccount);
        Assertions.assertEquals(3,accountRepository.count());
        accountRepository.delete(1);
        Assertions.assertEquals(2,accountRepository.count());
    }
    @DisplayName("test That Account Can Be Find By Id ->")
    @Test public void testThatAccountCanBeFindById(){
        Account account = new Account();
        Account hisAccount = new Account();
        Account herAccount = new Account();
        accountRepository.create(account);
        accountRepository.create(herAccount);
        accountRepository.create(hisAccount);
        Assertions.assertEquals(3,accountRepository.count());
        accountRepository.findById(3);
        Assertions.assertEquals(1,herAccount.getId());

    }
    @DisplayName("test That Account Can Be Updated")
    @Test public void testThatCreatedAccountCanBeUpdated(){
        Account account = new Account();
        Account hisAccount = new Account();
        Account herAccount = new Account();
        accountRepository.create(account);
        accountRepository.create(herAccount);
        accountRepository.create(hisAccount);
        Assertions.assertEquals(3,accountRepository.count());
        accountRepository.update(herAccount);
        Assertions.assertEquals(3,accountRepository.count());
    }

}