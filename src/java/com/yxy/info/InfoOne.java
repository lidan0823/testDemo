package com.yxy.info;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: testDemo
 * @description: 编码规范
 * @author: Li Dan
 * @create: 2018-12-03 11:30
 **/
// 代码中的命名不能以下划线（_）或者美元符号（$）开始或结束
// 类名使用UpperCamelClass风格，遵从驼峰形式
// 方法名、参数名、成员变量、局部变量都统一使用lowerCamelCase风格，遵从驼峰形式

public class InfoOne {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private Long value = 3L;//long或Long初始赋值时，必须使用大写L，不能使用l；

    public static void getHttpMessage(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("info1","1");
        map.put("info2","2");
        map.forEach((k,v) -> System.out.println("key:value = "+ k + ":" +v));
    }

    @Override
    public String toString() {
        return "InfoOne{" +
                "userName='" + userName + '\'' +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        getHttpMessage();
    }
}
