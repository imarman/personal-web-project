package com.arman.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户表(SysUser)表实体类
 *
 * @author Arman
 * @date 2021-11-10 21:27:10
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysUser extends BaseEntity {

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像地址
     */
    private String avatar;

    /**
     * 状态：1激活，0未激活
     */
    private Integer status;

    /**
     * 权限
     */
    private String rules;

}

