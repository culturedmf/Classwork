package APCS;

import processing.core.PApplet;

public class Testing extends PApplet {
    public static void main(String[] args) {
        PApplet.main(Testing.class);
    }

    @Override
    public void settings() {
        size(1000, 1000);
    }

    int y = (int) (Math.random() * 500);
    int x = (int) (Math.random() * 500);

    @Override
    public void draw() {
        if (mouseX <= x + 100 && mouseX >= x && mouseY <= y + 100 && mouseY >= y) {
            y = (int) (Math.random() * 500);
            x = (int) (Math.random() * 500);
        }
        background(0, 0, 0);
        rect(x, y, 100, 100);
    }

}
