import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Cейчас " + permission(11, 53));
        System.out.println("Сейчас " + permission(10, 10));
        System.out.println("Сейчас " + permission(19, -17));
        System.out.println("Сейчас " + permission(10, 5));
        System.out.println("Сейчас " + permission(3, -10));
        System.out.println("Сейчас " + permission(generateRandomAge(), -20));

        int randomAge = generateRandomAge();
        System.out.println("Сгенерированный возраст: " + randomAge);
    }

    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 || temperature >= -10 && temperature <= 25)) {
            return ("Можно идти гулять");
        } else return ("Оставайтесь дома");


    }

    public static int generateRandomAge() {
        Random random = new Random();
        int minAge = 1;
        int maxAge = 100;
        return random.nextInt(maxAge - minAge + 1) + minAge;
    }


}