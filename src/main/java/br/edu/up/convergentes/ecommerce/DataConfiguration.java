package br.edu.up.convergentes.ecommerce;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DataConfiguration {
	
	@Bean
	 public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean() {
	  LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
	  em.setDataSource(dataSource());
	  em.setPackagesToScan(new String[] { "br.edu.up.convergentes.entity" });

	  JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	  em.setJpaVendorAdapter(vendorAdapter);
	  em.setJpaProperties(additionalProperties());

	  return em;
	 }

	 Properties additionalProperties() {
	  Properties properties = new Properties();
	  properties.setProperty("hibernate.hbm2ddl.auto",  "update");
	  properties.setProperty("hibernate.dialect",   "org.hibernate.dialect.MySQL5Dialect");
	  properties.setProperty("hibernate.show_sql",   "false");
	  properties.setProperty("hibernate.format_sql",   "false");
	  
	  return properties;
	 }

	@Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db_ecommerce?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }

//	@Bean
//	public JpaVendorAdapter jpaVendorAdapter(){
//		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//		adapter.setDatabase(Database.MYSQL);
//		adapter.setShowSql(true);
//		adapter.setGenerateDdl(true);
//		adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
//		adapter.setPrepareConnection(true);
//		return adapter;
//	}
}