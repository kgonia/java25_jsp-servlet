package org.sda.java25.trainings2.users;

import org.sda.java25.trainings2.util.PasswordUtil;

import java.util.List;
import java.util.Optional;

public class UserService {

    private IUserRepository userRepository = new UserInMemoryRepository();

    public boolean addUser(User user) {

        Optional<User> userOptional = userRepository.getByLogin(user.getLogin());
        Optional<User> userOptionalWithEmail = userRepository.getByEmail(user.getEmail());
        if (userOptional.isPresent() || userOptionalWithEmail.isPresent()) {
            System.out.println("User can't be register");
            return false;
        } else {

            String encryptedPassword = PasswordUtil.hashPassword(user.getPassword());
            user.setPassword(encryptedPassword);

            userRepository.addUser(user);
            return true;
        }
    }

    public List<User> findAllUsers() {
        return userRepository.findAllUsers();
    }

    public Optional<User> getUserByLoginAndPassword(String login, String password) {
        Optional<User> userOptional = userRepository.getByLogin(login);
        if(userOptional.isPresent()){
            User user = userOptional.get();
            if(PasswordUtil.checkPassword(password, user.getPassword())){
                return userOptional;
            }
        }
        return Optional.empty();
    }
}
