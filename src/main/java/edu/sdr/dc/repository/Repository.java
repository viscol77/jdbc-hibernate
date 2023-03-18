package edu.sdr.dc.repository;

import edu.sdr.dc.model.Rate;

public interface Repository<T> {

    // select ...
    T findById(Integer id);

    // update ...
    T updateById(Integer id, String rate, String date);

    // delete ...
    boolean deleteById(Integer id) ;

    // insert ...
    T save(Integer id, String currency, String rate, String date, Integer multiplier);

}
