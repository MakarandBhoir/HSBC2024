package com.hsbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecutityConfig {
	 @Bean
	    public InMemoryUserDetailsManager userDetailsManager() {
	    	System.out.println("Inside userDetailsManager");
	        UserDetails user1 = User.builder()
	                .username("makarand")
	                .password("{noop}makarand")
	                .roles("EMPLOYEE")
	                .build();

	        UserDetails user2 = User.builder()
	                .username("harsh")
	                .password("{noop}harsh")
	                .roles("EMPLOYEE", "MANAGER")
	                .build();

	        UserDetails user3 = User.builder()
	                .username("rishita")
	                .password("{noop}rishita")
	                .roles("EMPLOYEE", "MANAGER", "ADMIN")
	                .build();

	        return new InMemoryUserDetailsManager(user1, user2, user3);
	    }
	 
	 @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    	System.out.println("Inside filterChain");
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET, "/api/students").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.GET, "/api/students/**").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.POST, "/api/students").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PUT, "/api/students").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE, "/api/students/**").hasRole("ADMIN")
        );

        // use HTTP Basic authentication
        http.httpBasic(Customizer.withDefaults());
        // disable Cross Site Request Forgery (CSRF)
        // in general, not required for stateless REST APIs that use POST, PUT, DELETE and/or PATCH
        http.csrf(csrf -> csrf.disable());

        return http.build();
    }
}