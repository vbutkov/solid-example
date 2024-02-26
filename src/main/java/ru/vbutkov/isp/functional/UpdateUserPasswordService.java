package ru.vbutkov.isp.functional;

import ru.vbutkov.isp.UserId;

public class UpdateUserPasswordService {

    private FindUserByIdSpi findUserByIdSpi;

    private UpdateUserSpi updateUserSpi;

    public void updateUserPassword(UserId userId, String password) {
        this.updateUserSpi.updateUser(this.findUserByIdSpi.findUserById(userId)
                .map(user -> user.withPassword(password))
                .orElseThrow()
        );
    }
}
