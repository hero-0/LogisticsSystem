package com.entor.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author fzg
 * @since 2020-01-03
 */
public class Users implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 普通用户id
     */
    private String usersId;

    /**
     * 普通用户姓名
     */
    private String usersName;

    /**
     * 普通用户联系方式
     */
    private String usersPhone;

    /**
     * 普通用户地址
     */
    private String usersAddress;


    public String getUsersId() {
        return usersId;
    }

    public void setUsersId(String usersId) {
        this.usersId = usersId;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public String getUsersPhone() {
        return usersPhone;
    }

    public void setUsersPhone(String usersPhone) {
        this.usersPhone = usersPhone;
    }

    public String getUsersAddress() {
        return usersAddress;
    }

    public void setUsersAddress(String usersAddress) {
        this.usersAddress = usersAddress;
    }

    @Override
    public String toString() {
        return "Users{" +
        "usersId=" + usersId +
        ", usersName=" + usersName +
        ", usersPhone=" + usersPhone +
        ", usersAddress=" + usersAddress +
        "}";
    }
}
