package com.tests.javatests.player;
public class Player { //jugador de dados
    private Dice dice;
    private int minNumberToWin;

    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    public boolean play(){
        int diceNumber = dice.roll();  //retorna numero random 1-6
        return diceNumber>minNumberToWin;
    }
}

