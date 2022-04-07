import java.util.Scanner;  
public class activity2version2{  
    public static void main(String[] args)   
    {  
        Scanner sc=new Scanner(System.in);  
        //creates arrays person and age in the memory of length 5
        int length;

        System.out.println("Enter the number of persons you want to store in the array: ");   
        length=sc.nextInt();
        String[] persons = new String[length];
        int[] age = new int[length];
        sc.nextLine();
        System.out.println("Please enter the names with their ages.");
        System.out.println("---------------------------------------");
        
        //for loop to ask user to input upto 5 names with their age
        for(int count=0; count<persons.length; count++)  
        {  
            // Reading user input and store it in arrays person and age
            System.out.println("Enter the name: ");   
            persons[count]=sc.nextLine();
            System.out.println("Enter the age: ");    
            age[count]=sc.nextInt();
            sc.nextLine();
        }  

        System.out.println("The names you entered and their ages are as follows.");
        System.out.println("----------------------------------------------------");

        //for loop to access the elements inside the arrays persons and age then display them
        for (int index=0; index < persons.length; index++){
            System.out.println("Name: " + persons[index] +  "           Age: " + age[index]);
        }

        sc.close();
    } 
} 