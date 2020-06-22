package homework12.console;

import homework12.entity.human.Human;

public class EditFamilyByIndex extends ObjectFromInput implements Command {

    Human kid;

    @Override
    public int serialNo() {
        return 7;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execution() {
        console.printLn("1.Give birth to baby\n2.Adopt child\n3.Return to main menu");
        console.printLn();
        console.print("Enter option number:");

        int opt=console.readInt();
        switch(opt){
            case 1:
                console.print("Enter family identifier: ");
                int identifier=console.readInt();
                console.readLn();
                console.printLn("Name in case the child is feminine ");
                String name=console.readLn();
                console.printLn("Name in case the child is masculine ");
                String name2=console.readLn();
                fc.bornChild(fc.getFamilybyId(fc.getIndexbyFamily(fc.getFamilybyIdentifier(identifier))),name2,name);
                break;

            case 2:
                console.print("Enter family identifier: ");
                int identifier2=console.readInt();
                console.readLn();
                console.printLn("Gender of the kid (boy or girl) :");

                String gender=console.readLn();

                if(gender.trim().equalsIgnoreCase("girl")){
                   kid=createWoman();
                }
                if(gender.trim().equalsIgnoreCase("boy")){
                    kid=createMan();
                }
                else{
                    kid=createHuman();
                }
                fc.adoptChild(fc.getFamilybyId(fc.getIndexbyFamily(fc.getFamilybyIdentifier(identifier2))),kid);
                break;

            case 3:
                console.printLn("Returning to main menu");
                break;


        }


    }
}
