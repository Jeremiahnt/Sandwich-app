/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis3090.pkgfinal.project;

import java.text.DateFormat;
import java.util.Date;

public class Order {
    private String name;
    private Sandwich sandwich;
    private String time;

    public Order(String name, Sandwich sandwich){
        this.name = name;
        this.sandwich = sandwich;
        orderTime();
    }
    private void orderTime(){
        Date now = new Date();
        DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,
                DateFormat.MEDIUM);
        time = defaultDate.format(now);
    }

    public String getTime(){
        return time;
    }

    public String getName(){
        return name;
    }

    public String getOrder(){
        String printout = getTime() + "\t"+ getName() + "\t" + sandwich.getBread() + "\t" + sandwich.getIngredients()
                + "\t" + sandwich.getMeat() + "\t" + String.format("%.2f", sandwich.getPrice());
        return printout;
    }

}
