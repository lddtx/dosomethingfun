package com.dosomethingfun.first;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String str = "i";
        if (StringUtils.isNotEmpty(str)) {
            System.out.println(str);
        }
        System.out.println("begin");
    }
}
