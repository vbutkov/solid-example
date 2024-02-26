package ru.vbutkov.isp;

import org.springframework.transaction.reactive.TransactionalOperator;
import org.springframework.transaction.support.TransactionOperations;

import java.util.List;
import java.util.Optional;

public class TransactionAwareUserDao implements UserDao {

    private UserDao userDao;

    private TransactionOperations transactionOperations;


    @Override
    public Optional<UserData> findUserById(UserId id) {
        return this.userDao.findUserById(id);
    }

    @Override
    public Optional<UserData> findUserByUsername(String username) {
        return this.userDao.findUserByUsername(username);
    }

    @Override
    public List<UserData> findUsers() {
        return this.userDao.findUsers();
    }

    @Override
    public void saveUser(UserData user) {
        this.transactionOperations
                .executeWithoutResult(status -> this.userDao.saveUser(user));

    }

    @Override
    public void updateUser(UserData user) {
        this.transactionOperations
                .executeWithoutResult(status -> this.userDao.updateUser(user));
    }

    @Override
    public void deleteUserById(UserId id) {
        this.transactionOperations
                .executeWithoutResult(status -> this.userDao.deleteUserById(id));
    }
}
