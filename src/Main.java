import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //TreeSet<String> sortedZones = new TreeSet<>(ZoneId.getAvailableZoneIds());
       //System.out.println(sortedZones);
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Псков",0);
        hashMap.put("Биробиджан",7);
        hashMap.put("Благовещенск",6);
        hashMap.put("Иркутск",5);
        hashMap.put("Калининград",-1);
        hashMap.put("Магадан",8);
        hashMap.put("Якутск",6);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Moscow"));
        //System.out.println(zonedDateTime);
        Scanner scanner = new Scanner(System.in);

            String str = scanner.nextLine();
            if(hashMap.containsKey(str)){
                for(java.util.Map.Entry<String, Integer> times:hashMap.entrySet()) {
                if(times.getKey().equalsIgnoreCase(str)) {
                   int hours= zonedDateTime.getHour()+times.getValue();
                   int min = zonedDateTime.getMinute();
                    System.out.println("Время в твоем городе - " +hours+":"+min);
                }

                }
            }else{
                System.out.println("Такого города не существует!");


        }
    }
}