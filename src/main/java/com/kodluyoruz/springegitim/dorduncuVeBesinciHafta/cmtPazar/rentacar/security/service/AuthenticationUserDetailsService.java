package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.security.service;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.dao.CustomerDao;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuthenticationUserDetailsService implements UserDetailsService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        Customer customer = customerDao.findByUsername(userName);
        if(customer == null) {
            throw new UsernameNotFoundException("User not found!");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ADMIN"));

        return User.withUsername(customer.getUsername())
                .password(customer.getPassword()).authorities(authorities)
                .build();
    }
}
