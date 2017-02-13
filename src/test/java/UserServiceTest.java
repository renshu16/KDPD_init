import com.aiyacloud.common.utils.TBTokenAuth;
import com.aiyacloud.dao.domain.entity.ext.UserExt;
import com.aiyacloud.domain.resp.LoginResp;
import com.aiyacloud.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by toothbond on 16/12/9.
 */
public class UserServiceTest extends BaseTest {

    @Autowired
    UserService userService;

    @Test
    public void testUserLogin() {
        LoginResp resp = userService.login("renshuqiong", "123456");

        UserExt userExt = TBTokenAuth.decodeTokenToUser(resp.getToken());
        System.out.print(userExt.getId());

    }
}
