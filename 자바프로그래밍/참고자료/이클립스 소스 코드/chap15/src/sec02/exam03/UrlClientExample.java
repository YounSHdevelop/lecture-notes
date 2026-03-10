package sec02.exam03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlClientExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            
            URLConnection connection = url.openConnection();
            
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            
            String inputLine;
            System.out.println("--- Google.com에서 받은 응답 ---");
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}