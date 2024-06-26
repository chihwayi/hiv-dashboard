package zw.org.mohcc.hiv_dashboard.configuration;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;

@Configuration
@EnableWebSecurity
*/
public class SecurityConfig {
/*
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll() // Permit all requests to static resources
                        .requestMatchers(antMatcher("/swagger-ui/**"), antMatcher("/v3/api-docs"), antMatcher("/webjars/**"), antMatcher("/error")).permitAll() // Include /swagger-ui/** to permit all requests to Swagger UI
                        .requestMatchers(antMatcher("/api/**")).authenticated() // Require authentication for API requests
                        .anyRequest().authenticated()) // Any other request requires authentication
                .csrf(AbstractHttpConfigurer::disable); // Disabling CSRF protection

        return http.build();
    }

 */
}
