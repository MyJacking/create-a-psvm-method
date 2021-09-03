package com.github.hcsp;

public class Cat {

    // static int i; 静态成员变量 不与任何对象绑定

    public String name; // 成员变量

    // 假如没有申明任何的constructor构造器
    // 编译器会自动帮你生成一个
    // Cat() {}

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }
}
