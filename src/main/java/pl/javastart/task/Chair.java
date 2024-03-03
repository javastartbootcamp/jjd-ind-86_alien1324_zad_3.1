package pl.javastart.task;

public class Chair {
    boolean canRotate;
    double heightMin;
    double heightMax;
    String producer;
    Chair(String prod, double heiMax, double heiMin, boolean rotate){
        canRotate = rotate;
        producer = prod;
        heightMax = heiMax;
        heightMin = heiMin;
    }
}