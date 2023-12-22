package util;

import org.testng.annotations.DataProvider;

import java.util.Random;

public class TestData {
    private static final String charachters = "abcdefghijklmnopqrstuvwxyz0123456789";
    private static final String[] domains = {"gmail", "yahoo", "outlook", "example", "random"};

    @DataProvider(name = "RandomUser")
    public Object[][] getRandomUserData(){
        String mail= newMail();
        return new Object[][] {
                {mail, "12345678"}
        };
    }
    @DataProvider(name = "LoginData")
    public Object[][] getLoginData(){
        return new Object[][] {
                {"nicotoala@outlook.com", "12345678"}
        };
    }
    public static String newMail() {
        StringBuilder user = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int indice = random.nextInt(charachters.length());
            user.append(charachters.charAt(indice));
        }
        String domain = domains[random.nextInt(domains.length)];
        return user.toString() + "@" + domain + ".com";
    }

}