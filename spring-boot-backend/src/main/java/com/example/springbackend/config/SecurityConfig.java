package com.example.springbackend.config;

import com.okta.spring.boot.oauth.Okta;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // protect endpoint /api/orders
        http.authorizeRequests()
                .antMatchers("/api/orders/**")
                // protect the endpoint that is only accessible to authenticated users
                .authenticated()
                .and()
                // configure OAuth2 Resource Server support
                .oauth2ResourceServer()
                // enables JWT-encoded bearer token support
                .jwt();

        // add CORS filters
        http.cors();

        // force a non-empty response body for 401's to make the response more friendly
        Okta.configureResourceServer401ResponseBody(http);

        // disable CSRF since we are not using Cookies for session tracking
        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
}
