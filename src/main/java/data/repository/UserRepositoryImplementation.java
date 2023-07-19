package data.repository;

import data.models.User;

import java.util.ArrayList;

public class UserRepositoryImplementation implements UserRepository {
    private int count = 0;
    ArrayList<User> users = new ArrayList<>();
    @Override
    public void save(User user) {
        user.setUserID(generateId());
        users.add(user);
        count+=1;
    }

    private int generateId() {
        return count;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public User findById(int userID) {
        for (User user:users) {
            if (user.getUserID()==userID)
                return user;
        };
        return null;
    }

    @Override
    public void deleteByID(int userID) {
        for (User user:users) {
            if (user.getUserID()==userID)
                users.remove(user);count-=1;
                break;
            
        }
    }
}
