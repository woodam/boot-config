package com.dam.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by woodam on 2016. 10. 23..
 */
@Repository
public class TestRepository {
    public String getText(){
        return  "Hello Handlebars!";
    }
}
