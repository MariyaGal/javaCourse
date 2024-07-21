package oop.advanced.singleton;

import io.github.cdimascio.dotenv.Dotenv;
import oop.advanced.inheritance.Rectangle;

public class WebDriver {
    private static Rectangle rectangle;

    public static Rectangle getInstance() {
        if (rectangle == null) {
            rectangle = new Rectangle(10, 20, 4, "green");
        }
        return rectangle;
    }


}
