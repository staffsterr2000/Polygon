package project2;

interface My {
    void method(String s);
}
class Helper {
    private final String mess;
    public void method(My my) {
        my.method(mess);
    }
    public Helper(String mess) {
        this.mess = mess;
    }
}

public class Main {
//    static String[] args = new String[] {"inat", "ion"};

    public static void main(String[] args) {
        My inter = x -> System.out.println("the first realisation! String: " + x);
        My inter2 = x -> System.out.println("a new realisation! but still working! String: " + x);

        new Helper("inter").method(inter);
        new Helper("inter2").method(inter2);

//        try {
//            Stream<String> stream = Files.lines(Paths.get("c:/temp/zachet.txt"));
//            List<String> list = stream
//                    .filter(string -> !string.isEmpty())
//                    .filter(string -> !string.contains("-"))
//                    .filter(string -> string.contains("NULL"))
//                    .sorted(String::compareTo)
//                    .collect(Collectors.toList());
//            list.forEach(System.out::println);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
