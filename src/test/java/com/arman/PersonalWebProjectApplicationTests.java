package com.arman;

import com.baomidou.mybatisplus.core.toolkit.AES;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PersonalWebProjectApplicationTests {

    @Test
    void contextLoads() {
        // // 生成 16 位随机 AES 密钥
        String randomKey = "xxxxx";
        System.out.println("randomKey = " + randomKey);

        // 随机密钥加密
        String url = AES.encrypt("xxxxxx", randomKey);
        System.out.println("url = " + url);

        String username = AES.encrypt("xxxxx", randomKey);
        System.out.println("username = " + username);

        String pwd = AES.encrypt("xxxxxx", randomKey);
        System.out.println("pwd = " + pwd);
    }

}
