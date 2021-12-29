package com.company;


import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {


        Box box =new Box(10);
        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );


        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );


        System.out.println( box );

        Purchase purchase = new Purchase("milk", 4, 2);
        System.out.println("total price: " + purchase.price());
        System.out.println(purchase);
        purchase.increaseAmount();
        System.out.println(purchase);


        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.add("buttermilk", 2);
        basket.add("cheese", 5);
        System.out.println("Shopping Cart Price: " + basket.price());
        basket.add("computer", 899);
        System.out.println("Basket Price: " + basket.price());
    }



}
