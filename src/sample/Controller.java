package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField display;
    @FXML
    public Button btn0;
    @FXML
    public Button btn1;
    @FXML
    public Button btn2;
    @FXML
    public Button btn3;
    @FXML
    public Button btn4;
    @FXML
    public Button btn5;
    @FXML
    public Button btn6;
    @FXML
    public Button btn7;
    @FXML
    public Button btn8;
    @FXML
    public Button btn9;

    String clickedText = "";
    String oldText = "";
    String oldoldText = "";
    String newText = "";
    String operation = "";
    String concatedText = "";
    boolean bool = true;


    public void showDisplay(ActionEvent actionEvent) {
        if(bool == true){
            display.setText("");
            bool = false;
        }
            oldText = display.getText();
            clickedText = ((Button) actionEvent.getSource()).getText();
            concatedText = oldText + clickedText;
            display.setText(concatedText);

    }

    public void doOperation(ActionEvent actionEvent) {
        operation = ((Button)actionEvent.getSource()).getText();
        oldoldText = display.getText();
        concatedText = "";
        display.setText(concatedText);
    }

    public void showResult(ActionEvent actionEvent) {
        newText = display.getText();
        int result = 0;

            int op1 = Integer.parseInt(oldoldText);
            int op2 = Integer.parseInt(newText);


            switch (operation) {
                case "+":
                    result = op1 + op2;
                    break;
                case "-":
                    result = op1 - op2;
                    break;
                case "*":
                    result = op1 * op2;
                    break;
                case "/":
                    result = op1 / op2;
                    break;
            }


        concatedText = "" + result;
        display.setText(concatedText);
        bool = true;

    }

    public void doClear(ActionEvent actionEvent) {
        clickedText = "";
        display.setText(clickedText);
        oldText = "";
        newText = "";

    }
}
