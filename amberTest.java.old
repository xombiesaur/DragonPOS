
import java.util.Random;

//This is a test that I can add code to my branch and push to the master
public class amberTest {

    public static void main(String[] args) {

        // Stock inventory

        Inventory inventory = new Inventory();
        
        Random random = new Random(); // Random number generator
        int min = 0;
        int max = 100;
        for (int i = 0; i < 200; i++) {
            SaleItem item = new SaleItem("Description " + i, i + 100,
                    "ID" + i);
            int stock = random.nextInt(max - min + 1) + min;
            inventory.addItem(item, stock);
        }
        
        Transaction transaction = new Transaction();
        
        
        System.out.println("Hello World!");
    }
}
