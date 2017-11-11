package com.gmail.gnoianko;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        Date dateNow = cl.getTime();
        cl.add(Calendar.MONTH, -1);
        Date datePast = cl.getTime();
        long result = dateNow.getTime() - datePast.getTime();
        System.out.println("Result = " + result);
    }
}
