import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {

    public static void main(String[] args) {

        System.out.println("Task1");

        HashMap<Integer, String> idAndSurname = new HashMap<>(); // Заполняем Map id (Чтобы избежать повторов фамилий) +
                                                                 // фамилия
        idAndSurname.put(1, "Иванов");                 // Данный Map будет Key для сборки итогового Map
        idAndSurname.put(2, "Иванов");
        idAndSurname.put(3, "Иванов");
        idAndSurname.put(4, "Петров");
        idAndSurname.put(5, "Сидоров");
        idAndSurname.put(6, "Холодов");

        ArrayList<ArrayList<Integer>> phones = new ArrayList<>();   // Заполняем List List`ами из телефонов.
        phones.add(new ArrayList<>(List.of(111, 112, 113)));        // Он будет Value для сборки итогового Map
        phones.add(new ArrayList<>(List.of(221, 222)));
        phones.add(new ArrayList<>(List.of(331, 332, 333, 444)));
        phones.add(new ArrayList<>(List.of(444)));
        phones.add(new ArrayList<>(List.of(555)));
        phones.add(new ArrayList<>(List.of(666)));

        Solutions.task1.fillAndPrintPhoneBook(idAndSurname, phones);


        System.out.println("Task2");
    }
}
