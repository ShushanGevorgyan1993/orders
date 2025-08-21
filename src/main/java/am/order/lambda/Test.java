package am.order.lambda;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {


        Run run = (name) -> {
            System.out.println("Running fast " + name);
            System.out.println("Արագ է վազում " + name);
        };
        run.fast("Aram");
    }
}
