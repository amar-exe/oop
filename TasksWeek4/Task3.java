package com.company;

public class Task3 {
    public static void main(String[] args){

        //Part1 Test
        LyyraCard card = new LyyraCard(50);
        System.out.println(card);


        //Part2 Test
        System.out.print("\n-------------\n");
        LyyraCard card2 = new LyyraCard(50);
        System.out.println(card2);

        card2.payEconomical();
        System.out.println(card2);

        card2.payGourmet();
        card2.payEconomical();
        System.out.println(card2);


        //Part3 Test
        System.out.print("\n-------------\n");
        LyyraCard card3 = new LyyraCard(5);
        System.out.println(card3);

        card3.payGourmet();
        System.out.println(card3);

        card3.payGourmet();
        System.out.println(card3);


        //Part4 Test
        System.out.print("\n-------------\n");
        LyyraCard card4 = new LyyraCard(10);
        System.out.println(card4);

        card4.loadMoney(15);
        System.out.println(card4);

        card4.loadMoney(10);
        System.out.println(card4);

        card4.loadMoney(200);
        System.out.println(card4);


        //Part5 Test
        System.out.print("\n-------------\n");
        System.out.println("Final Test");
        System.out.print("\n-------------\n");

        LyyraCard Pekka = new LyyraCard(20);
        LyyraCard Brian = new LyyraCard(30);

        Pekka.payGourmet();
        Brian.payEconomical();

        System.out.println("Pekka: " + Pekka);
        System.out.println("Brian: " + Brian);

        Pekka.loadMoney(20);
        Brian.payGourmet();

        System.out.println("Pekka: "+ Pekka);
        System.out.println("Brian: "+ Brian);

        Pekka.payEconomical();
        Pekka.payEconomical();

        Brian.loadMoney(50);

        System.out.println("Pekka: "+ Pekka);
        System.out.println("Brian: "+ Brian);
    }
}
