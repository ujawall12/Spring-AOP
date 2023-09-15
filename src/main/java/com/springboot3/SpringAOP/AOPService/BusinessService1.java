package com.springboot3.SpringAOP.AOPService;

import com.springboot3.SpringAOP.Repository.DataService1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class BusinessService1 {

    private final DataService1 dataService1;
    public int calculateMax(){
        int [] data=dataService1.retrieveData();
        return Arrays.stream(data).max().orElse(0);
    }
}
