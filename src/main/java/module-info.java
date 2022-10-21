module se.iths.jp.javafxjp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;


    opens se.iths.jp.javafxjp to javafx.fxml;
    exports se.iths.jp.javafxjp;
}