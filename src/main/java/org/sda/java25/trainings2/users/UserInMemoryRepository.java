package org.sda.java25.trainings2.users;

import org.sda.java25.trainings2.util.PasswordUtil;

import java.util.*;

public class UserInMemoryRepository implements IUserRepository {

    private static Map<String, User> usersMap = new HashMap<>();

    static {
        User admin = new User("admin", "admin@wp.pl","admin", PasswordUtil.hashPassword("1234"));
        admin.setAdmin(true);
        usersMap.put(admin.getLogin(),admin);
    }

    @Override
    public void addUser(User user){
        usersMap.put(user.getLogin(), user);
    }

    @Override
    public List<User> findAllUsers() {
        return new ArrayList<>(usersMap.values());
    }

    @Override
    public Optional<User> getByLogin(String login) {
        User user = usersMap.get(login);
        return Optional.ofNullable(user);
    }

    @Override
    public Optional<User> getByEmail(String email) {
        return usersMap.values()
                .stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }


}
