package services;

import data.repository.UserRepository;
import data.repository.UserRepositoryImplementation;

public class UserServiceImplementation implements UserService {
    UserRepository userRepository = new UserRepositoryImplementation();


}
