package homework13.console;

import homework13.controller.FamilyController;
import homework13.io.Console;
import homework13.io.UnixConsole;

import java.util.Scanner;

public interface Command {
    FamilyController fc=new FamilyController();
    Console console=new UnixConsole(new Scanner(System.in));

    public int serialNo();
    public boolean isExit();
    public void execution();

}
