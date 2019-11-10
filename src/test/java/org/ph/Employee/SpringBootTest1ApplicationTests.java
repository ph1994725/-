package org.ph.Employee;

import java.util.Date;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import antlr.collections.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
public class SpringBootTest1ApplicationTests {

	

	
	@Before
    public void init() {
        System.out.println("开始测试--------------------------------------------------------------");
    }
 
	
	
    @After
    public void after() {
        System.out.println("测试结束------------------------------------------------------------");
    }
	
}
