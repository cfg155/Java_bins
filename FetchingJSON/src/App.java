import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

import org.json.*;

import jdk.nashorn.internal.parser.JSONParser;

public class App {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://raw.githubusercontent.com/acad600/JSONRepository/master/ISYS6203/O212-ISYS6203-RM01-00-DotaMarketplace.json");
        HttpURLConnection conn =  (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        int responseCode = conn.getResponseCode();


        if(responseCode != 200) throw new RuntimeErrorException(null, "Error : " + responseCode);
        else{
            
            String inline="";
            java.util.Scanner sc = new Scanner(url.openStream());
            while(sc.hasNext()){
                inline+=sc.nextLine();
            }
            System.out.println("\n JSON DATA in String Format");
            System.out.println(inline);
            sc.close();
        }

        JSONParser parse = new JSONParser();
        JSONObject jobj = (JSONObject)parse.parse(inline);
    }
}
