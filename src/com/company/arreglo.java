package com.company;



public class arreglo {
    private String ctesNames;
    private static String[] ctes = new String[4];
    private static String CtesName;


    public void setCtesNames(String ctes) {
        ctesNames = ctes;
    }
    public static void setCtesNames(int number, String name) {
        ctes[number] = name;
    }



    public static String getCtes(int numeber) {
        return ctes[numeber];
    }
}
