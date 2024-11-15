package top.yangfan;


import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import top.yangfan.entity.User;
import top.yangfan.service.IUserService;

@Slf4j
@SpringBootTest
class ApplicationTests {
    @Resource
    private IUserService userService;
    @Resource
    private PasswordEncoder passwordEncoder;

    @Test
    @DisplayName("新增用户，注入 PasswordEncoder")
    void insertUserPasswordEncoder1() {
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        User user = new User();
        user.setUserName("lisi");
        user.setPassword("123456");
        user.setPassword( passwordEncoder.encode("123456"));
        user.setLoginName("lisi");
        user.setPhone("13911113333");
        userService.save(user);
    }
    @Test
    @DisplayName("新增用户，注入 PasswordEncoder")
    void insertUserPasswordEncoder2() {
        User user = new User();
        user.setUserName("yangfan");
        user.setPassword(passwordEncoder.encode("123456"));
        user.setLoginName("yangfan");
        userService.save(user);
    }
    }

