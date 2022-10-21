module se.iths.jp.javafxjp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;


    opens se.iths.jp.javafxjp to javafx.fxml;
    exports se.iths.jp.javafxjp;
    exports se.iths.jp.javafxjp.model;
    opens se.iths.jp.javafxjp.model to javafx.fxml;
    exports se.iths.jp.javafxjp.hellomodel;
    opens se.iths.jp.javafxjp.hellomodel to javafx.fxml;
    exports se.iths.jp.javafxjp.controller;
    opens se.iths.jp.javafxjp.controller to javafx.fxml;
}