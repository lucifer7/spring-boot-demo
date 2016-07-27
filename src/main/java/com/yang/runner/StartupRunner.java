package com.yang.runner;

import com.yang.vo.TestBoot;
import com.yang.dao.TestBootRepository;
import lombok.extern.log4j.Log4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * Created with IntelliJ IDEA.
 * User: Jingyi.Yang
 * Date: 2016/7/22
 * Time: 16:30
 **/
@Log4j
public class StartupRunner implements CommandLineRunner {

    /*@Autowired
    private DataSource ds;*/
    @Autowired
    private TestBootRepository testBootRepository;

    @Override
    public void run(String... strings) throws Exception {
        //log.info("Load datasource: " + ds.toString());
       /* log.info("######### " + testBootRepository.count());
        log.info("Find by value: " + testBootRepository.findTestBootByValue(""));

        TestBoot testBoot = new TestBoot();
        testBoot.setValue("test" + RandomUtils.nextInt(0, 1024));
        testBootRepository.save(testBoot);*/
    }
}
