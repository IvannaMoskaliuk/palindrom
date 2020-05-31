/*
 * Classname Main
 *
 * Version info 1
 *
 * Copyright Moskaliuk Ivanna KNUTE
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        //String word = "А мене нема...";
        //String word = "А результатів? Вітать лузера!";
        //String word = "Палач, рубя, бурчал: «Ап!»";
        //String word = "І мчу кіло бараболі Кучмі.";
        //String word = "Юра, хватит! - А в харю?";

        String word = "«Во, голое тело!», - вопи по воле теологов";

        word = word.replaceAll("\\.", "")
                .replaceAll(" ", "")
                .replaceAll("\\?", "")
                .replaceAll("-", "")
                .replaceAll("!", "")
                .replaceAll(",", "")
                .replaceAll(":", "")
                .replaceAll("«", "")
                .replaceAll("»", "");
        //word = word.toLowerCase();

        String template = "";

        for (int i = 0; i < word.length(); i++) {
            int index = word.length() - i - 1;
            template += word.charAt(index);

        }
        System.out.println(template);
        if ( word.equalsIgnoreCase(template)) {
            System.out.println("Це паліндром.");
        } else
        {
            System.out.println("Це не паліндром.");
        }
    }
}