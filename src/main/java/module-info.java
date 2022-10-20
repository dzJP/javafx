module se.iths.jp.javafxjp {
    requires javafx.controls;
    requires javafx.fxml;


    opens se.iths.jp.javafxjp to javafx.fxml;
    exports se.iths.jp.javafxjp;
}