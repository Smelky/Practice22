package net.spring.service;

public class IncorrectRoleException extends RuntimeException {
    public IncorrectRoleException(){
        super("Not fount this role");
    }
}
