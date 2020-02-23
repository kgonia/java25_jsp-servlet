package org.sda.java25.trainings2.users;

import java.util.List;
import java.util.Optional;

public interface IUserRepository {

    void addUser(User user);

    List<User> findAllUsers();

    Optional<User> getByLogin(String login);

    Optional<User> getByEmail(String email);
}
