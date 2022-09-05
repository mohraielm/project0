package sandwichapp;
import java.util.Scanner;

public class SandwichApp {


    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);
        int breadC=0;
        int vegC=0;
        int meatC=0;
        boolean rep=true;
        String contC="";
        String user="";
        sandwich sand= new sandwich();
        String time="";
   //this is a practice comment
        while(rep!=false){
        System.out.println("""
                           ===Select Sandwich Bread===
                           1 White Bread $1.5
                           2 Wheat Bread $1.6
                           3 French Bread $1.8
                           4 Organic Bread $2.0
                           Select a Bread[1,4]:""");
        breadC=scnr.nextInt();
        sand.getBread(breadC);
        
                    System.out.println("""
                           ===Select Sandwich Vegetables===
                           1 red onions $0.05
                           2 olives $0.10
                           3 pickles $0.10
                           4 lettuce $0.20
                           5 green peppers $0.25
                           6 tomatoes $0.30
                           7 cheese &0.50
                           8 Quit vegetable selection
                           Select vegetables: [1,8]:""");        vegC=scnr.nextInt();
        
        while(vegC!=8){
            sand.getVeg(vegC);
                    System.out.println("""
                           ===Select Sandwich Vegetables===
                           1 red onions $0.05
                           2 olives $0.10
                           3 pickles $0.10
                           4 lettuce $0.20
                           5 green peppers $0.25
                           6 tomatoes $0.30
                           7 cheese &0.50
                           8 Quit vegetable selection
                           Select vegetables: [1,8]:""");
            vegC=scnr.nextInt();
        }
        
        System.out.println("""
                           ===Select Sandwich Meat===
                           1 Ham $1.0
                           2 Roasted Chicken Breast $1.1
                           3 Turkey Breast $1.2
                           4 Roast Beef $1.5
                           5 Quit Meat Selection
                           Select Meat[1,5]:""");
    
    
        meatC=scnr.nextInt();
        sand.getMeat(meatC);
        
        System.out.println("Customer name: ");
        scnr.nextLine();
        user=scnr.nextLine();
        
        order ord=new order(user,sand,time);

        sandwichIO.writeOrderToFile(ord);
        System.out.println(ord.OrderInfo());
        System.out.print("Order more sanwiches? Y/N:");
        contC=scnr.nextLine();
        String contCL = contC.toLowerCase();
        if(contCL.equals("y")){
            rep=true;
        }
        else{
            rep=false;
        }
        }
        }}


