package SnakeGame;

import java.awt.Color;

public class FastFood extends Food{
    public FastFood() {
        super();
    }
    public void functionality(Snake sn) {
        sn.setSpeed(sn.getSpeed()-10);
    }
    public Color getColor(){
        return Color.yellow;
    }
}