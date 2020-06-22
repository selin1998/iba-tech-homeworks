package homework12.console;

public class FamiliesBiggerThan implements Command {
    @Override
    public int serialNo() {
        return 2;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execution() {
        console.print("Families with member number greater than:");
        int count=console.readInt();
        System.out.println(fc.getFamiliesBiggerThan(count));

    }
}
