package hu.petrik_13e.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.math.BigDecimal;

public class HelloController {
    @FXML
    private Button negativ;
    @FXML
    private TextField leftfield;
    @FXML
    private TextField rightfield;
    @FXML
    private Button divide;
    @FXML
    private Button szor;
    @FXML
    private Button plusz;
    @FXML
    private Button percent;
    @FXML
    private TextArea aswer;

    public Boolean check(){
        if(leftfield.getText().equals("") || rightfield.getText().equals("")){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("nem lehetüres");
            alert.showAndWait();
            return Boolean.FALSE;
        }
        try{
            Double.parseDouble(leftfield.getText());
            Double.parseDouble(rightfield.getText());
            return  Boolean.TRUE;
        }catch (NumberFormatException e){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("számot kell megadni");
            alert.showAndWait();
            return  Boolean.FALSE;
        }

    }


    @FXML
    public void div() {
        if(check()){

            double number = Double.parseDouble(leftfield.getText())/ Double.parseDouble(rightfield.getText());
            int decimalsToConsider = 2;
            BigDecimal bigDecimal = new BigDecimal(number);
            BigDecimal roundedWithScale = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
            aswer.setText(String.valueOf(roundedWithScale));
        }




    }

    @FXML
    public void perc() {
        if(check()){

            double number = Double.parseDouble(leftfield.getText())% Double.parseDouble(rightfield.getText());
            int decimalsToConsider = 2;
            BigDecimal bigDecimal = new BigDecimal(number);
            BigDecimal roundedWithScale = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
            aswer.setText(String.valueOf(roundedWithScale));
        }
    }

    @FXML
    public void szorr() {
        if(check()){
            double number = Double.parseDouble(leftfield.getText())* Double.parseDouble(rightfield.getText());
            int decimalsToConsider = 2;
            BigDecimal bigDecimal = new BigDecimal(number);
            BigDecimal roundedWithScale = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
            aswer.setText(String.valueOf(roundedWithScale));
        }
    }

    @FXML
    public void negat() {
        if(check()){

            double number = Double.parseDouble(leftfield.getText())- Double.parseDouble(rightfield.getText());
            int decimalsToConsider = 2;
            BigDecimal bigDecimal = new BigDecimal(number);
            BigDecimal roundedWithScale = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
            aswer.setText(String.valueOf(roundedWithScale));
        }
    }

    @FXML
    public void plusszs() {
        if(check()){

            double number = Double.parseDouble(leftfield.getText())+ Double.parseDouble(rightfield.getText());
            int decimalsToConsider = 2;
            BigDecimal bigDecimal = new BigDecimal(number);
            BigDecimal roundedWithScale = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
            aswer.setText(String.valueOf(roundedWithScale));
        }
    }
}