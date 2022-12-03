public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием!!!");
        }

        if (age < 18) {
            System.out.println("Вас еще рано поздравлять, подождите немного");
        }

        int age2 = 25;
        if (age2 >= 7 & age2 < 18) {
            System.out.println("Вы ходите в школу");
        }

        if (age2 >= 18 & age2 < 24) {
            System.out.println("Вам пора в университет");
        }

        if (age2 >= 24) {
            System.out.println("Вам пора на работу");
        }
    }
}