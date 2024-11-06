package com.example.pww;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
public class PwwApplication {

	public static void main(String[] args) {
		SpringApplication.run(PwwApplication.class, args);
	}
	
	 @Bean
	    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
	        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
	        
	        // 데이터 소스를 설정하여 의존성 주입을 수행합니다.
	        sessionFactory.setDataSource(dataSource);

	        // MyBatis 매퍼 XML 파일의 위치를 지정합니다.
	        Resource[] res = new PathMatchingResourcePatternResolver()
	                .getResources("classpath:mybatis/mapper/*.xml");

	        // 가져온 매퍼 XML 파일을 설정합니다.
	        sessionFactory.setMapperLocations(res);
	        
	        // SqlSessionFactory 객체를 반환합니다.
	        return sessionFactory.getObject();
	    }
	
	

	
}