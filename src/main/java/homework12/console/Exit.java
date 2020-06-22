package homework12.console;

public class Exit implements Command {
    @Override
    public int serialNo() {
        return 10;
    }

    @Override
    public boolean isExit() {
        return true;
    }

    @Override
    public void execution() {
        System.out.println("Bye!");

    }
}
