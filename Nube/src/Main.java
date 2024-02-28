
public class Main {

    public static void main(String[] args) {

    car bmw = new car(250.5f, 2500, "Black", new byte[]{0,0,0});
    bmw.blinkLight();
    bmw.setLight(true);
    bmw.blinkLight();

    truck DAF = new truck(150.2f, 9000, "White", new byte[]{0,0,0});

    DAF.setLoaded(false);
    DAF.getLoaded();

    }

}