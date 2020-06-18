package zyh.pojo;

import lombok.Data;

/**
 * @program: blue-cloud
 * @description: 用户类
 * @author: Mr.Z
 * @create: 2020-06-17 20:16
 **/

public class User {
    private int userId;
    private String userName;
    private String password;
    private int roleId;
    private String isVip;
    private int status;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getIsVip() {
        return isVip;
    }

    public void setIsVip(String isVip) {
        this.isVip = isVip;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User(){}

    public User(int userId, String userName, String password, int roleId, String isVip, int status) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.roleId = roleId;
        this.isVip = isVip;
        this.status = status;
    }
    public User(int userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", roleId=" + roleId +
                ", isVip='" + isVip + '\'' +
                ", status=" + status +
                '}';
    }
}
