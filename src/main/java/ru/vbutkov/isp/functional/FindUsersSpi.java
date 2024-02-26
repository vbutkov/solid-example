package ru.vbutkov.isp.functional;

import ru.vbutkov.isp.UserData;
import ru.vbutkov.isp.UserId;

import java.util.List;
import java.util.Optional;

interface FindUsersSpi {
    List<UserData> findUsers();
}
