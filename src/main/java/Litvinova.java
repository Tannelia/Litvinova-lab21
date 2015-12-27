import org.kohsuke.randname.RandomNameGenerator;

import java.util.Arrays;

public class Litvinova {
    public static void main(String[] args) {
        System.out.println("I am Litvinova Tatyana");
        RandomNameGenerator rnd = new RandomNameGenerator(0);
        Litvinova litvinova = new Litvinova();
        litvinova.fourteenNames(rnd);
        litvinova.threeRand();
        litvinova.myName("татьяна");
    }

    //15 произвольных имен
    public void fourteenNames(RandomNameGenerator randomNameGenerator) {
        String[] name = new String[15];
        for(int i = 0; i < 15; i++) {
            name[i] = randomNameGenerator.next();
        }
        for(String x: name) {
            System.out.println("Hello, " + x);
        }
        Arrays.sort(name); // Сортировка по возрастанию
        System.out.println();
        int iteration = 0;
        for(String x: name) {
            if(iteration >= 2 && iteration <= 4) { // Приветствуем только элементы от 3 до 5
                System.out.println("Hello, " + x.toUpperCase()); // И выводим их в верхнем регистре
            } else {
                System.out.println(x);
            }
            iteration++;
        }
    }

    //Массив 30 случайных чисел
    public void threeRand() {
        int[] randArray = new int[30];
        for(int i = 0; i < 30; i++) {
            randArray[i] = 155 + (int) (Math.random() * 100);
        }
        int even = 0; //Счетчик четных чисел
        for(int x: randArray) {
            if(x % 2 == 0)
                even++;
            System.out.println("Rand Num: " + x);
        }
        System.out.println("Even numbers: " + even);
    }
    // Считаем количество гласных в имени
    public void myName(String name) {
        int nums = 0;
        char[] symbols = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};
        char[] chars = name.toCharArray();
        for (char x: chars) {
            for(char y: symbols) {
                if(x==y) {
                    nums++;
                }
            }
        }

        Arrays.sort(chars);
        for (char x: chars) {
            System.out.println(x);
        }
        System.out.print("Ваше имя содержит: " + nums + " гласных");
    }
}
