package com.springboot3.SpringAOP.Repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {
    public int[] retrieveData(){
        return new int[] {23,12,53,35};
    }
}
