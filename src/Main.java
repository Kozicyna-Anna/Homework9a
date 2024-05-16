public class Main {
    public static void main(String[] args) {
        {
            System.out.println("\nTask1");

            int[] element = {88, 534, 2689, 52047, 657855};
            int sum = 0;
            for (int i = 0; i < element.length; i++) {
                sum += element[i];
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
            System.out.println();
        }

        {
            System.out.println("\nTask2");

            int[] element = {977, 4578, 74123, 852037, 7463251};
            int min = element[0];
            int max = element[0];
            for (int i = 0; i < element.length; i++) {
                if (element[i] < min) {
                    min = element[i];
                }
                if (element[i] > max) {
                    max = element[i];
                }

                System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. " +
                        "Максимально сумма трат за неделю составила " + max + " рублей");
                System.out.println();
            }
        }
            {
                System.out.println("\nTask3");

                int[] element = {562, 9653, 852674, 54721, 659214};
                int sum = 0;
                for (int i = 0; i < element.length; i++) {
                    sum += element[i];
                }
                double avg = sum / 4d;
                System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей");
            }
            {
                System.out.println("\nTask4");

                char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                for (int i = reverseFullName.length - 1; i >= 0; i--) {
                    System.out.print(reverseFullName[i]);
                }
                System.out.println();
            }

    }
}














