
import java.util.Scanner;


public class LinearEquationLogic {
    private Scanner myScanner ;
    private LinearEquation linearEquation;


    public LinearEquationLogic(){
        myScanner = new Scanner(System.in);
        linearEquation = null;
    }


    public void start(){
       getLinearEquation();

    }


    private void getLinearEquation(){

            System.out.println("Welcome to the linear equation calculator!");
            System.out.print("Enter first Coordinate: ");
            String coordinate1 = myScanner.nextLine();
            System.out.print("Enter second Coordinate: ");
            String coordinate2 = myScanner.nextLine();
            // use substring to parse out the individual numbers from the coordinates
            int coordinate1Length = coordinate1.length();
            int coordinate2Length = coordinate2.length();
            int commaIndex1 = coordinate1.indexOf(",");
            int commaIndex2 = coordinate2.indexOf(",");
            int x1 = Integer.parseInt(coordinate1.substring(1, commaIndex1));
            int y1 = Integer.parseInt(coordinate1.substring(commaIndex1 + 2, coordinate1Length - 1));
            int x2 = Integer.parseInt(coordinate2.substring(1, commaIndex2));
            int y2 = Integer.parseInt(coordinate2.substring(commaIndex2 + 2, coordinate2Length - 1));
            linearEquation = new LinearEquation(x1, y1, x2, y2);
            System.out.println(linearEquation.lineInfo());

            if (x1 != x2) {
                System.out.print("Enter an X Value: ");
                double testXValue = myScanner.nextDouble();
                System.out.println("The coordinates are: " + linearEquation.coordinateForX(testXValue));
            }
            System.out.println("Would you like to enter another pair of coordinates?: ");
            String answerChoice = myScanner.nextLine();

            if (answerChoice.equals("yes")){
                System.out.print("Enter first Coordinate: ");
                coordinate1 = myScanner.nextLine();
                System.out.print("Enter second Coordinate: ");
                coordinate2 = myScanner.nextLine();
                // use substring to parse out the individual numbers from the coordinates
                coordinate1Length = coordinate1.length();
               coordinate2Length = coordinate2.length();
                commaIndex1 = coordinate1.indexOf(",");
                 commaIndex2 = coordinate2.indexOf(",");
                 x1 = Integer.parseInt(coordinate1.substring(1, commaIndex1));
                y1 = Integer.parseInt(coordinate1.substring(commaIndex1 + 2, coordinate1Length - 1));
                 x2 = Integer.parseInt(coordinate2.substring(1, commaIndex2));
                 y2 = Integer.parseInt(coordinate2.substring(commaIndex2 + 2, coordinate2Length - 1));
                linearEquation = new LinearEquation(x1, y1, x2, y2);
                System.out.println(linearEquation.lineInfo());

                if (x1 != x2) {
                    System.out.print("Enter an X Value: ");
                    double testXValue = myScanner.nextDouble();
                    System.out.println("The coordinates are: " + linearEquation.coordinateForX(testXValue));
                }
                System.out.println("Would you like to enter another pair of coordinates?: ");
                 answerChoice = myScanner.nextLine();
            }
            if (answerChoice.equals("no")){
                System.out.println("Bye!");
            }







    }


}
