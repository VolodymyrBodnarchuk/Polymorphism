import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Cars BMW = new Cars("BMW", "M5", 2020, 220);
        Cars Mers = new Cars("Mersedes-benz" , "E210" , 2021, 220);

        BMW.Display(1);
        Mers.Display(2);

    }
}