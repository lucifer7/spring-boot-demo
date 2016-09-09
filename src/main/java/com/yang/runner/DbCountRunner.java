package com.yang.runner;

import lombok.extern.log4j.Log4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Usage: <b> Repository 监测类，用于应用监控 </b>
 *
 * @author Jingyi.Yang
 * @since 2016/9/9
 **/
@Log4j
public class DbCountRunner implements CommandLineRunner {
    private Collection<CrudRepository> repositories;

    public DbCountRunner(Collection<CrudRepository> repositories) {
        this.repositories = repositories;
    }

    @Override
    public void run(String... strings) throws Exception {
        repositories.forEach(crudRepository -> log.info(String.format("%s had %d entities", getRepositoryName(crudRepository.getClass()), crudRepository.count())));
    }

    public static String getRepositoryName(Class clz) {
        for (Class clzInterface :
                clz.getInterfaces()) {
            if (clzInterface.getName().startsWith("com.yang.dao")) {
                return clzInterface.getSimpleName();
            }
        }
        return "UnknownRepository";
    }
}
