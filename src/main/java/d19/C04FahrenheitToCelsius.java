package d19;

import java.util.Scanner;

public class C04FahrenheitToCelsius {
    public static void main(String[] args) {
        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen fahrenheit cinsinden sıcaklık degerini giriniz");
        double fahrenheit = scan.nextDouble();

        double celsius=fahrToCels(fahrenheit);
        //main method icinden kısa yoldan method olusturmak için:
        //1. methoda verecegimiz ismi yazıyoruz --> kucuk harfle baslar
        //2. method parantezi
        //3. parantezin icine methoda gondermek istedigim arguman(variable) yaz
        //4. create method

        System.out.println("celsius = " + celsius);
        System.out.println(celsius+40);

    }

    //Not: fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

    private static double fahrToCels(double fahrenheit) {
        // formül: c = (f-32)/1.8
        double celsius =(fahrenheit-32)/1.8;

        return celsius;
        //return (fahrenheit-32)/1.8;
    }


}