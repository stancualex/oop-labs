import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> fructe = new ArrayList<>();
        fructe.add("Apple");
        String apple = fructe.getFirst();
        fructe.set(0, "Orange");
//        fructe.remove(0);
        for (int i = 0; i < fructe.size(); i++) {
            if (fructe.get(i).equals("Orange")) {
                fructe.set(i, "Apple");
            }
        }
//        for (String fruct : fructe) {
//            if (fruct.equals("Orange")) {
//                fruct = "Apple";
//            }
//        }
//        ListIterator<String> iterator = fructe.listIterator();
//        for (ListIterator<String> it = fructe.listIterator(); it.hasNext();) {
//            String fruct = iterator.next();
//            if (fruct.equals("Orange")) {
//                fruct = "Apple";
//            }
//        }
        System.out.println(fructe);
        HashMap<String, Integer> hashMap = new HashMap<>();
        String text = "Buna ce mai faci Buna sunt mai bine";
        for (String word : text.split(" ")) {
            if (!hashMap.containsKey(word)) {
                hashMap.put(word, 1);
            } else {
                int count = hashMap.get(word);
                hashMap.replace(word, count + 1);
            }
        }
        System.out.println(hashMap);
    }
}