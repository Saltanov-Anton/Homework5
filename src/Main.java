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

        int wagon = 102;
        int seating = 60;
        int seats = 102;
        if (seats <= 60) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (seats >= seating & seats <= wagon) {
            System.out.println("В вагоне остались только стоячие места");
        }
        if (seats > wagon) {
            System.out.println("В вагоне не осталось мест");
        }
    }
}