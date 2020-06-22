package homework12.console;

import java.util.ArrayList;
import java.util.List;

public class Commands {

    public static List<Command> all(){
        return new ArrayList<Command>() {
            {
                add(new CreateNewFamily());
                add(new FamiliesLessThan());
                add(new FamiliesBiggerThan());
                add(new FamiliesWithMemberNumber());
                add(new RemoveChildrenOver());
                add(new EditFamilyByIndex());
                add(new DeleteFamilyByIndex());
                add(new DisplayAllFamilies());
                add(new FillWithTestData());
                add(new Exit());
            }

        };


    }

}
