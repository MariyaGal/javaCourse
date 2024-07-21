package oop.advanced.singleton;

import io.github.cdimascio.dotenv.Dotenv;

public class Config {
    static Dotenv env=Dotenv.load();
    static String adminLogin=env.get("adminLogin");
    static String adminPassword=env.get("adminPassword");
    static String baseUrl= env.get("baseUrl");
    static int maxTime= Integer.parseInt(env.get("maxTime"));

}
