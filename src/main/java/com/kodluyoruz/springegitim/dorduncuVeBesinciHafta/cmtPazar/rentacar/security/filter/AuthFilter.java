package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.security.filter;

import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthFilter  extends BasicAuthenticationFilter {
    public AuthFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String header = request.getHeader(HttpHeaders.AUTHORIZATION);

        System.out.println("Filter a girdi....");
        System.out.println(header);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null){
            UserDetails principal = (UserDetails)authentication.getPrincipal();
            System.out.println(principal.getUsername()) ;
        }
        filterChain.doFilter(request,response);
    }


}
