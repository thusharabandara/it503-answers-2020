package lk.ac.pdn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{


    public static void main(String[] args)
    {
        Game[] games = new Game[10];

        displayMenu(games);
    }

    public static void read_file(Game[] games)
    {
        Game game = null;
        int counter = 0;
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Final Year\\Lab sheets review Java\\lastyearsession10\\lab9_file_handling\\data.txt"));

            while (true)
            {
                String line = bufferedReader.readLine();
                if (line == null)
                {
                    bufferedReader.close();
                    break;
                }
                games[counter++] = createGame(line);
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex);
        }
    }

    private static Game createGame(String line)
    {
        StringTokenizer stringTokenizer = new StringTokenizer(line, "/");
        int id = Integer.parseInt(stringTokenizer.nextToken());
        String name = stringTokenizer.nextToken();
        double rating = Double.parseDouble(stringTokenizer.nextToken());
        String description = stringTokenizer.nextToken();

        return new Game(id, name, rating, description);
    }

    private static void displayGames(Game[] games)
    {
        for(Game game: games)
        {
            if (game != null)
            {
                game.display();
            }
            else
            {
                break;
            }
        }
    }

    private static void displayMenu(Game[] games)
    {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        while (choice != -1)
        {
            System.out.println("Game Manager");
            System.out.println("\n1. Load games.");
            System.out.println("2. Display all games.");
            System.out.println("3. Search for game.");
            System.out.println("4. Exit.");

            System.out.println("\nEnter your choice: ");

            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    read_file(games);
                    System.out.println("Games loaded successfully.\n\n");
                    break;
                case 2:
                    displayGames(games);
                    break;
                case 3:
                    search(games);
                    break;
                case 4:
                    choice = -1;
                    System.out.println("Thank you for using Game Manager.");
                    break;
                default:
                    System.out.println("\n\n Invalid Choice \n\n");
                    break;
            }
        }
    }

    private static void search(Game[] games)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of game to search for: ");
        String searchGame = scanner.nextLine();
        int choice;

        for (Game game: games)
        {
            if (game != null)
            {
                if (searchGame.equalsIgnoreCase(game.getName()))
                {
                    game.display();
                    while (true)
                    {
                        System.out.println("1. Write game to file.");
                        System.out.println("2. Go back to main menu.");
                        System.out.println("Enter choice: ");
                        choice = scanner.nextInt();

                        if (choice == 1)
                        {
                            game.writeToFile();
                            System.out.println("Game written to file.");
                            return;
                        }
                        else if (choice == 2)
                        {
                            return;
                        }
                        else
                        {
                            System.out.println("Invalid choice.");
                        }
                    }
                }
            }
        }
        System.out.println("Game not found.");
    }
}
