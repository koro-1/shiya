package com.example.demo;

import cn.hutool.db.Db;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController   {


    @GetMapping("/1")
    public String getCommentList() throws SQLException {
        List<String> commentList = new ArrayList<>();
        commentList.add("yhy");
        commentList.add("yjx");
        commentList.add("yjy");
        HashMap<String, Object> map = new HashMap<>();
        map.put("list",commentList);
        ;
        return JSON.toJSONString(Db.use().findAll("user"))+1;
    }
}
