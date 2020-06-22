package homework12.console;

public class FamiliesWithMemberNumber implements Command {
    @Override
    public int serialNo() {
        return 4;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execution() {
        console.print("Number of families with member number: ");
        int count=console.readInt();
        System.out.println(fc.countFamiliesWithMemberNumber(count));

    }
}
