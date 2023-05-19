package com.java.springboot.entities;

import com.java.springboot.enums.AccountStatus;
import com.java.springboot.enums.ProfileType;
import com.java.springboot.enums.Role;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private int user_id;
    private String email_id;
    private String password;
    private String mobile_number;
    private Date password_last_changed_on;
    private Date account_created_on;
    private Date last_loggedin_on;
    private Date last_active_on;
    private String user_ips;
    private String jwt_token;
    private AccountStatus account_status;
    private String account_status_message;
    private Role role;
    private String fcm_token;
    private Boolean is_verified;
    private ProfileType profile_type;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public Date getPassword_last_changed_on() {
        return password_last_changed_on;
    }

    public void setPassword_last_changed_on(Date password_last_changed_on) {
        this.password_last_changed_on = password_last_changed_on;
    }

    public Date getAccount_created_on() {
        return account_created_on;
    }

    public void setAccount_created_on(Date account_created_on) {
        this.account_created_on = account_created_on;
    }

    public Date getLast_loggedin_on() {
        return last_loggedin_on;
    }

    public void setLast_loggedin_on(Date last_loggedin_on) {
        this.last_loggedin_on = last_loggedin_on;
    }

    public Date getLast_active_on() {
        return last_active_on;
    }

    public void setLast_active_on(Date last_active_on) {
        this.last_active_on = last_active_on;
    }

    public String getUser_ips() {
        return user_ips;
    }

    public void setUser_ips(String user_ips) {
        this.user_ips = user_ips;
    }

    public String getJwt_token() {
        return jwt_token;
    }

    public void setJwt_token(String jwt_token) {
        this.jwt_token = jwt_token;
    }

    public AccountStatus getAccount_status() {
        return account_status;
    }

    public void setAccount_status(AccountStatus account_status) {
        this.account_status = account_status;
    }

    public String getAccount_status_message() {
        return account_status_message;
    }

    public void setAccount_status_message(String account_status_message) {
        this.account_status_message = account_status_message;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFcm_token() {
        return fcm_token;
    }

    public void setFcm_token(String fcm_token) {
        this.fcm_token = fcm_token;
    }

    public Boolean getIs_verified() {
        return is_verified;
    }

    public void setIs_verified(Boolean is_verified) {
        this.is_verified = is_verified;
    }

    public ProfileType getProfile_type() {
        return profile_type;
    }

    public void setProfile_type(ProfileType profile_type) {
        this.profile_type = profile_type;
    }
}
