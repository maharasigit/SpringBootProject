package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private DataSource dataSource;
	
	
    public void  configure(AuthenticationManagerBuilder authenticate)
    {
    	/*try {
    		authenticate.inMemoryAuthentication()
			.withUser("maha").password("pass").roles("USER")
			.and()
			.withUser("sankar").password("pass").roles("ADMIN");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	
    	try {
			authenticate.jdbcAuthentication().dataSource(dataSource); //got h2 db in classpath it autoconfigure it.
    		
    		    
    		      
    		      
    		      
    		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @Bean
    public PasswordEncoder getPasscodeEncoder()
    {
    	return NoOpPasswordEncoder.getInstance();
    }
    
    public void  configure(HttpSecurity authorise) 
    {
    	try {
    		authorise.authorizeRequests()
    		 	 .antMatchers("/admin").hasRole("ADMIN")
    		 	 .antMatchers("/student").hasRole("USER")
    		 	 .antMatchers("/").permitAll()		    
    		     .and().formLogin();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
}
