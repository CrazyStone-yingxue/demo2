package com.stone;

import com.stone.bean.DemoEnum;
import com.stone.bean.OutObject;
import com.stone.bean.User;
import com.stone.service.UserService;
import net.minidev.json.JSONUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Demo2Application.class)
public class Demo2ApplicationTests {
    private static final String STONE_VARIBLE_SEARCH = "stone";

    @Autowired
    private UserService userService;
    @Autowired
    private User user;

    @Test
    public void contextLoads() {
        /**
         * 开发规范练习
         */
        Map<String, Object> map = new HashMap<>();
        map.put("one", "testOne");
        map.put("two", "testTwo");
        Set<String> set = map.keySet();
        for (String string : set) {
            System.out.println("key =" + string +"value =" + map.get(string));
        }
        StringBuffer sb = new StringBuffer();
        sb.append("stoen").append("stone")   //一行超过120个字符需要换行
            .append("stone").append("666")   //换行缩进4个空格
            .append("the end");
        System.out.println(sb.toString());
    }
    @Test
    public void testTwo() {
        //required = false 表示不用必须传这个值  默认为null  必须使用包装类
        Map<String, Object> map = new HashMap<>();
        map.put("one", "testOne");
        map.put("two", "testTwo");
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println("key is" + entry.getKey() + "\t" + "value is" + entry.getValue());
        }
    }
    @Test
    public void test3() {
        int a = 10;
        try {
            a = 15;
            System.out.println("try" + "a =" + a);
            //int a = 10/0;
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            a = 20;
            System.out.println("finally" + "a =" + a);
        }
    }
    @Test
    public void testBingDingErrors() {
        List<User> users = userService.queryById("1");
        System.out.println(users);
    }
    @Test
    public void testEnum() {
        try {
            String desc = DemoEnum.getDesc("11");
            System.out.println(desc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testConfBean() {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());
    }

}
