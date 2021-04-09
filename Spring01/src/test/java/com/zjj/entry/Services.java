package com.zjj.entry;

import org.springframework.stereotype.Service;

@Service("service")
public class Services {
    public Integer add(Integer a,Integer b){
        return a*b;
    }
}
