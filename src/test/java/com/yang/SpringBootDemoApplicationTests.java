package com.yang;

import com.yang.dao.TestBootRepository;
import com.yang.vo.TestBoot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MainApplication.class)
@WebAppConfiguration
public class SpringBootDemoApplicationTests {
    @Autowired
    private WebApplicationContext context;
    @Autowired
    private TestBootRepository testBootRepository;

    //@Value("${server.port}")     // TODO: 2016/7/28  debug value
    private int port = 8080;

    private MockMvc mockMvc;
    private RestTemplate restTemplate = new RestTemplate();

    @Before
    public void before() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void contextLoads() {
        Assert.assertEquals(25, testBootRepository.count());
    }

    @Test
    public void get() {     // TODO: 2016/7/28 rerun failed test
        TestBoot testBoot = restTemplate.getForObject("http://localhost:" + port + "/test-boot/10", TestBoot.class);
        Assert.assertNotNull(testBoot);
        Assert.assertEquals("test795", testBoot.getValue());
    }

}
