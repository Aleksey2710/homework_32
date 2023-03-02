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
    private static final String DEFAULT_VALUE = "default";

    private User user;

//    @BeforeEach
//    public void setUp() {
//
//    }

    @Test
    public void shouldAddUserWithParameters() {
        user=new User(CORRECT_LOGIN,CORRECT_MAIL);

        assertNotNull(user.getLogin());
        assertNotNull(user.getEmail());
    }

    @Test
    public void shouldAddUserNotParameters() {
        user=new User();

        assertNull(user.getLogin());
        assertNull(user.getEmail());
    }

    @Test
    public void shouldAddUserParametersWithBlankAndEmpty() { //Ради интереса посмотреть, что будет (для себя)
//        user = new User(EMPTY_VALUE,BLANK_VALUE);
//
//        assertThrows(IllegalArgumentException.class, ()->user.setLogin(EMPTY_VALUE));

        user=new User(EMPTY_VALUE,BLANK_VALUE);
//        user.setLogin(EMPTY_VALUE);
//        user.setEmail(BLANK_VALUE);

        Assertions.assertEquals(user.getLogin(), DEFAULT_VALUE);
        Assertions.assertEquals(user.getEmail(), DEFAULT_VALUE);
    }

    @Test
    public void shouldCheckIsCorrectEmail1() {

        user=new User(CORRECT_LOGIN,DEFAULT_MAIL_1);

        Assertions.assertEquals(user.getEmail(), DEFAULT_VALUE);
    }

    @Test
    public void shouldCheckIsCorrectEmail2() {

        user=new User(CORRECT_LOGIN,DEFAULT_MAIL_2);

        Assertions.assertEquals(user.getEmail(), DEFAULT_VALUE);
    }

    @Test
    public void shouldCheckIsEqualsLoginAndEmail() {

        user=new User(CORRECT_LOGIN,DEFAULT_MAIL_CLONE_LOGIN);

        Assertions.assertEquals(user.getEmail(), DEFAULT_VALUE);
    }
}