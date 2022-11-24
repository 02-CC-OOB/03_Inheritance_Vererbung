package com.cc.java;

public class TomCat {
 
   private String name;
   private String furColor;

   private int age;

   

    public TomCat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
}

    public String getStringAttributes(String flag) {
        switch (flag) {
            case "#name":
                return name;
            case "#color":
                return furColor;
            default:
                return "#!ERROR";
        }
    }

    public String getAge() {
            return Integer.toString(age);

}

}