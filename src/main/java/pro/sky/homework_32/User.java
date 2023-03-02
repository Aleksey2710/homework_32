package pro.sky.homework_32;

import java.util.Objects;

public class User {

    private String login;
    private String email;

//    private static final String DEFAULT_VALUE = "default";

    public User(String login, String email) {
        if (login.equals(email)) {
            throw new IllegalArgumentException();
        }
        setLogin(login);
        setEmail(email);
    }

    public User() {
        this.login = null;
        this.email = null;
    }



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login == null
                || login.isEmpty()
                || login.isBlank()) {
            throw new IllegalArgumentException();
        } else {
            this.login = login;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null
                || email.isEmpty()
                || email.isBlank()
                || !email.contains("@")
                || !email.contains(".")) {
            throw new IllegalArgumentException();
        } else {
            this.email = email;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }
}
