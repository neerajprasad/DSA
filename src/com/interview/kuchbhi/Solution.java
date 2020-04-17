package interview.kuchbhi;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println(calculateHoldingValue("12321"));
    }
    public static double calculateHoldingValue(String date) throws IOException {
        HashMap<String,String> holdingMap = new HashMap<>();
        double result=0;
        String holdingJson =  sendGET("https://api.myjson.com/bins/1eleys");
        String securityJson =  sendGET("https://api.myjson.com/bins/1eleys");

        List<Pricing> securities = getSecurityDetails(securityJson);

        List<Holding> holdings = getHoldingDetails(holdingJson);

        for (Holding holding : holdings) {
            holdingMap.put(holding.getSecurity(), holding.getQuantity());
        }

        result = getResult(holdingMap, result, securities);

        return result;
    }

    private static double getResult(HashMap<String, String> holdingMap, double result, List<Pricing> securities) {
        for (Pricing price:securities) {
            String holding = holdingMap.get(price.getSecurity());
            result += Double.valueOf(holding) * Double.valueOf(price.getMarketPrice());
        }
        return result;
    }

    private static List<Holding> getHoldingDetails(String json){
        Gson gson = new Gson();
        List<Holding> holdings = gson.fromJson(json,List.class);
        return holdings;
    }

    private static List<Pricing> getSecurityDetails(String json){
        Gson gson = new Gson();
        List<Pricing> securitys = gson.fromJson(json,List.class);
        return securitys;
    }
    private static String sendGET(String GET_URL) throws IOException {
        URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
           return response.toString();
        } else {
            System.out.println("GET request not worked");
        }
        return "";
    }
}
class Holding{
    private String security;
    private String quantity;

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

class Pricing{
    private String security;
    private String marketPrice;

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }
}
