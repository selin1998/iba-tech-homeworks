package homework12.console;

import homework12.io.Console;
import homework12.io.UnixConsole;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

public class ConsoleApp {


    List<Command> commands;
    Console console = new UnixConsole(new Scanner(System.in));
    boolean isExit=false;
    Menu menu=new Menu();
    Optional<Command> command;
    int num=0;
    public ConsoleApp(){
        commands= Commands.all();
    }

    public void start(){


        while(!isExit){
            menu.printMenu();

            console.printLn("Enter option number:");
            try{
                while(!console.hasNextInt()){
                    String input=console.readLnNext();
                    console.print("Enter option in number format:\n");
                }
                num = console.readInt();
                command=commands.stream().filter(x->x.serialNo()==num).findFirst();
                command.ifPresent(Command::execution);
                isExit=command.get().isExit();
            }


            catch (NoSuchElementException ex){
                console.printLn("Please, enter valid number!!!");
            }

        }

    }

}
