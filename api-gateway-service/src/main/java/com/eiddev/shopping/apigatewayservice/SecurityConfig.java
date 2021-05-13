package com.eiddev.shopping.apigatewayservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityChain(ServerHttpSecurity http) {
        http.authorizeExchange(exchange -> exchange.anyExchange().authenticated()).oauth2Login(Customizer.withDefaults());
        http.csrf().disable();
        return http.build();
    }
}
