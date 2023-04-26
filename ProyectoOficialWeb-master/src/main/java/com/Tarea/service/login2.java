
package com.Tarea.service;

import com.Tarea.entity.registro;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class login2 implements UserDetails {
   private registro registro;
    
    public login2(registro registro){
        this.registro = registro;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        List<GrantedAuthority> authorities = new ArrayList<>();
        //Extract list of permissions (name)
        this.registro.getPermissionList().forEach(p ->{
            GrantedAuthority authority = new SimpleGrantedAuthority(p);
            authorities.add(authority);
        });
        //Extract list of roles (ROLE_name)
        this.registro.getRoleList().forEach(r ->{
            GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + r);
            authorities.add(authority);
        });
        return authorities;
        }

    @Override
    public String getPassword() {
        return this.registro.getContrasena();
    }

    @Override
    public String getUsername() {
        return this.registro.getCorreo();    
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.registro.getActive() == 1;
    }  
} 

