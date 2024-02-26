package ru.vbutkov.isp.functional;

public interface UserDao extends FindUserByIdSpi, FindUserByUsernameSpi, FindUsersSpi,
        DeleteUserByIdSpi, UpdateUserSpi, SaveUserSpi {

}
