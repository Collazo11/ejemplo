package com.company;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import javax.swing.*;

class ClientesCatalog {
    public static void main(String[] args){  //manejo de precios
        final int Number_OF_ITEMS = 10;
        int[] validValues = {1,2,3,4,5,6,7,8,9,10};
        double[] prices = {0.29,1.23,3.50,0.69,6.79,3.19,8.99,0.89,1.29,8.0};
        String strItem;
        int itemOrdered;
        double itemPrice=0.0;
        boolean isValidItem=false;
        strItem = JOptionPane.showInputDialog(null, "Enter the item number you want to order: ");
        itemOrdered = Integer.parseInt(strItem);
        for (int x=0; x<Number_OF_ITEMS;++x){
            if (itemOrdered == validValues[x]){
                isValidItem = true;
                itemPrice = prices[x];
            }
        }
        if (isValidItem)
            JOptionPane.showMessageDialog(null, "The price of the item : " + itemOrdered + "is $" + itemPrice);
            else
                JOptionPane.showMessageDialog(null, "The item number you entered is not valid");






        //manejo de clientes
        String name;
        ClientesCatalog catCtes = new ClientesCatalog();
        int x;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int Num_catCtes = 4;
        for(x=0;x<Num_catCtes;++x){
            System.out.println("Ingrese el nombre del cliente >> ");
            try {
                name = br.readLine();
                arreglo.setCtesNames(x,name);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nMembers of Ctes");
        for(x=0;x<Num_catCtes;++x){
            System.out.print(arreglo.getCtes(x)+"\n");
        System.out.println();
        }
    }
}
