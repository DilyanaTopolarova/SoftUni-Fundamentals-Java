import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double totalPrice = 0;

        switch(type){
            case("Students"):
                if(day.equals ("Friday")){
                    totalPrice = 8.45 * people;

                }else if(day.equals("Saturday")){
                    totalPrice = 9.80 * people;
                }else if(day.equals("Sunday")){
                    totalPrice = 10.46 * people;
                }
                if(people >= 30){
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case("Business"):
                double price = 0;
                if(day.equals ("Friday")){
                    price = 10.90;

                }else if(day.equals("Saturday")){
                    price = 15.60;
                }else if(day.equals("Sunday")){
                    price = 16;
                }
                totalPrice = price * people;
                if(people >= 100){
                    totalPrice = totalPrice - (price * 10);
                }
                break;
            case ("Regular"):
                if(day.equals ("Friday")){
                    totalPrice = 15 * people;

                }else if(day.equals("Saturday")){
                    totalPrice =20 * people;
                }else if(day.equals("Sunday")){
                    totalPrice = 22.50 * people;
                }
                if(people >= 10 && people <= 20){
                    totalPrice = totalPrice - (totalPrice * 0.05);
                }
                break;



            }System.out.printf("Total price: %.2f", totalPrice);

        }

    }

