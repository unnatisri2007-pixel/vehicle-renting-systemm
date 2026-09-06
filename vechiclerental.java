

import java.util.Scanner;

public class vechiclerental {
   public static void main(String[] args) {
        System.out.println("<<<<<<<VEHICLE RENTAL SYSTEM>>>>>>>>");
        Scanner sc=new Scanner(System.in);

        boolean running=true;
       Vehicle v = null;
       while(running) {
           System.out.println("<<MENU>>");
           System.out.println("1.add vehicle");
           System.out.println("2.register customer");
           System.out.println("3.show available vehicles");
           System.out.println("4.rent a vehicle");
           System.out.println("5.exit");

        int x= sc.nextInt();
        if(x==1) {
            addVehicle av = new addVehicle();


            v = av.getaddVehicle();


        }
        if(x==2){
            customerRegister cr=new customerRegister();
            cr.getcustomerRegister();
        }
        if (x==3){
            showAvailablevehicles sv=new showAvailablevehicles();
            sv.getshow(v);
        }
        if(x==4){
            rentvehicle rv=new rentvehicle();
            rv.getrent(v);
        }
        if(x==5){
            running=false;
            System.out.println("have a nice day!!");
        }
    }
}}
class Vehicle {

    String brand;
    int rate;


    Vehicle(String brand, int rate) {

        this.brand = brand;
        this.rate=rate;


    }
}

class addVehicle {
    Scanner sc = new Scanner(System.in);

     public Vehicle getaddVehicle() {
        System.out.println("--- Add Vehicle ---");
        System.out.println("Enter Vehicle Type");
        System.out.println("1.car");
        System.out.println("2.bike");
        System.out.println("3.truck");
        int x = sc.nextInt();
        System.out.println("enter vehicle id");
        int z = sc.nextInt();
        System.out.println("enter brand");
        String s = sc.next();
        System.out.println("Enter Model");
        String a = sc.next();
        System.out.println("Enter Rate Per Day");
        int y = sc.nextInt();
         System.out.println("adding vehicle.............");
         System.out.println("VEHICLE ADDED SUCCESFULLY");
        Vehicle v=new Vehicle(s,y);
        return v;




    }


}
class customerRegister{
    Scanner sc=new Scanner(System.in);
    public void getcustomerRegister(){
        System.out.println("REGISTER CUSTOMER");
        System.out.println("enter name");
        String s=sc.next();
        System.out.println("enter contact");
        int y= sc.nextInt();
        System.out.println("enter age");
        int u= sc.nextInt();
        System.out.println("enter licence number");
        int h= sc.nextInt();
        System.out.println("customer added!!");
    }
}
class showAvailablevehicles {
    public Vehicle getshow(Vehicle v) {
        System.out.println("AVAILABLE VEHICLES");
        System.out.println("maruti");
        System.out.println("bmw");
        System.out.println(v.brand);
        return v;
    }

}
class rentvehicle{
    Scanner sc=new Scanner(System.in);
    public void getrent(Vehicle v){
        System.out.println("RENT");
        showAvailablevehicles sv = new showAvailablevehicles();
        sv.getshow(v);
        System.out.println("enter the vehicle u want to rent");
        String s=sc.next();
        System.out.println("enter for how many days u want to rent");
        int x=sc.nextInt();
        System.out.println("total");
        int total=x*v.rate;
        System.out.println(total);
    }
}

