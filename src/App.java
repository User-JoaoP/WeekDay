import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int month, day, year;
        int KeyMonth, KeyYear, WeekNum;

        System.out.println("Let's see what day of the week that date fell on");
        Scanner scan = new Scanner(System.in);
        System.out.print("Month: ");
        month = scan.nextInt();
        System.out.print("Day: ");
        day = scan.nextInt();
        System.out.print("Year: ");
        year = scan.nextInt();
        scan.close();

        //Finding KeyYear
        int x = year % 100;
        int module = x % 7;
        KeyYear = ((x / 4) + module) % 7;
        if (year >= 2000){
            KeyYear -= 1;
        }

        //Finding KeyMonth
        int VetMonth[] = {1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
        KeyMonth = (VetMonth[month - 1]);
        
        WeekNum = (day + KeyMonth + KeyYear) % 7;
        String DayWeek[] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println(DayWeek[WeekNum]);
        
        /*Supposed formula that didn´t work
         int x = day + (2 * month) + ((3*(month + 1))/ 5) + year + (year / 4) - (year / 100) + (year / 400) + 2;
         x %= 7;*/      
    }
}