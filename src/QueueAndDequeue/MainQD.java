package QueueAndDequeue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainQD {
    public static void main(String[] args) throws IOException {

        Queue myQueue = new LinkedList();
        myQueue.add("imie 1");
        myQueue.add("imie 2");
        myQueue.add("imie 3 ");
        myQueue.offer("siema");
        myQueue.add("imie8");


        System.out.println(myQueue);
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());

        for (int i = 0; 0 < myQueue.size(); i++) {
            System.out.println(myQueue.poll());
            System.out.println(myQueue.size());

        }
//    while (!myQueue.isEmpty()){
//        System.out.println(myQueue.poll());
//    }
        System.out.println();
        System.out.println();


//        Scanner read = new Scanner(new File("/home/paulinaprzekop/development/14.06.2018 strukturyDanych/jjdd4-materialy-struktury-danych/DataStructuresProjects/stos.txt"));

        Path path = Paths.get("/home/paulinaprzekop/development/14.06.2018 strukturyDanych/jjdd4-materialy-struktury-danych/DataStructuresProjects/stos.txt");
        List<String> stosik = Files.readAllLines(path);
        System.out.println(Files.readAllLines(path));

//
        int line1 = Integer.parseInt(stosik.get(0));
        System.out.println(line1);
        for (int i = 0; i < line1; i++) {
            String x = stosik.get(i + 1);
            System.out.println(x);
            String[] arr = x.split(" ");
            Deque <Integer> queue = new LinkedList<>();
            for (int j = 0; j < arr.length; j++) {
                if ("pop".equals(arr[j])) {
                    queue.pop();
                }else {
                    queue.push(Integer.parseInt(arr[j]));
                }System.out.println("warstwa stostu numer= "+j+" wynik " +queue);
            }
        }



//        System.out.println();
//        System.out.println(stosik);
//
//        System.out.println("");
//
//
//        String line2 = stosik.get(1);
//        System.out.println(line2);
//        Deque stosik2 = new LinkedList();
//        stosik2.add("1");
//        stosik2.add("2");
//        stosik2.removeLast();
//        stosik2.add("4");
//        stosik2.removeLast();
//        System.out.println("Końcowy stos 2 = " + stosik2);
//        System.out.println();
//
//
//        String line3 = stosik.get(2);
//        System.out.println(line3);
//        Deque stosik3 = new LinkedList();
//        stosik3.add("3");
//        stosik3.removeLast();
//        stosik3.add("5");
//        stosik3.removeLast();
//        System.out.println("Końcowy stos 3= " + stosik3);

//        Deque stosik = new LinkedList();
//        stosik.add(Files.readAllLines(path));
////
//        stosik.add("2");
//        stosik.
//        stosik.add("4");

//        System.out.println(stosik);


    }
}
