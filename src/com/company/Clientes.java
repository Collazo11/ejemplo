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

        //manejo de descuentos a los clientes
        int[] discount = {0,0,0,0};
        int[] discount_values = {0,0,0,0};
        discount_values[0] = 10;
        discount_values[1] = 20;
        discount_values[2] = 30;
        discount_values[3] = 40;
        for(x=0;x<Num_catCtes;++x){
            System.out.println("Ingrese el descuento del cliente >> ");
            try {
                discount[x] = Integer.parseInt(br.readLine());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nDescuentos de los clientes");
        for(x=0;x<Num_catCtes;++x){
            System.out.print(discount[x]+"\n" + arreglo.getCtes(x)+"\n");
        }
        System.out.println();


        //dar de  alta un nuevo cliente junto a su compra
        String new_name;
        int new_discount;
        int new_itemOrdered = 0;
        double new_itemPrice=0.0;
        boolean isValidNewItem=false;

        System.out.println("\nIngrese el nombre del nuevo cliente >> ");
        try {

            new_name = br.readLine();
            arreglo.setCtesNames(Num_catCtes,new_name);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nIngrese el descuento del nuevo cliente >> ");
        try {
            new_discount = Integer.parseInt(br.readLine());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nIngrese el item del nuevo cliente >> ");
        try {
            new_itemOrdered = Integer.parseInt(br.readLine());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        for (int y=0; y<Number_OF_ITEMS;++y){
            if (new_itemOrdered == validValues[y]){
                isValidNewItem = true;
                new_itemPrice = prices[y];


            }

        }
        if (isValidNewItem)
            JOptionPane.showMessageDialog(null, "The price of the item : " + new_itemOrdered + "is $" + new_itemPrice);
            else
                JOptionPane.showMessageDialog(null, "The item number you entered is not valid");

    }

}
