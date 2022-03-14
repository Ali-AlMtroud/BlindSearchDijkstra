
import java.util.Scanner;

public class Game {
    Grid grid;

    UniformCost Uniform;
    Scanner input;

    public Game() {
        grid = new Grid(5, 5, new Cell(0, 0));
        input = new Scanner(System.in);

        Uniform = new UniformCost();
    }

    void StartGame() {
        System.out.println("Enter ( 1 ) For Uniform :");
        System.out.println("Enter ( 2 For Exit :");

        switch (input.nextInt()) {
                case 1:
                    System.out.println("The Optimal Solution is : ");
                    System.out.println(Uniform.UniformSearch(grid));

                    break;
            case 2:

                System.exit(0);
            default:
                System.out.println("Wrong choice , Try Again");

        }


    }
}
