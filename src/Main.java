import java.util.ArrayList;
import java.util.List;

public class Main {
    private static String nameThird;
    private static String nameSecond;

    public static void main(String[] args) {
        First first = getFirst();
        List<Second> secondList = first.getSeconds();
        for(Second second : secondList) {
            for (Third third : second.getSeconds()){
                if (third.getName().equals("third3Name")) {
                    nameThird = third.getName();
                    nameSecond = second.getName();
//                    break;
                }
            }
        }

        System.out.println("feature/c215-cascade2c3c4c5c6c---");

        System.out.println(first.getSeconds());
        System.out.println(nameThird + " : " + nameSecond);

        secondList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

    }

    private static First getFirst() {
        Third third1 = new Third();
        third1.setName("third1Name");
        Third third2 = new Third();
        third2.setName("third2Name");
        List<Third> thirdList12 = new ArrayList<>();
        thirdList12.add(third1);
        thirdList12.add(third2);
        Third third3 = new Third();
        third3.setName("third3Name");
        Third third4 = new Third();
        third4.setName("third4Name");
        List<Third> thirdList34 = new ArrayList<>();
        thirdList34.add(third3);
        thirdList34.add(third4);

        Second second1 = new Second();
        second1.setName("second1Name");
        second1.setSeconds(thirdList12);
        Second second2 = new Second();
        second2.setName("second2Name");
        second2.setSeconds(thirdList34);
        List<Second> secondList1 = new ArrayList<>();
        secondList1.add(second1);
        secondList1.add(second2);

        First first = new First();
        first.setName("first");
        first.setSeconds(secondList1);
        return first;
    }
}
