package com.sso.ssoCore.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 提供泛型,开发者自己定义user
 * @param <T>
 */
@Data
public class SsoUser<T> implements Serializable {
    public static final long serialVersionUID = 42L;
    private int userId;
    private String userName;
    private String version;
    private long currentStoreTime;
    /**
     * 开发者可以自己定义user
     */
    private T defineUser;

}
