


public class Singlton {
    
    

    private static Singlton instance;

    private Singlton() {
        System.out.println("construction");
    }

    public static Singlton getInstance() {
        if (instance == null) {
            instance = new Singlton();
        }
        return instance;
    }

    public void hello() {
        System.out.println("Hi from sara ");
    }



    
}
