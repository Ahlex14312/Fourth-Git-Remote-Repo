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
public class displaydeck {
    public static void main(String[] args){
        deck deck = new deck();
        deck.shuffle();
        for (int suit=1; suit<=deck.numSuits; suit++){
            for (int rank=1; rank<=deck.numRanks; rank++){
                card card = deck.getCard(suit, rank);
                //System.out.println(card.rank + " "+ card.suit);
                System.out.println(card.rankToCardName(card.rank)+" "+card.suitToCardName(card.suit));
            }
        }
        
    }
}