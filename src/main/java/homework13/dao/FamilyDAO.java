package homework13.dao;

import homework13.entity.family.Family;

import java.util.List;

public interface FamilyDAO {

    public List<Family> getAllFamilies();
    public Family getFamilybyIndex(int index);
    public boolean deleteFamily(int index);
    public boolean deleteFamily(Family family);
    public void saveFamily(Family family);
    public void saveDatatoFile();
    public void loadData();
    public List<Family> read();



}
