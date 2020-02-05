//package com.example.stline.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.AuthenticationEntryPoint;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Configuration
//    @Order(2)
//    public static class WebSecurityCASConfig extends WebSecurityConfigurerAdapter {
//        public WebSecurityCASConfig() {
//            super();
//        }
//
//        @Autowired
//        private AuthenticationEntryPoint authenticationEntryPoint;
//
//
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//
//            http
//
//                    .authorizeRequests()
//                    .antMatchers(
//                            "/js/**",
//                            "/css/**",
//                            "/images/**").permitAll()
//                    .regexMatchers("/login1")
//                    .authenticated()
//                    .and()
//                    .authorizeRequests()
//                    .and()
//                    .httpBasic()
//                    .authenticationEntryPoint(authenticationEntryPoint);
//
//
//        }
//
//
//    }
//
//
//
//    //second
//
//    @Configuration
//    @Order(1)
//    public static class WebSecurityDatabaseConfig extends WebSecurityConfigurerAdapter {
//
//        public WebSecurityDatabaseConfig() {
//            super();
//        }
//
//        @Autowired
//        UserDetailServiceImpl userDetailsService;
//
//        @Autowired
//        BCryptPasswordEncoder passwordEncoder;
//
//
//
//
//        @Autowired
//        public void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//            auth.userDetailsService(userDetailsService)
//                    .passwordEncoder(passwordEncoder);
//
//        }
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http
//                    .authorizeRequests()
//                    .antMatchers(
//                            "/js/**",
//                            "/css/**",
//                            "/images/**").permitAll()
//                    //.antMatchers("/catalog").access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
//                    ////.antMatchers("/login1").permitAll()
//                    .anyRequest().authenticated()
//                    .and()
//                    .formLogin()
//                    .loginPage("/login")
//                    .defaultSuccessUrl("/catalog", true)
//                    .permitAll()
//                    .usernameParameter("username")
//                    .passwordParameter("password")
//                    .and()
//                    .logout()
//                    .permitAll()
//                    .logoutUrl("/logout").logoutSuccessUrl("/logout")
//                    .and().exceptionHandling().accessDeniedPage("/403");
//
//
//        }
//    }
//}
