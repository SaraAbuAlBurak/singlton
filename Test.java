
public class Test {
    

    public static void main(String args[]) {
        for (int i = 0; i < 100; i++) {
            Singlton p = Singlton.getInstance();
            p.hello();
        }

    }


}
