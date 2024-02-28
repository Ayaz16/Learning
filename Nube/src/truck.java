public class truck extends transport{

    private boolean isLoaded;

    public truck(float s, int w){
        super(s, w);
    }

    public truck(float s, int w, String c, byte[] co){
        super(s, w, c, co);
    }

    public  void setLoaded(boolean l){
        this.isLoaded = l;
    }

    public  void getLoaded(){
        if (this.isLoaded){
            System.out.println("Грузовик загружен");
        }
        else{
            System.out.println("Грузовик не загружен");
        }
    }

}
