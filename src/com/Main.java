package com;

public class Main {
    public static void main(String[] args) {
        StringUtilities utils = new StringUtilities(); //instance of StringUtilities class
        StringBuilder sb = new StringBuilder(); //instance of StringBuilder class
        while (sb.length() < 10) {
            utils.addChar(sb, 'a');
        }
        System.out.println(sb);

        System.out.println("The app is running");
    }
}