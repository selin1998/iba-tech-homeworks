package homework9.dao;

import homework9.entity.family.Family;

import java.util.List;

public interface FamilyDAO {

    public List<Family> getAllFamilies();

    public Family getFamilybyIndex(int index);

    public boolean deleteFamily(int index);

    public boolean deleteFamily(Family family);

    public void saveFamily(Family family);


}
