package ru.mirea;

public class Main {

    public static void main(String[] args) {
    //упр. 1
	Student[] array = {
	        new Student(115, "Иванов И.И.", 56),
            new Student(1, "Белов А.Д.", 20),
            new Student(509, "Сидорова О.М", 78),
            new Student(45, "Цветков Д.Д.", 100),
            new Student(5, "Иванов И.И.", 56),
            new Student(1049, "Кашкина П.Г.", 74),
            new Student(789, "Леонов О.Т", 89),
            new Student(89, "Ткачук Л.У.", 35),
            new Student(301, "Минаев Ф.И", 74),
            new Student(790, "Петров Н.В.", 88),
    };

	System.out.println("Массив до сортировки вставками по id студента:");
        for (Student i: array) {
            System.out.println(i.toString());
        }

    //сортировка вставками по id студента
    for (int left = 0; left < array.length; left++) {
        // Вытаскиваем значение элемента
        Student value = array[left];
        // Перемещаемся по элементам, которые перед вытащенным элементом
        int i = left - 1;
        for (; i >= 0; i--) {
            // Если вытащили значение меньшее — передвигаем больший элемент дальше
            if (array[i].compareTo(value) > 0) {
                array[i + 1] = array[i];
            } else {
                // Если вытащенный элемент больше — останавливаемся
                break;
            }
        }
        // В освободившееся место вставляем вытащенное значение
        array[i + 1] = value;
    }

    System.out.println("\nМассив после сортировки вставками по id студента:");
    for (Student i: array) {
        System.out.println(i.toString());
    }

    //упр. 2

    System.out.println("\nМассив до быстрой сортировки (по убыванию) по итоговому баллу студента:");
    for (Student i: array) {
        System.out.println(i.toString());
    }

    Sort.sortStudentsByGPA(array);

    System.out.println("\nМассив после быстрой сортировки (по убыванию) по итоговому баллу студента:");
    for (Student i: array) {
        System.out.println(i.toString());
    }

    //Упр. 3

    Student[] array1 = {
            new Student(45, "Цветков Д.Д.", 100),
            new Student(578, "Иванов И.И.", 56),
            new Student(53, "Кашкина П.Г.", 74),
            new Student(789, "Леонов О.Т", 89),
    };

    Student[] array2 = {
            new Student(115, "Иванов И.И.", 56),
            new Student(10, "Белов А.Д.", 20),
            new Student(509, "Сидорова О.М", 78),
            new Student(89, "Ткачук Л.У.", 35),
            new Student(35, "Минаев Ф.И", 74),
            new Student(790, "Петров Н.В.", 88),
    };

    System.out.println("\nМассив array1 до сортрировки слиянием:");
    for (Student i: array1) {
        System.out.println(i.toString());
    }

    System.out.println("\nМассив array2 до сортрировки слиянием:");
    for (Student i: array2) {
        System.out.println(i.toString());
    }

    Student[] array3 = Sort.sortMerge(array1, array2);

    System.out.println("\nМассив array3 после сортрировки слиянием:");
    for (Student i: array3) {
        System.out.println(i.toString());
    }
    }
}
