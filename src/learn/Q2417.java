package learn;
/*
JavaMentor задача 2.4.17

Напишите метод printOddNumbers, который принимает массив
и выводит в консоль только нечетные числа из него, через запятую.
Конец вывода должен перевести курсор на новую строку.

Пример ввода: [3,5,20,8,7,3,100]

Пример вывода: 3,5,7,3

 Упоротый способ сделать задание 2.4.17
 для тех кто не желает учить новые методы
 и хочет плодить много лишнего кода =)
 Работает МЕДЛЕНЕЕ способа со StringBuilder

 Валидатор пройден.
 */

public class Q2417 {

    public static void main(String[] args) {
        int []arr = new int[] {3,5,20,8,7,3,100};
        int[] arr2 = new int[arr.length]; // в этом массиве храним отсортированные(нечётные) числа из массива arr
        String[] sArr = new String[arr.length * 2]; // этот массив будет хранить нечётные числа из массива arr2 и запятые, делаем его сразу избыточным
        int count = 0; // счетчик
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr2[count] = arr[i];      // находим нечётные и записываем в массив arr2
                count++;
            }
        }
        count = 0;
        for (int i = 0; i < arr2.length; i++) {
            sArr[count] = Integer.toString(arr2[i]); // переводим int в String
            count++;
            sArr[count] = ",";
            count++;
        }
        for (int i = 0; i < sArr.length - 1; i++) {
            if (sArr[i + 1].equals("0") || sArr[i].equals("0")) {   //логика на проверку пустых ячеек и лишних запятых
              i++;                                                // крутим i если видим пустую ячейку или лишнюю запятую
            } else {
                System.out.print(sArr[i]);
            }
        }
        System.out.println();
    }

}
