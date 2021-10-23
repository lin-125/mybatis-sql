package com.example.mybatissql.Service;

import com.example.mybatissql.dataelem.data;
import com.example.mybatissql.test.dataTest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class dataService{
    private dataTest dat;
    public List<data> listall(){
        return dat.listall();
    }
}
