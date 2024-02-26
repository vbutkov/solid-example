package ru.vbutkov.isp.functional;

import ru.vbutkov.isp.UserData;

interface SaveUserSpi {
    void saveUser(UserData user);
}
