package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Chair chair1 = new Chair();
        Chair chair2 = new Chair();

        chair1.canRotate = true;
        chair1.heightMax = 52;
        chair1.producer = "Huzaro";
        chair1.heightMin = 40;

        chair2.canRotate = false;
        chair2.heightMax = 45;
        chair2.producer = "Woodica";
        chair2.heightMin = 45;

        System.out.printf("Producent: %s%nZakres Wysokości: %.1fcm - %.1fcm%nCzy się obraca: %b%n",
                chair1.producer, chair1.heightMin, chair1.heightMax, chair1.canRotate);
        System.out.printf("Producent: %s%nZakres Wysokości: %.1fcm - %.1fcm%nCzy się obraca: %b%n",
                chair2.producer, chair2.heightMin, chair2.heightMax, chair2.canRotate);
    }
}