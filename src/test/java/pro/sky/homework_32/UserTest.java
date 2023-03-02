package pro.sky.homework_32;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private static final String CORRECT_LOGIN = "Ivan";
    private static final String CORRECT_MAIL = "Ivan@mail.ru";
    private static final String DEFAULT_MAIL_CLONE_LOGIN = "Ivan";
    private static final String DEFAULT_MAIL_1 = "Ivan@mail";
    private static final String DEFAULT_MAIL_2 = "Ivanmail.ru";
    private static final String EMPTY_VALUE = "";
    private static final String BLANK_VALUE = " ";
//    private static final String DEFAULT_VALUE = "default";

    private User user;


    @Test
    public void shouldAddUserWithParameters() {
        user = new User(CORRECT_LOGIN, CORRECT_MAIL);

        assertNotNull(user.getLogin());
        assertNotNull(user.getEmail());
    }

    @Test
    public void shouldAddUserNotParameters() {
        user = new User();

        assertNull(user.getLogin());
        assertNull(user.getEmail());
    }

    @Test
    public void shouldAddUserParametersWithBlankAndEmpty() { //Ради интереса посмотреть, что будет (для себя)

        assertThrows(IllegalArgumentException.class, () -> new User(EMPTY_VALUE, BLANK_VALUE));
    }

    @Test
    public void shouldCheckIsCorrectEmail1() {

        assertThrows(IllegalArgumentException.class, () -> new User(CORRECT_LOGIN, DEFAULT_MAIL_1));
    }

    @Test
    public void shouldCheckIsCorrectEmail2() {

        assertThrows(IllegalArgumentException.class, () -> new User(CORRECT_LOGIN, DEFAULT_MAIL_2));
    }

    @Test
    public void shouldCheckIsEqualsLoginAndEmail() {

        assertThrows(IllegalArgumentException.class, () -> new User(CORRECT_LOGIN, DEFAULT_MAIL_CLONE_LOGIN));
    }
}