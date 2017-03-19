import org.expotest.models.User;
import org.expotest.services.AuthenticationService;
import org.expotest.services.UserService;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;

/**
 * Created by Mazdarati on 19.03.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    private AuthenticationService authenticationService;

    @org.junit.Test
    public void exampleTest() {
        LinkedList<String> strings = new LinkedList<>();
        strings.get(0);
        UserService userService = new UserService();
        Mockito.when(userService.getByLogin(Mockito.anyString())).thenReturn(new User());
        Mockito.when(userService.save(Mockito.any(User.class))).thenReturn(new User());
        authenticationService.siginUser(new User());
    }

}
