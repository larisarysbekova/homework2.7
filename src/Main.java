import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String[]> List = new HashMap<>();
        List.put("девочка",new String[]{"девушка","женщина","леди"});
        List.put("мальчик",new String[]{"парень","мужчина","джентльмен"});
        List.put("книга",new String[]{"учебник","бумага","листок"});
                while (true){
                    System.out.println("Введите слово");
                    String l = scanner.nextLine();
                    Set<Map.Entry<String, String[]>> entries = List.entrySet();
                    for (Map.Entry<String, String[]> e: entries) {
                        if (l.equals(e.getKey())) {
                            List<String> synonim = Arrays.asList(List.get(l));
                            Collections.shuffle(synonim);


                            System.out.println("___________________________");
                            System.out.println("Синоним к слову" + l + ":");
                            for (String s1: synonim) {
                                System.out.println(s1);

                            }
                        }
                    }
                    for(Map.Entry<String, String[]> entry: entries) {
                        for (String s: entry.getValue()) {
                            if (l.equals(s)) {
                                System.out.println("______________");
                                System.out.println("Синоним к слову" + l +":");
                                System.out.println(entry.getKey());
                                for (String t : entry.getValue()) {
                                    System.out.println(t);
                            }
                        }
                    }

                }
                    Map<String, String[]> stringMap = new HashMap<>();
                    for (Map.Entry<String, String[]> entry : entries) {
                        String key = entry.getKey();
                        String[] value = entry.getValue();
                        for (int i = 0; i < value.length; i++) {
                            String synonims = value[i];
                            String[] value2 = new String[value.length];
                            for (int i2 = 0; i2 < value.length; i2++) {
                                String valueor = value[i2];
                                if (valueor.equals(synonims)) {
                                    value2[i2] = key;
                                }else {
                                    value2[i2] = valueor;
                                }
                                }
                            stringMap.put(synonims,value2);
                            }
                        }
                    }









    }
}


