package com.xiaofei.server;

import com.xiaofei.dao.FlimMapper;
import com.xiaofei.entity.FlimVideo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FlimVideoTableServer {

    @Autowired
    private FlimMapper flimMapper;

    public FlimVideo selectByname(String flim_name){
        return  flimMapper.selectByFlinName(flim_name);
    }


}
