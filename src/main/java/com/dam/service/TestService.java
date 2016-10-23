package com.dam.service;

import com.dam.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by woodam on 2016. 10. 23..
 */
@Service
public class TestService {
    @Autowired
    TestRepository testRepository;

    public String getText(){
        return testRepository.getText();
    }

}
