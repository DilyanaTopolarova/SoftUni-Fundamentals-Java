import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLight = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double sumLight = Math.ceil(students + students*0.10) * priceLight;
        double sumRobes = students * priceRobe;
        double sumBelts = priceBelts * (students - students/6);

        double totalSum = sumBelts + sumLight + sumRobes;

        if (totalSum <= budget){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        }
        else{
            double needMoney = totalSum - budget;
            System.out.printf("George Lucas will need %.2flv more.", needMoney);
        }


    }
}
