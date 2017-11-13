package com.codeup.blog.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

//public class UserWithRoles extends User implements UserDetails {
//    private List<String> userRoles;
//
//    public UserWithRoles(User user, List<String> userRoles) {
//        super(user);  // Call the copy constructor defined in User
//        this.userRoles = userRoles;

public class UserWithRoles extends User implements UserDetails {
    public UserWithRoles(User user) {
        super(user);  // Call the copy constructor defined in User
    }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            String roles = StringUtils.collectionToCommaDelimitedString(Collections.emptyList());
            return AuthorityUtils.commaSeparatedStringToAuthorityList(roles);
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
            return true;
        }
    }

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return false;
//    }
//}
