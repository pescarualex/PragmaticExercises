package Calculations;

import java.util.Scanner;

public class PizzaParty {

    private int people;
    private int pizza;
    private int piecesOfPizza = 8;
    private int totalPieceOfPizza;
    private int piecePerPerson;
    private int restOfPieces;

    Scanner scanner = new Scanner(System.in);

    public void piecesPerPerson(){
        setTotalPieceOfPizza(getPiecesOfPizza() * getPizza());
        setPiecePerPerson(getTotalPieceOfPizza() / getPeople());
        setRestOfPieces(getTotalPieceOfPizza() % getPeople());
    }

    public void displayResult() {
        System.out.println("How many people?");
        setPeople(scanner.nextInt());
        System.out.println("How many pizzas do you have?");
        setPizza(scanner.nextInt());

        piecesPerPerson();

        System.out.println(getPeople() + " people with " + getPizza() + ". \n" +
                            "Each person gets " + getPiecePerPerson() + " pieces of pizza. \n" +
                            "There are " + getRestOfPieces() + " leftover pieces.");
    }

    public static void main(String[] args) {
        PizzaParty pizzaParty = new PizzaParty();
        pizzaParty.displayResult();
    }


    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getPizza() {
        return pizza;
    }

    public void setPizza(int pizza) {
        this.pizza = pizza;
    }

    // read-only
    public int getPiecesOfPizza() {
        return piecesOfPizza;
    }


    public int getPiecePerPerson() {
        return piecePerPerson;
    }

    public void setPiecePerPerson(int piecePerPerson) {
        this.piecePerPerson = piecePerPerson;
    }

    public int getRestOfPieces() {
        return restOfPieces;
    }

    public void setRestOfPieces(int restOfPieces) {
        this.restOfPieces = restOfPieces;
    }

    public int getTotalPieceOfPizza() {
        return totalPieceOfPizza;
    }

    public void setTotalPieceOfPizza(int totalPieceOfPizza) {
        this.totalPieceOfPizza = totalPieceOfPizza;
    }
}
