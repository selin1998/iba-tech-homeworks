package homework12.console;

public class RemoveChildrenOver implements Command {
    @Override
    public int serialNo() {
        return 8;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execution() {
        console.printLn("Enter age starting from which you want to remove children:");
        int age=console.readInt();
        fc.deleteAllChildrenOlderThan(age);

    }
}
