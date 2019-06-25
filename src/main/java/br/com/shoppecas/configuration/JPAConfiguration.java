package br.com.shoppecas.configuration;

import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.SharedCacheMode;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.dialect.H2Dialect;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaDialect;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.AbstractTransactionManagementConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "br.com.shoppecas")
@ComponentScan(basePackages = { "br.com.shoppecas" })
public class JPAConfiguration extends AbstractTransactionManagementConfiguration{

	private static final Log log = LogFactory.getLog(JPAConfiguration.class);

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory( 
			DataSource dataSource, //
			JpaVendorAdapter jpaVendorAdapter, //
			
			@Value("#{packagesToScan}") String[] packagesToScan, //
			@Value("#{sharedCacheMode}") SharedCacheMode sharedCacheMode, //
			@Value("#{jpaPropertiesMap}") Map<String, ?> jpaPropertiesMap){

			JpaDialect dialect = new HibernateJpaDialect();
				
		log.info("Loading JPA EntityManagerFactory.");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		
		
		bean.setDataSource(dataSource);
		bean.setJpaVendorAdapter(jpaVendorAdapter);
		bean.setPackagesToScan(packagesToScan);
		bean.setSharedCacheMode(sharedCacheMode);
		bean.setJpaDialect(dialect);
		
		bean.afterPropertiesSet();
		
		return bean;
	}

	@Bean
	@Autowired
	public JpaVendorAdapter jpaVendorAdapter( //
			@Value("#{jpaVendorDatabase}") Database jpaVendorDatabase, //
			@Value("#{jpaVendorDialect}") String jpaVendorDialect, //
			@Value("#{generateDdl}") Boolean generateDdl, //
			@Value("#{showSql}") Boolean showSql) {
		

		log.info("Loading Hibernate as JPA vendor.");
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(jpaVendorDatabase);
		adapter.setDatabasePlatform(jpaVendorDialect);
		adapter.setGenerateDdl(generateDdl);
		adapter.setShowSql(showSql);
		return adapter;
	}

	@Bean(autowire = Autowire.BY_NAME)
	public String jpaVendorDialect() {
		return H2Dialect.class.getName();
	}
		
	
	@Bean
	public PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor() {
		log.info("Loading PersistenceExceptionTranslationPostProcessor.");
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@Bean
	public PersistenceAnnotationBeanPostProcessor persistenceAnnotationBeanPostProcessor() {
		log.info("Loading PersistenceAnnotationBeanPostProcessor.");
		return new PersistenceAnnotationBeanPostProcessor();
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		log.info("Loading JPA Transaction Management.");
		return new JpaTransactionManager(entityManagerFactory);
	}

	/*
	 * DEFINITIONS
	 */

	@Bean(autowire = Autowire.BY_NAME)
	public String[] packagesToScan() {
		return JPAConfiguration.class.getAnnotation(ComponentScan.class).basePackages();
	}

	@Bean(autowire = Autowire.BY_NAME)
	public Database jpaVendorDatabase() {
		return Database.H2;
	}

	@Bean(autowire = Autowire.BY_NAME)
	public Boolean generateDdl() {
		return Boolean.TRUE;
	}

	@Bean(autowire = Autowire.BY_NAME)
	public Boolean showSql() {
		return Boolean.TRUE;
	}

	@Bean(autowire = Autowire.BY_NAME)
	public SharedCacheMode sharedCacheMode() {
		return SharedCacheMode.ENABLE_SELECTIVE;
	}

	/*
	 * HIBERNATE
	 */

	public enum Hbm2Ddl {
		NONE("none"), VALIDATE("validate"), UPDATE("update"), CREATE("create"), CREATE_AND_DROP("create-drop");

		private String value;

		private Hbm2Ddl(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	
}