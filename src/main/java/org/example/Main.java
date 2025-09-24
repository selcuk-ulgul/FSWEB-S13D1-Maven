package org.example;

public class Main {
    public static void main(String[] args) {


       


        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        boolean sonuc=false;

        if(isBarking==true && (clock>=20 && clock<=23 || clock>=0 && clock<8 )   )  sonuc=true;
       return sonuc;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
      boolean sonuc= false;
      if((firstAge<=19 && firstAge>=13)  || (secondAge<=19 && secondAge>=13) ||(thirdAge<=19 && thirdAge>=13)  ) sonuc=true;
          return sonuc;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        boolean sonuc= false;
        if(!isSummer &&  temp<=35 && temp>=25) sonuc=true;
        if(isSummer &&  temp<=45 && temp>=25) sonuc=true;

        return sonuc;
    }

    public static double area(double width, double height) {
       double sonuc=0;
       sonuc=width*height;
       if(sonuc<0) sonuc=-1;
       return sonuc;
    }

    public static double area(double radius) {
        double sonuc = 0;
        sonuc = radius * radius * Math.PI;

        if (sonuc < 0) sonuc = -1;
        return sonuc;


    }

}
