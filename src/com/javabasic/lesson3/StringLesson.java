package com.javabasic.lesson3;

public class StringLesson {
    public static void main(String[] args) {
        String h = "ToiYeuDaNang";
        String s = "ToiYeuHaNoi";

        String h1 = "Toi";
        String h2 = "Yeu";
        String h3 = "Da";
        String h4 = "Nang";
        String h5 = h1.concat(h2).concat(h3).concat(h4);


        String x1 = "";
        String x2 = "sql";
        //1
        System.out.println("Character position a: " + h.indexOf("a") + "," + h.lastIndexOf("a") );
        //2
        System.out.println("Split string: " + h.substring(0,3) + "," + h.substring(3,6) + ","
                + h.substring(6,8) + "," + h.substring(8,12));
        //3
        System.out.println("String concatenation: " + h3 + h5);
        //4
        System.out.println("Cutting strings: " + h.substring(6,12));
        //5
        System.out.println("Rename string: " + s.replace("ToiYeuDaNang","ToiYeuHaNoi"));
        //6
        System.out.println("Check for empty string: " + x1.isEmpty() + "," + x2.isEmpty());

    }
}
