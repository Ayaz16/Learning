public class car extends transport implements iLights {


    public car() {
    }

    public car(float s, int w) {
        super(s, w);
    }

    public car(float s, int w, String c, byte[] co) {
        super(s, w, c, co);

    }

    private boolean isOn;

    @Override
    public void setLight(boolean set) {
        isOn = set;
    }

    @Override
    public void blinkLight() {
        if (isOn) {
            System.out.println("Мы моргаем фарами");
        } else {
            System.out.println("Фары выключены");
        }
    }
}
