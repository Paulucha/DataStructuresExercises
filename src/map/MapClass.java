package map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class MapClass {

    public static void main(String[] args) throws IOException {
        String filePath = "/home/paulinaprzekop/development/14.06.2018 strukturyDanych/jjdd4-materialy-struktury-danych/DataStructuresProjects/f.properties";
        HashMap<String, String> map = new HashMap<String, String>();
        System.out.println(Files.readAllLines(Paths.get(filePath)));

        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null)
        {
            String[] parts = line.split("=", 2);
            if (parts.length >= 2)
            {
                String key = parts[0];
                String value = parts[1];
                map.put(key, value);
            } else {
                System.out.println("ignoring line: " + line);
            }
    }
        for (String key : map.keySet())
        {
            System.out.println(key + " : " + map.get(key));
        }

        map.put("kolejny klucz", "wartosc klucza");
        map.remove("property1key");
        System.out.println(map);
}}
