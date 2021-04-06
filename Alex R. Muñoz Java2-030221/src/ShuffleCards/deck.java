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
import java.util.Random;

public class deck {
    public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCards = numSuits * numRanks;
    private static Random testRandom = new Random();
    private card[][] cards;
    
    public deck(){
        cards = new card[numSuits][numRanks];
        for (int suit = 1; suit<=numSuits; suit++){
            for (int rank = 1; rank<=numRanks; rank++){
                cards[suit-1][rank-1] = new card(rank,suit);
            }
        }
    }
    public card getCard(int suit, int rank){
        return cards[suit-1][rank-1];
    }
    
    public void shuffle(){
       int currentcard = 0;
       for(int first = 0;first < numSuits;first++){
           int suitCard = testRandom.nextInt(numSuits);
           for (int second = 0; second < numRanks; second++){
               int rankCard = testRandom.nextInt(numRanks);
               card temp = cards[first][second];
               cards[first][second] = cards [suitCard][rankCard];
               cards [suitCard][rankCard] = temp;
           }
       }
   }
}