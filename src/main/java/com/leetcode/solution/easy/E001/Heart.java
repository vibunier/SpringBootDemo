package com.leetcode.solution.easy.E001;

/**
 * Class Name   : Heart
 * Description  :
 * Version      : V1.0.0
 * Author       : zhenyu
 * Date         : 2019-02-16
 * Copyright      (C) ChinaMerchantsBank
 */

public class Heart {
    public static void main(String[] args) {
        double x, y;
        for (y = 15; y >= -15; y--) {
            for (x = -40; x <= 40; x++) {
                if (1.7 * x * x - 5 * y * Math.abs(1.5 * x) + 16 * y * y <= 480) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
}
