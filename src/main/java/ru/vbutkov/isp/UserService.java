package ru.vbutkov.isp;

public class UserService {

    private UserDao userDao;

    public void updateUserPassword(UserId userId, String password) {
        this.userDao.updateUser(this.userDao.findUserById(userId)
                .map(user -> user.withPassword(password))
                .orElseThrow()
        );
    }

    public void deleteUser(UserId userId) {
        this.userDao.deleteUserById(userId);
    }

}
