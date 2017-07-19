package com.testdi.bean.SimpleCOnfig;

import com.testdi.bean.BraveKnight;
import com.testdi.bean.Quest;
import com.testdi.bean.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * config
 * Created by thomas on 2017/7/19.
 */
@Configuration
public class SimpleConfig {

    @Bean
    public BraveKnight braveKnight()
    {
        return new BraveKnight(quest());
    }

    public Quest quest()
    {
        return new SlayDragonQuest(System.out);
    }
}
