package ru.vbutkov.isp;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    Optional<UserData> findUserById(UserId id);

    Optional<UserData> findUserByUsername(String username);

    List<UserData> findUsers();

    void saveUser(UserData user);

    void updateUser(UserData user);

    void deleteUserById(UserId id);

}
