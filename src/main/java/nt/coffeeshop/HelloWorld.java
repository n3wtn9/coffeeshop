package nt.coffeeshop;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {

        get("/hello", (req, res) -> "Hello World");

        get("/menu", (req, res) ->
                "1. espresso " +
                "2. americano " +
                "3. latte");

        post("/order", (req, res) -> {
            res.body("order comming...");
            return "done";
        });
    }
}
