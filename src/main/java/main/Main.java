package main;

import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Phones phones = new Phones();

        String inputText;

        System.out.println("Телефонный справочник.");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nВведите фамилию: ");
            //inputText = System.console().readLine();
            inputText =  scanner.nextLine();
            List<String> list = phones.get(inputText);
            System.out.println(list.isEmpty() ? Phones.NOT_FOUND : String.join("\n", list).toString());
        }
    }
}
