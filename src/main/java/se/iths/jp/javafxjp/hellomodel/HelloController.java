package se.iths.jp.javafxjp.hellomodel;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    

    HelloModel helloModel = new HelloModel();
    @FXML
    private Label welcomeText;

    public TextField textField1;

    public Button button1;

    @FXML
    protected void initialize() {
        textField1.textProperty().bindBidirectional(helloModel.urlProperty());
        welcomeText.textProperty().bind(helloModel.quoteProperty());

//        System.out.println(Thread.currentThread().getName()); // only thread that can touch the graphic gränssnitt
    }

    @FXML
    protected void onHelloButtonClick() throws InterruptedException {
//        new Thread(()-> {                     // kommer garanterat att köra något på fx tråden
//            Platform.runLater(()->
//            button1.setText("From thread"));
//        }).start();

//        new Thread(() -> button1.setText("From Thread")).start(); // this wont work

        helloModel.loadNewQuote();

    }

    public void labelClicked(MouseEvent mouseEvent) {
        if (mouseEvent.isControlDown());
//        welcomeText.setBackground(Background.fill(Color.RED));

    }
}