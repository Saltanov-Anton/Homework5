public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием!!!");
        } else {
            System.out.println("Вас еще рано поздравлять, подождите немного");
        }

        int age2 = 25;
        if (age2 >= 7 & age2 < 18) {
            System.out.println("Вы ходите в школу");
        } else {
            if (age2 >= 18 & age2 < 24) {
                System.out.println("Вам пора в университет");
            } else {
                if (age2 >= 24) {
                    System.out.println("Вам пора на работу");
                }
            }
        }

        int wagon = 102;
        int seating = 60;
        int seats = 102;
        if (seats <= 60) {
            System.out.println("В вагоне есть сидячие места");
        } else {
            if (seats >= seating & seats <= wagon) {
                System.out.println("В вагоне остались только стоячие места");
            } else {
                if (seats > wagon) {
                    System.out.println("В вагоне не осталось мест");
                }
            }
        }

        int age3 = 5;
        if (age3 >= 2 && age3 <7) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить " +
                    "в детский сад.");
        } else {
            if (age3 >= 7 && age3 < 18) {
                System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить " +
                        "в школу.");
            } else {
                if (age3 >= 18 && age3 < 24) {
                    System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить " +
                            "в университет.");
                } else {
                    if (age >= 24) {
                        System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить " +
                                "на работу.");
                    }
                }
            }
        }

        int ageChild = 4;
        if (ageChild < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого");
        } else if (ageChild >= 14) {
            System.out.println("Ребенок может кататься на аттракционе один");
        }
    }
}