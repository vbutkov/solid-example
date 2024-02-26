package ru.vbutkov.isp.functional;

import ru.vbutkov.isp.UserData;
import ru.vbutkov.isp.UserId;

import java.util.Optional;

interface FindUserByUsernameSpi {
    Optional<UserData> findUserByUsername(String username);
}
