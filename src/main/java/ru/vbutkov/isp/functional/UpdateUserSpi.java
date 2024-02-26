package ru.vbutkov.isp.functional;

import ru.vbutkov.isp.UserData;
import ru.vbutkov.isp.UserId;

interface UpdateUserSpi {
    void updateUser(UserData user);
}
