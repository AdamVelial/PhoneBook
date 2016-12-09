package main;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;

/**
 * Created by art on 08.12.16.
 */
public class PhonesTests {


    private Phones phones;
    private List<String> persons = Arrays.asList();

    @Before
    public void init(){
        this.phones = new Phones();
        this.persons = Arrays.asList(
                "Иванов И.И.",
                "Петров П.П.",
                "Сидоров С.С."
        );
    }

    @Test
    public void test(){
        assertTrue(phones.get("").equals(new ArrayList<>()));

        assertTrue(phones.get(persons.get(0)).equals(asList("+8 800 2000 500", "+8 800 200 600"))); //Иванов И.И
        assertTrue(phones.get(persons.get(1)).equals(asList("+8 800 2000 700"))); // Петров П.П.
        assertTrue(phones.get(persons.get(2)).equals(asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000"))); //Сидоров С.С.

    }
}
