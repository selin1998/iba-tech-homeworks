package homework13.console;

import homework13.entity.human.Human;
import homework13.entity.human.Man;
import homework13.entity.human.Woman;
import homework13.io.Console;
import homework13.io.UnixConsole;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ObjectFromInput {
    
    Console con=new UnixConsole(new Scanner(System.in));
    long epoch;

    public long birthDatetoLong(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        try{
            LocalDate localDate = LocalDate.parse(date, formatter);
            epoch = 1000*localDate.atStartOfDay(ZoneId.systemDefault()).toEpochSecond();

        }

        catch (DateTimeParseException e) {
            con.printLn("Wrong date format! It will be given default birthDate!");
        }

        return epoch;

    }

    public Man createMan(){
        con.readLn();
        con.print("Name for the boy:");
        String name= con.readLn();
        con.print("Last Name:");
        String surname= con.readLn();
        con.print("Enter birthDate in dd/MM/yyyy format:");
        String date=con.readLn();
        con.print("IQ:");
        int iq=con.readInt();
        con.printLn();
        return new Man(name,surname,birthDatetoLong(date),iq);

    }



    public Woman createWoman(){
        con.readLn();
        con.print("Name for the girl:");
        String name= con.readLn();
        con.print("Last Name:");
        String surname= con.readLn();
        con.print("Enter birthDate in dd/MM/yyyy format:");
        String date=con.readLn();
        con.print("IQ:");
        int iq=con.readInt();
        con.printLn();
        return new Woman(name,surname,birthDatetoLong(date),iq);

    }


    public Human createHuman(){
        con.readLn();
        con.print("Name:");
        String name= con.readLn();
        con.print("Last Name:");
        String surname= con.readLn();
        con.print("Enter birthDate in dd/MM/yyyy format:");
        String date=con.readLn();
        con.print("IQ:");
        int iq=con.readInt();
        con.printLn();
        return new Human(name,surname,birthDatetoLong(date),iq);

    }
}
