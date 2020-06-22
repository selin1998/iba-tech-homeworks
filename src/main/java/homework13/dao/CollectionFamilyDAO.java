package homework13.dao;

import homework13.entity.family.Family;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDAO implements FamilyDAO {


    List<Family> familyList=new ArrayList<>();

    private File file=new File("./database/family.bin");


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

    @Override
    public void saveDatatoFile() {

        try{
        FileOutputStream outputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(familyList);
        objectOutputStream.close();
        outputStream.close();
        }
        catch (IOException e) {
            throw new RuntimeException("IOException:", e);
        }

        }

    public List<Family> read(){
        List<Family> families=null;

        try{
            FileInputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            Object readed = ois.readObject();
            families= (ArrayList<Family>) readed;
            //     max=fam.stream().map(x -> x.getIdentifier()).max((id1, id2) -> id1 - id2).orElse(0);
            ois.close();
            is.close();
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Class not found!");

        }
        return families;
    }

    @Override
    public void loadData() {

            List<Family> listLoaded = read();

            listLoaded.forEach(this::saveFamily);


        }

    }
