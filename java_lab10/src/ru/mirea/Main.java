package ru.mirea;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        try {
            //1 работа метода, конвертирующего массив строк/чисел в список.
            String[] arr = new String[]{"Ivan", "Tom", "Robert"};
            Integer[] arr1 = new Integer[]{123, 58, 7};
            List<String> list = new ArrayList<>();
            List<Integer> list1 = new ArrayList<>();
            arrayConvert(arr, list);
            arrayConvert(arr1, list1);
            System.out.println("//1");
            System.out.println(list);
            System.out.println(list);

            //2 Написать класс, который умеет хранить в себе массив любых типов данных
            Integer[] ints = {4, 5, 2, 1};

            MyArray<Integer> arr2 = new MyArray<Integer>(2);
            arr2.add(5);
            arr2.add(3);
            arr2.add(4);
            System.out.println("//2");
            System.out.println(arr2);
            System.out.println(arr2.getElement(1));

            Double[] doubs = {1.1, 7.5, 4.5};
            MyArray<Double> arr3 = new MyArray<>();
            arr3.setArr(doubs);
            System.out.println(arr3);

            //3 Реализовать метод, который возвращает любой элемент массива по индексу.
            System.out.println("//3");
            System.out.println(getElementOfArr(doubs, 0));

            //4 Написать функцию, которая сохранит содержимое каталога в список и выведет первые 5 элементов на экран.
            List<File> list2 = new ArrayList<File>();
            System.out.println("//4");
            FileList("C:\\Users\\Katya\\Desktop", list2);
            for (File element : list2) {
                System.out.println(element.getName());
            }

            //5
            System.out.println("//5");
            ArrayList<Integer> arr4 = Solution.newArrayList(1, 5, 7);
            System.out.println(arr4);
            HashSet<String> hashS = Solution.newHashSet("abc", "ghj");
            System.out.println(hashS);
            List<Double> list3 = new ArrayList<Double>();
            HashMap<String, Double> hashM = Solution.newHashMap(list, list3);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static <E> void arrayConvert (E[]arr, List<E>list){
        for (int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
    }

    public static void FileList(String path, List<File> list){
        File f = new File(path);
        if (!f.exists()|| !f.isDirectory()) {
            System.out.print("Каталог не найден");
            return;
        }

        for (File elem : f.listFiles()) list.add(elem);

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + 1 + " " + list.get(i).getName());
            }
        } catch (Exception e) {
            System.out.println("В каталоге содержится меньше 5 элементов");
        }
    }

    public static <E> E getElementOfArr(E[] arr, int index) {
        if (index >= arr.length)
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + arr.length);
        return arr[index];
    }
}
