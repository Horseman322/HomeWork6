import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();

               int [] arr;
               int sum = 0;
               arr = new int[31];
               for (int i = 1; i < arr.length; i++) {
                   arr[i] = ((int) (Math.random() * 100_000) + 100_000);
                   sum = sum + arr[i];

               }
        System.out.println("сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
        int maxArr = -1;
               for (int j : arr) {
            if (j > maxArr)
                maxArr = j;
                                            }
        System.out.println("максимальн сумма трат за день составила " + maxArr + " рублей");
        System.out.println();

        int minArr = arr[1];
        for (int i = 1; i < arr.length; i++) {
            minArr = Math.min(minArr, arr[i]);

        }

        System.out.println("минимальная сумма трат за день составила " + minArr + " рублей");
        System.out.println();


        double midlArr = 0;
        double summa = 0;
        for (int i = 1; i < arr.length; i++) {
            summa += arr[i];
        }
        midlArr = summa / arr.length;


        System.out.println("средняя сумма трат за день составила " + midlArr + " рублей");
        System.out.println();

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int b = 0;
        for (int element : reverseFullName)
        {
            b++;
        }
        for (int i = b - 1; i >= 0; i--)
        {
            System.out.print(reverseFullName[i]);
        }
    }
}


