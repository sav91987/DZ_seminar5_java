    //1)Реализуйте структуру телефонной книги с помощью HashMap. Программа также должна учитывать, что во входной структуре будут
//повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. 
//Вывод должен быть отсортирован по убыванию числа телефонов.
//(можно выводить без сортировки, но обязательно в отдельном методе)

package Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1 {

    public static void fillAndPrintPhoneBook(HashMap<Integer, String> hMapIdAndSurnames, //Метод заполняет и печатает тел. книгу
            ArrayList<ArrayList<Integer>> phonesList) {

        HashMap<Map.Entry<Integer, String>, ArrayList<Integer>> pb = new HashMap<>();
        int i = 0;
        for (Map.Entry<Integer, String> item : hMapIdAndSurnames.entrySet()) { 
            pb.put(item, phonesList.get(i));                                            //Заполняем книгу: в качестве ключа - (ключ: id, value Фамилия),
            i++;                                                                        //в качестве значения - list из телефонов
        }

        for (Map.Entry<Map.Entry<Integer, String>, ArrayList<Integer>> item : pb.entrySet()) {
            System.out.println("id: " + item.getKey() + "\t-\t " + item.getValue());
        }
    }

}    