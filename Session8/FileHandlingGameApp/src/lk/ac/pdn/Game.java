package lk.ac.pdn;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game
{
    private int id;

    public String getName()
    {
        return name;
    }

    private String name;
    private double rating;
    private String description;

    public Game(int id, String name, double rating, String description)
    {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.description = description;
    }

    public void display()
    {
        System.out.println("Game " + id + ":");
        System.out.println("Name: " + this.name);
        System.out.println("Rating: " + this.rating);
        System.out.println("Description: " + this.description);
        System.out.println("\n\n");
    }

    public void writeToFile()
    {
        File file = new File("C:\\Users\\Pramuka Weerasinghe\\eclipse-workspace\\FileHandlingGameApp" + this.name + ".txt");
        try
        {
            file.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(this.name + "\n");
            bufferedWriter.write(this.rating + "\n");
            bufferedWriter.write(this.description + "\n");
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        catch (IOException ex)
        {
            System.out.println(ex);
        }
    }
}
