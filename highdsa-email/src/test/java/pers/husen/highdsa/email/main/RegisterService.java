package pers.husen.highdsa.email.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Desc    测试注册邮件服务
 *
 * @Author  何明胜
 *
 * @Created at 2018年2月5日 下午1:03:55
 * 
 * @Version 1.0.0
 */
public class RegisterService {
	public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("email-provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
        context.close();
    }
}