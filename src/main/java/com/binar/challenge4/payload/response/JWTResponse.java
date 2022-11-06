package com.binar.challenge4.payload.response;

import java.util.List;

public class JWTResponse {
    private String token;
    private String type = "Bearer";
    private Long user_id;
    private String username;
    private String email;
    private List<String> roles;

    public JWTResponse(String accessToken, Long user_id, String username, String email, List<String> roles) {
        this.token = accessToken;
        this.user_id = user_id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }

    public Long getId() {
        return user_id;
    }

    public void setId(Long id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }
}
