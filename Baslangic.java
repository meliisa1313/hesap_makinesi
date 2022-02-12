package Giris;

import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        int sayi1,sayi2,select;
        Scanner input=new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz");
        sayi1=input.nextInt();
        System.out.println("sayi2 yi giriniz");
        sayi2= input.nextInt();
        System.out.println("1:toplama,\n2:cikarma,\n 3:bolme, \n4:carpma, \n");
        select=input.nextInt();
        switch(select){
            case 1:
                System.out.println("toplam:"+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("cikarma"+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("bolme"+(sayi1/sayi2));
                break;
            case 4:
                System.out.println("carpma"+(sayi1*sayi2));
                break;
            default:
                System.out.println("hatali giris yaptiniz");


        }









        }






    }

