package com.messaging.springjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class appconfig {

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails userDetails = User.builder().username("Sachin").password(passwordEncoder().encode("Sachin@123")).roles("ADMIN").build();
        UserDetails userDetail1 = User.builder().username("Ram").password(passwordEncoder().encode("Ram@123")).roles("ADMIN").build();
        return new InMemoryUserDetailsManager(userDetail1, userDetails);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
}
