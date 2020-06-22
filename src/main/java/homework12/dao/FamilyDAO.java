package homework12.dao;

import homework12.entity.family.Family;

import java.util.List;

public interface FamilyDAO {

    public List<Family> getAllFamilies();
    public Family getFamilybyIndex(int index);
    public boolean deleteFamily(int index);
    public boolean deleteFamily(Family family);
    public void saveFamily(Family family);



}
