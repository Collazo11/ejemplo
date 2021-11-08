package com.company;



public class arreglo {
    private String ctesNames;
    private static String[] ctes = new String[4];
    private String CtesName;

    public void setCtesNames(String ctes) {
        ctesNames = ctes;
    }

    public static void setCtesNames(int numeber, String name) {
        ctes[numeber] = name;
    }

    public static String getCtes(int numeber) {
        return ctes[numeber];
    }
}
