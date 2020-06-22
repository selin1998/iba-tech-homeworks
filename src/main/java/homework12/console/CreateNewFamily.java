package homework12.console;

import homework12.entity.human.Human;

public class CreateNewFamily extends ObjectFromInput implements Command {
    @Override
    public int serialNo() {
        return 5;
    }

    @Override
    public boolean isExit() {
        return false;
    }




    @Override
    public void execution() {
        console.printLn("Enter information for Mother:");
        Human mother=createHuman();
        console.printLn("Enter information for Father:");
        Human father=createHuman();
        fc.createNewFamily(mother,father);

    }
}
