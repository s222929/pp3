public class CinemaTicket{
    static String CinemaName = "Morning Star Cinema";
    String FilmTitle;
    int Row;
    int Seat;
    double Price;
    public CinemaTicket(String FilmTitle, int row, int seat){
    if(row <3){
        this.Price = 10.00;
    }else{
        this.Price = 25.00;
    }
    this.FilmTitle= FilmTitle;
    this.Row = Row;
    this.Seat = Seat;
    }
    
    
    public void displayTicket(){
        System.out.println("Cinema name:"+ CinemaName);
    
        System.out.println("Title:"+ FilmTitle);
    
        System.out.println("Row:"+ Row);
    
        System.out.println("Seat:"+ Seat);
    
        System.out.println("Price:"+ Price);
    
        System.out.println("Cinema name:"+ CinemaName + "Title:"+ FilmTitle + "Row:"+ Row + "Seat:"+ Seat + "Price:"+ Price);
    } {
    

    
    }
    public static void main(String[]args){
    CinemaTicket Ticket1 = new CinemaTicket("Clouds", 1, 2);
    CinemaTicket Ticket2 = new CinemaTicket("Clouds", 8, 2);
    Ticket1.displayTicket();
    Ticket2.displayTicket();
    
    
}
    
    
    
    
    
}