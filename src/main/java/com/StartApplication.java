package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class StartApplication {

    public static void main(String[] args) {
        System.out.println("ddddddd");
        System.out.println("4444444444");
        System.out.println("7777777777777777");
        System.out.println("6666666666666");
        System.out.println("5555555555");
        System.out.println("44444444444");
        System.out.println("33333333");
        System.out.println("2222");
        System.out.println("111111111111");
        System.out.println("mmm");
        System.out.println("dec");
        // Spring应用启动起来
        SpringApplication.run(StartApplication.class,args);
    }

    public void run(){

        Num num = new Num();
        num.setA(4);
        num.setB(3);
        float a = num.getA()/num.getB();
        System.out.println(a);


        BigDecimal b = new BigDecimal("10");
        BigDecimal c = new BigDecimal("3");

        BigDecimal r = b.divide(c,3,BigDecimal.ROUND_HALF_UP);
        System.out.println(r);

    }

    class Num{
        private float a;
        private float b;

        public Num() {
        }

        public float getA() {
            return a;
        }

        public void setA(float a) {
            this.a = a;
        }

        public float getB() {
            return b;
        }

        public void setB(float b) {
            this.b = b;
        }
    }
}
