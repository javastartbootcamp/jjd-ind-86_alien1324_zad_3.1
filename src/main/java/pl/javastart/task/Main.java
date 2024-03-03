package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Chair chair1 = new Chair("Huzaro", 51, 40, true);
        Chair chair2 = new Chair("Woodica", 45, 45, false);
        System.out.printf("Producent: %s%nZakres Wysokości: %.1fcm - %.1fcm%nCzy się obraca: %b%n",
                chair1.producer, chair1.heightMin, chair1.heightMax, chair1.canRotate);
        System.out.printf("Producent: %s%nZakres Wysokości: %.1fcm - %.1fcm%nCzy się obraca: %b%n",
                chair2.producer, chair2.heightMin, chair2.heightMax, chair2.canRotate);
    }
}