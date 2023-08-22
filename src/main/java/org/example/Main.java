package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DayPeriod getperiod= new DayPeriod();
        java.util.Date date=new java.util.Date();


        System.out.println("period: "+getperiod.get_period(date));
    }
}