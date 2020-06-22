package homework12.dao;

import homework12.entity.family.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDAO implements FamilyDAO {

    List<Family> familyList=new ArrayList<>();
    @Override
    public List<Family> getAllFamilies() {
       return familyList;
    }

    @Override
    public Family getFamilybyIndex(int index) {
        try {
            return familyList.get(index);

        }
        catch (IndexOutOfBoundsException | NullPointerException e ){
            System.out.println("Wrong Index");
            return null;
        }
    }

    @Override
    public boolean deleteFamily(int index) {
        if(index<familyList.size()){
            familyList.remove(index);
            return  true;

        }
        else{
            return false;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        return familyList.remove(family);
    }

    @Override
    public void saveFamily(Family family) {
        if(familyList.contains(family)){
            familyList.set(familyList.indexOf(family),family);
        }
        else{
            familyList.add(family);
        }

    }
}
