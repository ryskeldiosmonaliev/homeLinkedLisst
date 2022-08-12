import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[14];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Integer> list = new ArrayList<Integer>(array.length);

        for (int i = 0; i < array.length; i++) {
            list.add(random.nextInt(0, 2));
            arrayList.add(random.nextInt(0, 2));
            linkedList.add(random.nextInt(0, 2));
        }
        System.out.println("до: " + list);
        Coperator(list);
        System.out.println("--------------------------------------------------");
        System.out.println("до: " + arrayList);
        Coperator(arrayList);
        System.out.println("--------------------------------------------------");
        System.out.println("до: " + linkedList);
        Coperator(linkedList);


    }

    public static void Coperator(List list) {
        Collections.sort(list);
        System.out.println("после: " + list);
    }

    public static void Coperator(ArrayList arrayList) {
        Collections.sort(arrayList);
        System.out.println("после: " + arrayList);
    }

    public static void Coperator(LinkedList linkedList) {
        Collections.sort(linkedList);
        System.out.println("после : " + linkedList);
    }

}