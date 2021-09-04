package com.github.hcsp;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    // 查找元素是否存在
    public static boolean find(List<Integer> list, int value) {
        boolean exist = false;
        for (Integer element : list) {
            if (element == value) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    // 打印list中的基数
    public static void printOdd(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                continue;
            }
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {

//        Person person


//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
////        System.out.println(find(list, 2));
//        printOdd(list);

//        int i = new Random().nextInt(3);
//
//        switch (i) {
//            case 0:
//                System.out.println(i);
//                break;
//            case 1:
//                System.out.println(i);
//                break;
//            case 2:
//                System.out.println(i);
//                break;
//            default:
//                System.out.println(i);
//                break;
//        }


//        最外层的循环:
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 4; j++) {
//                break 最外层的循环;
//            }
//        }
    }
}
