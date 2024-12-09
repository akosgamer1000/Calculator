module hu.petrik_13e.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.petrik_13e.calculator to javafx.fxml;
    exports hu.petrik_13e.calculator;
}