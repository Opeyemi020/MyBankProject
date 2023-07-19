package data.repository;

import data.models.User;
import jdk.jfr.Name;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryImplementationTest {
    @DisplayName("test That User Exist ->")
    @Test
    public void userExistTest() {
        UserRepository userRepository = new UserRepositoryImplementation();
        assertNotNull(userRepository);

    }
    @Name("test That User Is Saved")

    @Test
    public void testThatUserIsSaved() {
        UserRepository userRepository = new UserRepositoryImplementation();
        userRepository.save(new User());
        assertEquals(1, userRepository.count());
    }
    @DisplayName("test That User Can Be Find By Id")
    @Test
    public void testThatUserCanBeFindById() {
        UserRepository userRepository = new UserRepositoryImplementation();
        User user = new User();
        User user1 = new User();
        userRepository.save(user);
        userRepository.save(user1);
        assertEquals(2, userRepository.count());
        userRepository.findById(user.getUserID());
        assertEquals(user, userRepository.findById(user.getUserID()));
    }
    @DisplayName("test That User Can Be Deleted By Id")

    @Test
    public void testThatUserCanBeDeletedById() {
        UserRepository userRepository = new UserRepositoryImplementation();
        User user = new User();
        User user1 = new User();
        userRepository.save(user);
        userRepository.save(user1);
        assertEquals(2, userRepository.count());
        userRepository.deleteByID(user.getUserID());
        assertEquals(1, userRepository.count());


    }
}