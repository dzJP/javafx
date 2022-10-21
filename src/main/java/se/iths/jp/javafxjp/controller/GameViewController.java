package se.iths.jp.javafxjp.controller;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import se.iths.jp.javafxjp.model.GameAnimation;
import se.iths.jp.javafxjp.model.SnakeModel;

public class GameViewController {

    public Canvas canvas;

    public GraphicsContext context;

    public SnakeModel snake = new SnakeModel();

    public void initialize() {
        context = canvas.getGraphicsContext2D();
        gameAnimation.start();
    }


    GameAnimation gameAnimation = new GameAnimation() {
        float time;
        @Override
        public void tick(float secondsSinceLastFrame) {
            time += secondsSinceLastFrame;
            if (time < 0.2)
                return;

            render();
        }
    };


    public void render() {
        context.setFill(Color.web("#eddeaf"));
        context.setFill(Color.YELLOW);
        context.fillRect(0,0,400,400);
        context.setFill(Color.BLUE);
        context.fillRect((snake.getPosition().x() * 10),(snake.getPosition().y() * 10), 5,5);
    }
}
