package com.antares.dscommerce.projection;

public interface UserDetailsProjection {
    String getUsername();
	String getPassword();
	Long getRoleId();
	String getAuthority();
    
}
