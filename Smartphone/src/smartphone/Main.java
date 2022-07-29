package smartphone;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        List<String> sites = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        Smartphone smartphone = new Smartphone(numbers,sites);
        System.out.print(smartphone.call());
        System.out.println(smartphone.browse());


    }
}
