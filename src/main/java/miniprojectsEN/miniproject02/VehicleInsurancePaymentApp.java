package miniprojectsEN.miniproject02;

import java.util.Scanner;

public class VehicleInsurancePaymentApp {
       /*
       Project: Auto Insurance Payment Calculator
       Vehicle types: car, truck, bus, motorcycle
                     -bus: 18-30 seats or 31 and above seats
      Tariff period: December 2022, June 2022
      1st term: June 2022                      2nd term: December 2022
         cars: 2000                            cars: 2500
         truck: 3000                           truck: 3500
         bus: type1: 4000 type2: 5000          bus: type1: 4500 type2: 5500
         motorcycle: 1500                      motorcycle: 1750
       In case of incorrect entry, the calculation failed warning should be given to the user and the menu should be shown again.
*/

    public static void main (String[] args) {

startCalculation();

    }
    public static void startCalculation (){
      boolean isFailed;

        Scanner input = new Scanner(System.in);

        do {
            isFailed=false;

            System.out.println("...Vehicle Insurance Calculator...");
            System.out.println("Please choose the term for payment");

            System.out.println("1. Term: June 2023");
            System.out.println("2. Term: December 2023");

            int term = input.nextInt();

            if(term==1 || term ==2){

                Vehicle objectVehicle = new Vehicle();
                System.out.println("enter the type of vehicle");
                System.out.println("car, bus, truck, motorcycle");

                objectVehicle.type = input.next().toLowerCase();

                objectVehicle.payment = objectVehicle.countPayment(term);
                int select;
                String termName= term==1? "june 2023": "december 2023";
                if(objectVehicle.payment>0){
                    System.out.println("Calculation is done successfully");
                    System.out.println("Type of vehicle: "+ objectVehicle.type.toUpperCase());
                    System.out.println("Payment term: "+ termName);
                    System.out.println("Calculation for Payment " + objectVehicle.payment);
                    System.out.println("press 1 to restart, press 0 to exit");
                    select= input.nextInt();
                    if(select==1){
                        isFailed=true;
                    }else {isFailed=false;}

                }else {
                    System.out.println("calculation failed, please try again");
                    System.out.println("press 1 to restart, press 0 to exit");
                    select = input.nextInt();
                    if(select==1){
                        isFailed=true;
                    }else {isFailed=false;}
                }


            }else {
                System.out.println("Calculation cannot be done! incorrect input.");
                System.out.println("To start press 1. to exit press 2");
                isFailed=true;
            }


        } while (isFailed);
    }

}
