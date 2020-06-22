package homework12.console;

import homework12.controller.FamilyController;
import homework12.io.Console;
import homework12.io.UnixConsole;

import java.util.Scanner;

public interface Command {
    FamilyController fc=new FamilyController();
    Console console=new UnixConsole(new Scanner(System.in));

    public int serialNo();
    public boolean isExit();
    public void execution();

}
