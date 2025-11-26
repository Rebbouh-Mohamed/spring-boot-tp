package com.example.tp_orm.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/add", "/delete/**").hasRole("ADMIN")  // Admin seulement pour ajout/suppression
                .anyRequest().authenticated()  // Tout le reste nécessite authentification
            )
            .formLogin(form -> form
                .loginPage("/login")  // Page de login personnalisée (créez-la)
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/logout")
                .permitAll()
            )
            .exceptionHandling(ex -> ex
                .accessDeniedPage("/access-denied")  // Page pour accès refusé (optionnel)
            );

        return http.build();
    }
}