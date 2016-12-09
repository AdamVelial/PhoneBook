package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;


public class Phones {

    public static final String NOT_FOUND = "К сожалению, ничего не найдено";
    private final Map<String, List<String>> records = new HashMap<>();

    public Phones() {
        records.put("Иванов И.И.", asList("+8 800 2000 500", "+8 800 200 600"));
        records.put("Петров П.П.", asList("+8 800 2000 700"));
        records.put("Сидоров С.С.", asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000"));
    }


    public List<String> get(String inputText) {
        return records.entrySet().stream()
                .filter(e -> e.getKey().equalsIgnoreCase(inputText))
                .map(Map.Entry::getValue)
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

    }
}
