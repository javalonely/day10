package com.example.config;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * 废弃代码
 */
@Component
public class SessionFactoryConfig implements ApplicationListener<ContextRefreshedEvent> {

//    @Autowired
//    SqlSessionFactory sqlSessionFactory;

    //    @Bean
//    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//    }
//    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
//        HikariDataSource hikariDataSource = (HikariDataSource) dataSource;
//        hikariDataSource.setDataSource(dataSource);
//        System.out.println(hikariDataSource);
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        ClassPathResource classPathResource = new ClassPathResource("mapper/DepartmentMapper.xml");
//        sqlSessionFactoryBean.setMapperLocations(classPathResource);
//        System.out.println(sqlSessionFactory);
//        return sqlSessionFactoryBean.getObject();
//    }

    /**
     * 超级超级无敌之骚操作
     * 跟启用yml文件注释掉相同的配置作用是一样的
     * @param contextRefreshedEvent
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ApplicationContext applicationContext = contextRefreshedEvent.getApplicationContext();
        SqlSessionFactory sqlSessionFactory = applicationContext.getBean(SqlSessionFactory.class);
        Configuration configuration = sqlSessionFactory.getConfiguration();
        TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
        typeHandlerRegistry.register("com.example.mapper.typehandler");
    }
}
