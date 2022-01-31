/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis3090.pkgfinal.project;

import java.util.*;
public class Sandwich {
    private double white = 1.5;
    private double wheat = 1.6;
    private double french = 1.8;
    private double organic = 2.0;
    private double redOnions = 0.05;
    private double olives = 0.10;
    private double pickles = 0.10;
    private double lettuce = 0.20;
    private double greenPeppers = 0.25;
    private double tomatoes = 0.30;
    private double cheese = 0.50;
    private double ham = 1.00;
    private double roastedChickenBreast = 1.1;
    private double turkeyBreast = 1.2;
    private double roastBeef= 1.5;
    private double price;
    private String bread;
    private String meat;
    private String listIngredients;
    ArrayList<Integer> ingredients = new ArrayList<Integer>();
    public Sandwich(){
        price = 0.0;
        bread = null;
        meat = null;

    }
    public void addBread(int breadType){
        switch(breadType){
            case 1:
                bread = "White Bread";
                price += white;
                break;
            case 2:
                bread = "Wheat Bread";
                price += wheat;
                break;
            case 3:
                bread = "French Bread";
                price+=french;
                break;
            case 4:
                bread = "Organic Bread";
                price+=organic;
                break;
//            default: //shouldn't reach here but just in case
//                System.out.println("ERROR: OUT OF RANGE");

        }
    }
    public void addIngredient(int ingredientNum){//assume that user can have double vegetables
        ingredients.add(ingredientNum);
        switch(ingredientNum){
            case 1:
                price += redOnions;
                listIngredients +="red onions, ";
                break;
            case 2:
                price += olives;
                listIngredients += "olives, ";
                break;
            case 3:
                price += pickles;
                listIngredients += "pickles, ";
                break;
            case 4:
                price += lettuce;
                listIngredients += "lettuce, ";
                break;
            case 5:
                price += greenPeppers;
                listIngredients += "green peppers, ";
                break;
            case 6:
                price += tomatoes;
                listIngredients += "tomatoes, ";
                break;
            case 7:
                price += cheese;
                listIngredients += "cheese, ";
                break;
//            default://shouldn't reach here but just in case
//                System.out.println("ERROR: OUT OF RANGE");

        }
    }

    public void addMeat(int meatType){
        switch(meatType) {
            case 1:
                meat = "Ham";
                price += ham;
                break;
            case 2:
                meat = "Roasted Chicken Breast";
                price += roastedChickenBreast;
                break;
            case 3:
                meat = "Turkey Breast";
                price += turkeyBreast;
                break;
            case 4:
                meat = "Roast Beef";
                price += roastBeef;
                break;
//            default://shouldn't reach here but just in case
//                System.out.println("ERROR: OUT OF RANGE");
        }

    }

    public String getBread(){
        return bread;
    }
    public double getPrice(){
        return price;
    }

    public String getIngredients(){
        return listIngredients.substring(4, listIngredients.length()-2);

    }

    public String getMeat(){
        return meat;
    }


}

