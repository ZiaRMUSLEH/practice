package miniprojectsEN.miniproject03;
public class Ticket {

    public double distance;
    public int typeNo;
    public double price;
    public int seatNo;

    public void printTicket(Bus bus){

        System.out.println("Total Price: "+ this.price);
        System.out.println("-----Ticket Details-------------");
        System.out.println("Bus Plate: "+ bus.plateNumber);
        System.out.println("Distance: " + this.distance);
        System.out.println("Type Of Journey: "+ (this.typeNo==1 ? "One Direction": "Round Trip"));
        System.out.println("Seat No: "+ this.seatNo);
        System.out.println("Have a Nice Trip");



    }


}
