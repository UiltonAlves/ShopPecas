package br.com.shoppecas.configuration;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import br.com.shoppecas.configuration.JPAConfiguration.Hbm2Ddl;
@Component
@Profile("DEV_mysql")
public class JPADesenvolvimentoMYSQL {
	
//QUANDO USAR O MYSQL, RETIRAR OU COMENTAR AS ENTIDADE "BEANS" O ID GENERATE VALUE E @SequenceGenerator ., POIS SOMENTE E USADO NO POSTGRESSQL.

	@Bean(autowire = Autowire.BY_NAME)
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setUrl("jdbc:mysql://localhost:3306/shopPecas");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		
		return dataSource;
	}
	
	
	@Bean(autowire = Autowire.BY_NAME)
	public Map<String, ?> jpaPropertiesMap() {
		Map<String, Object> bean = new HashMap<String, Object>();
		bean.put("hibernate.hbm2ddl.auto", Hbm2Ddl.UPDATE.getValue());
		bean.put("hibernate.format_sql", true);
		bean.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		bean.put("hibernate.enable_lazy_load_no_trans", true);
		return bean;
	}
	
}
