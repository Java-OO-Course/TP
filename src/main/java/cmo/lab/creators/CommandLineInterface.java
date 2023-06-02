package cmo.lab.creators;

import java.util.Scanner;

public class CommandLineInterface {

    private Scanner scanner;

    public CommandLineInterface()
    {
        scanner = new Scanner(System.in);
    }

    public String scanCommand()
    {
        return scanner.nextLine();
    }

}
