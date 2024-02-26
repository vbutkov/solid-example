package ru.vbutkov.isp;

public final class UserData {
    private final UserId id;
    private String username;
    private String password;

    public UserData(UserId id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public UserData withPassword(String password) {
        this.password = password;
        return new UserData(this.id, this.username, password);
    }

    public UserId getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
