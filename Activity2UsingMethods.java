import java.util.Scanner; 
 
public class Activity2UsingMethods{ 
 
    static int length;
    static Scanner sc=new Scanner(System.in);  
        //Method to get the product name
        public static String[] GetName() {
            String[] products = new String[length];  
            System.out.println("\nEnter the product names.");
            System.out.println("------------------------");
            for(int count=0; count<products.length; count++)  {
                // Reading user input and store it in products array
                System.out.println("Product No." + (count+1)  + ":");   
                products[count]=sc.nextLine();
            }   
            
            return products;
        }
        //Method to get the product prices
        public static int[] GetPrice() {
            int[] prices = new int[length];  
            System.out.println("\nEnter the prices of the products.");
            System.out.println("----------------------------------");
            for(int count=0; count<prices.length; count++)  {
                // Reading user input and store it in prices array
                System.out.println("Price of Product No." +(count+1) + ":");   
                prices[count]=sc.nextInt();
            }   
            return prices;
        }
        
        
        
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);  
        //Ask user to input number of products they want to add
        System.out.println("\nEnter the number of products you want to add");
        length=sc.nextInt();
        //Call the methods and store it in new arrays
        String[] productslist = GetName();
        int [] pricelist = GetPrice();
        //Display the list of new products added
        System.out.println("\nList of new products added");
        System.out.println("----------------------------------------------");
        for (int count=0; count<productslist.length; count++){
            System.out.println("Product No."+(count+1)+ ": " + productslist[count]+ "                Price: " + pricelist[count]);
        }
        sc.close();
    } 
}