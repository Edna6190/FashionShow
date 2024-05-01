package com.blit.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.blit.Service.UserServiceImpl;
@Configuration
@EnableWebSecurity//ensures web security context

public class SecurityConfig {
	
	@Autowired
	private UserServiceImpl userService;

	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

        return httpSecurity
                .csrf(AbstractHttpConfigurer::disable).
                httpBasic(Customizer.withDefaults())
                .authorizeHttpRequests((c) -> {
                    c.anyRequest().authenticated();
                }).build();

    }
	

@Autowired
public void configureGlobal(AuthenticationManagerBuilder auth)
throws Exception {
	auth.userDetailsService(userService)
	.passwordEncoder(new BCryptPasswordEncoder());
	
}

public BCryptPasswordEncoder bCryptPasswordEncoder() {
	return new BCryptPasswordEncoder();
}
}



