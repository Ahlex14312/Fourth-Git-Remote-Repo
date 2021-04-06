/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShuffleCards;

/**
 *
 * @author 2ndyrGroupA
 */
public class card {
    public int rank;
    public int suit;
    
    
    public card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }
    
    public static String rankToCardName(int rank){
        switch (rank){
            case 1:
                return "Ace";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4: 
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return null;           
        }
    }
    
    public static String suitToCardName(int suit){
        switch (suit){
            case 1:
                return "Clubs";
            case 2:
                return "Diamonds";
            case 3:
                return "Hearts";
            case 4:
                return "Spades";
            default:
                return null;
        }
    }
}

