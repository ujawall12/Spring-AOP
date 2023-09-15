package com.springboot3.SpringAOP.AOPService;

import com.springboot3.SpringAOP.AOPService.Annotations.TrackTime;
import com.springboot3.SpringAOP.Repository.DataService1;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class BusinessService1 {

    private final DataService1 dataService1;
    @SneakyThrows
    @TrackTime
    public int calculateMax(){
        int [] data=dataService1.retrieveData();
//        throw new RuntimeException("Some excetion");

        Thread.sleep(30); // To test the PerformanceTrackingAspect
        return Arrays.stream(data).max().orElse(0);
    }
}
