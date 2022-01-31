/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis3090.pkgfinal.project;

import java.io.FileWriter;
import java.io.IOException;

public class SandwichIO {
    public static void writeOrderToFile(Order order){
        try {
            FileWriter fr = new FileWriter("outline.txt", true);
            fr.write(order.getOrder());
            fr.write("\n");
            fr.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }

}

