package com.example.demo.service;

import com.example.demo.entity.BaseEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BaseService {
private BaseEntity baseEntity;

    public Integer sum(){
        baseEntity.getId();
        int first = 1;
        int second= 4;

        return first + second;}

}
