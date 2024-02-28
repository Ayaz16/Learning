public class transport{

    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public transport(){
        System.out.println("Объект создан");
    }

    public transport(float s, int w){
        System.out.println("Объект создан");
        this.speed = s;
        this.weight = w;
        getValues();
    }

    public transport(float s, int w, String c, byte[] co){
        System.out.println("Объект создан");
        setValues(s, w, c, co);
        getValues();
    }

    public void setValues(float s, int w, String c, byte[] co){
        this.speed = s;
        this.weight = w;
        this.color = c;
        this.coordinate = co;
    }

    public void getValues(){
        System.out.println("Скорость: " + this.speed);
        System.out.println("Вес: " + this.weight);
        System.out.println("Цвет: "+ this.color);
        System.out.print("Координаты: ");
        for (int i = 0; i < this.coordinate.length; i++){
            System.out.print(coordinate[i] + " ");
        }
    }

}