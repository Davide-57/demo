/**
 * Sample Skeleton for 'calculator-view.fxml' Controller Class
 */

package test.javafx.calcolatrice.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    private String op="";
    private Double n1;
    private Double n2;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="button0"
    private Button button0; // Value injected by FXMLLoader

    @FXML // fx:id="button1"
    private Button button1; // Value injected by FXMLLoader

    @FXML // fx:id="button2"
    private Button button2; // Value injected by FXMLLoader

    @FXML // fx:id="button3"
    private Button button3; // Value injected by FXMLLoader

    @FXML // fx:id="button4"
    private Button button4; // Value injected by FXMLLoader

    @FXML // fx:id="button5"
    private Button button5; // Value injected by FXMLLoader

    @FXML // fx:id="button6"
    private Button button6; // Value injected by FXMLLoader

    @FXML // fx:id="button7"
    private Button button7; // Value injected by FXMLLoader

    @FXML // fx:id="button8"
    private Button button8; // Value injected by FXMLLoader

    @FXML // fx:id="button9"
    private Button button9; // Value injected by FXMLLoader

    @FXML // fx:id="buttonAdd"
    private Button buttonAdd; // Value injected by FXMLLoader

    @FXML // fx:id="buttonDiv"
    private Button buttonDiv; // Value injected by FXMLLoader

    @FXML // fx:id="buttonDot"
    private Button buttonDot; // Value injected by FXMLLoader

    @FXML // fx:id="buttonEquals"
    private Button buttonEquals; // Value injected by FXMLLoader

    @FXML // fx:id="buttonMolt"
    private Button buttonMolt; // Value injected by FXMLLoader

    @FXML // fx:id="buttonSottr"
    private Button buttonSottr; // Value injected by FXMLLoader

    @FXML // fx:id="txt_result"
    private TextField txt_result; // Value injected by FXMLLoader

    @FXML
    void onButtonNumberClick(ActionEvent event) {
        String num = ((Button)event.getSource()).getText();
        txt_result.setText(txt_result.getText()+num);
    }

    @FXML
    void onButtonOperationalClick(ActionEvent event) {
        String operation = ((Button)event.getSource()).getText();
        if(!operation.equals("=")){

            //se op non è "" allora deve essere cliccato il simbolo "=" prima di procedere con un'altra operazione
            if(!op.equals("")) { return; }

            op = operation;
            n1 = Double.parseDouble(txt_result.getText());
            txt_result.setText("");
        }else{

            //se op = "" allora non c'è nulla da calcolare
            if(op.equals("")) { return; }

            n2 = Double.parseDouble(txt_result.getText());
            calculate();
            op="";
        }
    }

    public void calculate(){
         switch (op){
             case "+": txt_result.setText(n1+n2 + ""); break;
             case "-": txt_result.setText(n1-n2 + ""); break;
             case "x": txt_result.setText(n1*n2 + ""); break;
             case "÷":
                 if(n2 == 0){
                     txt_result.setText("Error"); break;
                 }
                 txt_result.setText(n1/n2 + ""); break;
         }
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert button0 != null : "fx:id=\"button0\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert button2 != null : "fx:id=\"button2\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert button3 != null : "fx:id=\"button3\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert button4 != null : "fx:id=\"button4\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert button5 != null : "fx:id=\"button5\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert button6 != null : "fx:id=\"button6\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert button7 != null : "fx:id=\"button7\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert button8 != null : "fx:id=\"button8\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert button9 != null : "fx:id=\"button9\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert buttonAdd != null : "fx:id=\"buttonAdd\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert buttonDiv != null : "fx:id=\"buttonDiv\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert buttonDot != null : "fx:id=\"buttonDot\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert buttonEquals != null : "fx:id=\"buttonEquals\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert buttonMolt != null : "fx:id=\"buttonMolt\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert buttonSottr != null : "fx:id=\"buttonSottr\" was not injected: check your FXML file 'calculator-view.fxml'.";
        assert txt_result != null : "fx:id=\"txt_result\" was not injected: check your FXML file 'calculator-view.fxml'.";

    }

}
