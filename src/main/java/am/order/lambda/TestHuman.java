package am.order.lambda;

import java.util.ArrayList;
import java.util.List;

public class TestHuman {
    public static void main(String[] args) {

        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Ani", 27));
        humans.add(new Human("Karen", 24));
        humans.add(new Human("Mari", 32));
        humans.add(new Human("Shushan", 40));
        humans.add(new Human("Marianna", 35));

       List<String> a = humans.stream()
               .sorted((h1, h2)-> h1.getAge()- h2.getAge()).map(human-> human.getName()).toList();
        System.out.println(a);



//        List<String> streamNames = humans.stream()
//                .map(human -> human.getName()).sorted()
//                .toList();
//        System.out.println(streamNames);
    }

}
