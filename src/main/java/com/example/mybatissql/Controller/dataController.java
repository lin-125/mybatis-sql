package com.example.mybatissql.Controller;

import com.example.mybatissql.Service.dataService;
import com.example.mybatissql.dataelem.data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class dataController {
    private dataService ds;

    public dataController() {
        this.ds = new dataService();
    }

    @GetMapping("/listall")
    public List<data> listall(){
        return ds.listall();
    }

}

