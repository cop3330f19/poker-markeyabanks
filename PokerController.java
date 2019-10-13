/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author markeyabanks
 */
public class PokerController {
    @FXML private TextField txtFieldCard1;
    @FXML private TextField txtFieldCard2;
    @FXML private TextField txtFieldCard3;
    @FXML private TextField txtFieldCard4;
    @FXML private TextField txtFieldCard5;
    
    @FXML private TextField txtFieldSuit1;
    @FXML private TextField txtFieldSuit2;
    @FXML private TextField txtFieldSuit3;
    @FXML private TextField txtFieldSuit4;
    @FXML private TextField txtFieldSuit5;
    
    @FXML private Label lblResult;
    
    public void displayHand(ActionEvent event){
        int[] cardHand; //declare arrays
        int[] suits;
        int[] cardType;
        //get user input
        int card1 = Integer.parseInt(txtFieldCard1.getText());
        String suit1 = txtFieldSuit1.getText();
        int card2 = Integer.parseInt(txtFieldCard2.getText());
        String suit2 = txtFieldSuit2.getText();
        int card3 = Integer.parseInt(txtFieldCard3.getText());
        String suit3 = txtFieldSuit3.getText();
        int card4 = Integer.parseInt(txtFieldCard4.getText());
        String suit4 = txtFieldSuit4.getText();
        int card5 = Integer.parseInt(txtFieldCard5.getText());
        String suit5 = txtFieldSuit5.getText();
        
       
        
        //diplays result
        lblResult.setText("The hand is " + suit1);
    }
    
}
