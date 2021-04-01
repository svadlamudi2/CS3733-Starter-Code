package edu.wpi.teamname.views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loanController {

    @FXML
    private TextField rate;

    @FXML
    private TextField loanAmount;

    @FXML
    private TextField numMonths;

    @FXML
    private Label monthlyPayment;


    public void calculatePressed(ActionEvent actionEvent) {

        Double numRate = Double.parseDouble(rate.getText());
        Double numLoanAmt = Double.parseDouble(loanAmount.getText());
        Double numMonthAmt = Double.parseDouble(numMonths.getText());

        Double value = numLoanAmt * Math.pow(1+ (numRate/numMonthAmt),numMonthAmt );

        monthlyPayment.setText(value.toString());


    }
}
