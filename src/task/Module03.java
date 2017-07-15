package task;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by VladislavGolovatyuk on 15.07.17.
 * @version 1.0
 */
public class Module03 {
    public static void main(String[] args) {

        //ввод размера массива

        Scanner sc = new Scanner(System.in);

        System.out.println("Здравствуйте!!! Сегодня Вы увидите свой первый Java массив.");
        System.out.println("Для этого следуй инструкциям с консоли и удачи)");
        System.out.println();
        System.out.println();
        System.out.println("Введите пожалуйста желаемую длину массива");

        int arraysLenght = sc.nextInt();
        int[] myArray = new int[arraysLenght];

        System.out.println("Отлично, вы создали массив на " + arraysLenght + " элементов(-а), а теперь" +
                " давайте заполним массив числами.");
        System.out.println("Вводите числа с клавиатуры, разделяя их пробелами: ");
        System.out.println("П.С. попробуйте вести несколько элементов со значением 5 и у видите их количество в массиве.");
        System.out.println("А после нажатия клавиши ENTER, вы получите информацыию о своем первом Java массиве)");

        //заполнение массива элементами с клавиатуры

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }

        String s = Arrays.toString(myArray);

        //максимум без сортировки

        int maxNumberOfArray = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maxNumberOfArray)
                maxNumberOfArray = myArray[i];
        }

        //минимум без сортировки

        int minNumberOfArray = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < minNumberOfArray)
                minNumberOfArray = myArray[i];
        }

        //Вывод инфы о массиве

        System.out.println("А вот и элементы Вашего массива: " + s);
        System.out.println("Наибольшим элементом Вашего массива является: " + maxNumberOfArray);
        System.out.println("Наименьшим элементом Вашего массива является: " + minNumberOfArray);
        System.out.println();

        //подсчёт количества элементов со значением 5

        int fiveRepeat = 0;
        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index] == 5) {
                fiveRepeat++;
            }
        }
        System.out.println("В вашем массиве есть следущее количество пятерок - " + fiveRepeat + ".");

        //сортировка массива

        for (int index = 0; index < myArray.length; index++) {
            for (int j = index; j >= 1; j--) {
                if (myArray[j - 1] > myArray[j]) {
                    int t = myArray[j];
                    myArray[j] = myArray[j - 1];
                    myArray[j - 1] = t;

                }

            }
        }
        String x = Arrays.toString(myArray);
        System.out.println();

        System.out.println("А вот-так выглядит Ваш массив после bubbleSort");
        System.out.println(x);
    }



}
