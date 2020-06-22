package homework12.console;

public class DeleteFamilyByIndex implements Command {
    @Override
    public int serialNo() {
        return 6;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execution() {

        console.printLn("Enter the identifier of family you want to delete:");
        int n=console.readInt();
        fc.deleteFamilybyIndex(n);

    }
}
