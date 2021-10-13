package com.umgsai.spring5.test.core;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class MainTest {

//    private static final Logger log = LoggerFactory.getLogger(FansClubTaskHandler.class);

    @Test
    public void test() {
        System.out.println("this is a test");
    }
}
