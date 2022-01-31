/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis3090.pkgfinal.project;

import java.util.Scanner;

public class SandwichApp {
    public static void main(String[] args) {
        int temp;
        while(true){
            Scanner kb = new Scanner(System.in);
            Sandwich sandwich = new Sandwich();
            System.out.println("=== Select Sandwich Bread===");
            System.out.println("1 White Bread $1.5\n" +
                    "2 Wheat Bread $1.6\n" +
                    "3 French Bread $1.8\n" +
                    "4 Organic Bread $2.0");
            System.out.println("Select a bread[1,4]");
            temp = validator( 4, "bread");
            sandwich.addBread(temp);
            while(true){
                System.out.println("=== Select Sandwich Vegetables: ===\n" +
                        "1 red onions $0.05\n" +
                        "2 olives $0.10\n" +
                        "3 pickles $0.10\n" +
                        "4 lettuce $0.20\n" +
                        "5 green peppers $0.25\n" +
                        "6 tomatoes $0.30\n" +
                        "7 cheese $0.50\n" +
                        "8 Quit vegetable selection\n" +
                        "Select vegetables: [1, 8]:");
                temp = validator( 8, "vegetables");
                if(temp == 8)
                    break;
                sandwich.addIngredient(temp);
            }
            System.out.println("=== Select Sandwich Meat: ===  \n" +
                    "1 Ham $1.0  \n" +
                    "2 Roasted Chicken Breast $1.1  \n" +
                    "3 Turkey Breast $1.2  \n" +
                    "4 Roast Beef $1.5  \n" +
                    "5 Quit meat selection  \n" +
                    "Select meat [1, 5]: ");
            temp = validator(5, "meat");
            if(temp != 5)
                sandwich.addMeat(temp);
            System.out.println("Enter customer's name");
            String name = kb.nextLine();
            Order order = new Order(name, sandwich);
            SandwichIO.writeOrderToFile(order);
            System.out.println("Continue to order more sandwich? (y/n): ");
            String cont = kb.nextLine();
            if(cont.equals("y") || cont.equals("Y"))
                continue;
            else
                break;
        }
    }
    
    public static int validator(int end, String type){
        Scanner kb = new Scanner(System.in);
        int temp = kb.nextInt();
        if(temp>0 && temp <=end){
            return temp;
        }
        else{
            System.out.println("Error! Number must be greater than 0 and Less than "+ end);
            System.out.println("Select a "+ type+ " [1,"+end+"]");
            validator(end, type);
        }
        return 0;

    }
}

