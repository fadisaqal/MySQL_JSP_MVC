package com.fadi;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fadi on 02-May-17.
 */

public class GetData {
    private static List<Country> countries = null;

    public List<Country> getCountries() {
//        DAO dao = new DAO();
//        String sql = "select * from country";
//        try{
//            Statement statement = dao.connect().createStatement();
//            ResultSet resultSet = statement.executeQuery(sql);
//            countries = new ArrayList<>();
//            while(resultSet.next()){
//                //code go here
//                Country country = new Country();
//                country.setAbbr(resultSet.getString(1));
//                country.setName(resultSet.getString(2));
//                countries.add(country);
//            }
//        }catch (SQLException e){
//            e.getSQLState();
//
//        }
        return countries;
    }

    public List<Country> getCountryNameByCode(String search) {
        DAO dao = new DAO();
        String sql = "SELECT name from country where code = '" + search + "'" ;
        System.out.println(sql);
        try{
            Statement statement = dao.connect().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            countries = new ArrayList<>();
            while(resultSet.next()){
                //code go here
                Country country = new Country();
                country.setName(resultSet.getString(1));
                countries.add(country);
            }
        }catch (SQLException e){
            e.getSQLState();

        }
        return countries;
    }


}
