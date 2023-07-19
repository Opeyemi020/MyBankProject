package data.repository;

import data.models.User;

import java.util.ArrayList;

public interface UserRepository {

    void save(User user);

    long count();

    User findById(int userID);

    void deleteByID(int userID);
}
