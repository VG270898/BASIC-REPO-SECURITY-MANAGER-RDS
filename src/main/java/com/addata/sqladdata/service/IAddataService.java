package com.addata.sqladdata.service;


import com.addata.sqladdata.model.Addata;
import java.util.List;

public interface IAddataService {

    // Creating Table(C in Crud Operation)
    public Addata insertData(Addata add);

    // Reading Data from Table(R in CRUD Operation)
    public List<Addata> showData();

    // Updating Data in Table by id(U in CRUD Operation)
    public Addata updateData(int id, Addata update);

    // Deleting Data from Table by id(D in CRUD operation)
    public void deleteData(int id);
}
