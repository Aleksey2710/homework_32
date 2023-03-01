package pro.sky.homework_32;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

    private static final String CORRECT_LOGIN = "Ivan";
    private static final String CORRECT_MAIL = "Ivan@mail.ru";

    private static final String DEFAULT_MAIL_CLONE_LOGIN = "Ivan";
    private static final String DEFAULT_MAIL_1 = "Ivan@mail";
    private static final String DEFAULT_MAIL_2 = "Ivanmail.ru";
    private static final String EMPTY_VALUE = "";
    private static final String BLANK_VALUE = " ";
    private static final String DEFAULT_VALUE = "default";

    private final User user = new User();

//    @BeforeEach
//    public void setUp() {
//
//    }

    @Test
    public void shouldAddUserWithParameters() {
        user.setLogin(CORRECT_LOGIN);
        user.setEmail(CORRECT_MAIL);

        Assertions.assertEquals(user.getLogin(), CORRECT_LOGIN);
        Assertions.assertEquals(user.getEmail(), CORRECT_MAIL);
    }

    @Test
    public void shouldAddUserNotParameters() {
        user.setLogin(null);
        user.setEmail(null);

        Assertions.assertEquals(user.getLogin(), DEFAULT_VALUE);
        Assertions.assertEquals(user.getEmail(), DEFAULT_VALUE);
    }

    @Test
    public void shouldAddUserParametersWithBlankAndEmpty() { //Ради интереса посмотреть, что будет (для себя)
        user.setLogin(EMPTY_VALUE);
        user.setEmail(BLANK_VALUE);

        Assertions.assertEquals(user.getLogin(), DEFAULT_VALUE);
        Assertions.assertEquals(user.getEmail(), DEFAULT_VALUE);
    }

    @Test
    public void shouldCheckIsCorrectEmail1() {
        user.setLogin(CORRECT_LOGIN);
        user.setEmail(DEFAULT_MAIL_1);

        Assertions.assertEquals(user.getEmail(), DEFAULT_VALUE);
    }

    @Test
    public void shouldCheckIsCorrectEmail2() {
        user.setLogin(CORRECT_LOGIN);
        user.setEmail(DEFAULT_MAIL_2);

        Assertions.assertEquals(user.getEmail(), DEFAULT_VALUE);
    }

    @Test
    public void shouldCheckIsEqualsLoginAndEmail() {
        user.setLogin(CORRECT_LOGIN);
        user.setEmail(DEFAULT_MAIL_CLONE_LOGIN);

        Assertions.assertEquals(user.getEmail(), DEFAULT_VALUE);
    }
}