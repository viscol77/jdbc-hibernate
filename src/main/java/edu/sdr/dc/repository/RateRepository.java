package edu.sdr.dc.repository;

import edu.sdr.dc.model.Rate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class RateRepository {

    public Rate findById(Integer id) {
        return new Rate();
    }

    public List<Rate> findAllByDate(Connection connection, String date) {
        List<Rate> rateList = new LinkedList<>();

        try (Statement readItemsStatement = connection.createStatement()) {
            String readItemsQuery = "SELECT id, currency, rate, date, multiplier " +
                                    " FROM rate " +
                                    " WHERE date = '" + date + "' ";
            ResultSet rs = readItemsStatement.executeQuery(readItemsQuery);
            while (rs.next()) {
                int id = rs.getInt("id");
                String currency = rs.getString("currency");
                String rate = rs.getString("rate");
                String dateFromTable = rs.getString("date");
                Integer multiplier = rs.getInt("multiplier");

                rateList.add(new Rate(id, dateFromTable, currency, rate, multiplier));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rateList;
    }

}
