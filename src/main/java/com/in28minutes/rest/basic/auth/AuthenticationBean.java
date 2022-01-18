package com.in28minutes.rest.basic.auth;

public class AuthenticationBean {

    private String message;

    @Override
    public String toString() {
        return "{" +
            " message='" + getMessage() + "'" +
            "}";
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AuthenticationBean(String message) {
        this.message=message;
    }

}
