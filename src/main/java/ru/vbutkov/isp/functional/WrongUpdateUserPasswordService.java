package ru.vbutkov.isp.functional;

import ru.vbutkov.isp.UserDao;
import ru.vbutkov.isp.UserId;

public class WrongUpdateUserPasswordService {

    private UserDao userDao;

    public void updateUserPassword(UserId userId, String password) {
        this.userDao.updateUser(this.userDao.findUserById(userId)
                .map(user -> user.withPassword(password))
                .orElseThrow()
        );
    }
}
