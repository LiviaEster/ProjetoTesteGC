/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author livia
 */
public class TelaPrincipal implements Initializable {
    
    @FXML
    private Label msg;
    
    double valor1,valor2;
    String sinal;
    
    /* @FXML
    private void handleButtonAction(ActionEvent event) {
         msg.setText(msg.getText() + ((Button)event.getSource()).getText());
    }*/
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       System.out.println("0");
         msg.setText(msg.getText() + "0");
    }
     @FXML
    private void handleButtonAction1(ActionEvent event) {
        System.out.println("1");
        msg.setText(msg.getText() + "1");
    }
      @FXML
    private void handleButtonAction2(ActionEvent event) {
        System.out.println("2");
        msg.setText(msg.getText() + "2");
    }
     @FXML
    private void handleButtonAction3(ActionEvent event) {
       System.out.println("3");
        msg.setText(msg.getText() + "3");
    }
     @FXML
    private void handleButtonAction4(ActionEvent event) {
       System.out.println("4");
        msg.setText(msg.getText() + "4");
    }
        @FXML
    private void handleButtonAction5(ActionEvent event) {
       System.out.println("5");
        msg.setText(msg.getText() + "5");
    }
     @FXML
    private void handleButtonAction6(ActionEvent event) {
       System.out.println("6");
        msg.setText(msg.getText() + "6");
    }
     @FXML
    private void handleButtonAction7(ActionEvent event) {
       System.out.println("7");
        msg.setText(msg.getText() + "7");
    }
     @FXML
    private void handleButtonAction8(ActionEvent event) {
       System.out.println("8");
        msg.setText(msg.getText() + "8");
    }
    @FXML
    private void handleButtonAction9(ActionEvent event) {
       System.out.println("9");
        msg.setText(msg.getText() + "9");
    }
    @FXML
    private void handleButtonAction10(ActionEvent event) {
        System.out.println("+");
  
       // if(sinal == null){
        valor1 = Double.parseDouble(msg.getText());
        msg.setText("");
        sinal = "soma";}
       // else{
       //     handleButtonAction12(event);
       //}
    //}
    @FXML
    private void handleButtonAction11(ActionEvent event) {
        System.out.println("-");
        
       //if(sinal == null){
        valor1 = Double.parseDouble(msg.getText());
        msg.setText("");
        sinal = "menos";
        
        }
       
       //else{
       //    handleButtonAction12(event);
       // }
   //}
    @FXML
    private void handleButtonAction12(ActionEvent event) {
           System.out.println("=");
        valor2 = Double.parseDouble(msg.getText());
        if( sinal == "soma"){
            valor1+=valor2;
            msg.setText(String.valueOf(valor1));
            valor2=0;
        }
       if(sinal == "menos"){
           valor1-=valor2;
            msg.setText(String.valueOf(valor1));
            valor2=0;
       }
       if(sinal == "CE"){
          // if(sinal == "soma"){
               if( sinal == "soma"){
            valor1+=valor2;}
              if( sinal == "menos"){
            valor1-=valor2;}
          msg.setText(String.valueOf(valor1));}
          
         // msg.setText(String.valueOf(valor1 - valor2));} 
          
       //} else {
          // msg.setText(String.valueOf(valor1 - valor2));
       //}
       
    }
    
    @FXML
    private void handleButtonAction13(ActionEvent event) {
        System.out.println("C");
        valor1=0;
        valor2=0;
        msg.setText("");
    }
    @FXML
    private void handleButtonAction14(ActionEvent event) {
        System.out.println("CE");
        valor2=0;
        sinal = "CE";
        msg.setText("");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
