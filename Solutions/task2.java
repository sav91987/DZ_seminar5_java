// 2) Алгоритм пирамидальной сортировки (HeapSort)

package Solutions;

import java.util.ArrayList;
import java.util.Random;

public class task2 {
    // Наполняем лист элементами
    public static ArrayList<Integer> fillArr() {

        ArrayList<Integer> mass = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            mass.add(rand.nextInt(10));
        }
        System.out.println(mass.toString());
        return mass;
    }

    // Алгорим сортировки
    public static void HeapSort(ArrayList<Integer> mass, int num, int i) {

        int rootIndex = i; // индекс родительского элемента
        int leftIndex = 2 * i + 1; // индекс левого дочернего элемента
        int rightIndex = 2 * i + 2; // индекс правого дочернего элемента

        // Сравнение трех элементов: родителя и двух дочерних и нахождение большего
        // и проверка на то, что индексы левый и правый не выходят за пределы списка
        if (leftIndex < num && mass.get(leftIndex) > mass.get(rootIndex)) {
            rootIndex = leftIndex;
        }
        if (rightIndex < num && mass.get(rightIndex) > mass.get(rootIndex)) {
            rootIndex = rightIndex;
        }
        // Если индекс родителя не совпал с индексом наибольшего из трех элементов, то
        // идет смена родителя
        if (rootIndex != i) {
            int temp = mass.get(i);
            mass.set(i, mass.get(rootIndex));
            mass.set(rootIndex, temp);
            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            HeapSort(mass, num, rootIndex);
        }
    }
}
