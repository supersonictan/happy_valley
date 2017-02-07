package com.moon.si.happyvalley.service.impl;

import com.moon.si.happyvalley.dao.mapper.HVMapper;
import com.moon.si.happyvalley.entity.HVVideo;
import com.moon.si.happyvalley.service.HappyValleyService;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZeYu
 * Date: 2017/2/7.
 * Time: 15:52.
 * DESC: say something
 */
@Component("happyValleyService")
public class HappyValleyServiceImpl implements HappyValleyService {

    @Resource
    private HVMapper mapper;

    public List<HVVideo> findList(){
        return mapper.findList(new HVVideo());
    }


}
