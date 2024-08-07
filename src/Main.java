import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] input1 = {
                "Abc",
                "bCd"
        };
        String[] input2 = {
                "Oke",
                "One"
        };
        String[] input3 = {
                "Pendanaan",
                "Terproteksi",
                "Untuk",
                "Dampak",
                "Berarti"
        };


        pengelompokanHuruf(input1);
        pengelompokanHuruf(input2);
        pengelompokanHuruf(input3);
    }
    public static void pengelompokanHuruf(String[] input){
        String gabung = "";
        for (int i = 0; i < input.length; i++) {

         gabung += input[i];
        }
        String[] huruf = gabung.split("");
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String count : huruf) {
            if (!count.isEmpty()) {
                frequencyMap.put(count, frequencyMap.getOrDefault(count, 0) + 1);
            }
        }
        List<Map.Entry<String,Integer>> output = new ArrayList<>(frequencyMap.entrySet());
        output.sort((a,b)->{
            int valueComparison = b.getValue().compareTo(a.getValue());
            if (valueComparison != 0) {
                return valueComparison;
            }
            return a.getKey().compareTo(b.getKey());
        });
        for (var v : output) {
            System.out.print(v.getKey());
        }
        System.out.println(); // membuat baris baru


    }
}