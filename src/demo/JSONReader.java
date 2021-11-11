package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JSONReader {


    public JSONReader(){

    }


    public void damn() throws Exception{
        String url = "https://www.breakingbadapi.com/api/quotes";

            URL urlObject = new URL(url);
            HttpURLConnection con = (HttpURLConnection) urlObject.openConnection();
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();
            System.out.println(responseCode);

            BufferedReader bf = new BufferedReader(
                    new InputStreamReader(con.getInputStream())
            );
            String inputLine;

            StringBuffer response = new StringBuffer();
            while((inputLine=bf.readLine())!=null){
                response.append(inputLine);
            }
            bf.close();

        System.out.println(response.toString());



    }
}
