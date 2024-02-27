package App;

import java.util.HashMap;
import java.util.Map;

public class Appmap {
    public static void main(String[] args) {
        Map<String,Double> notes=new HashMap<>();
        //Q2
        notes.put("fatima",18.0);
        notes.put("hajar",19.0);
        notes.put("amina",15.0);
        //Q3
        notes.replace("amina",notes.get("amina")+1.5);
        System.out.println(notes.get("amina"));



    }
}
