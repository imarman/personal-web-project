package com.arman.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Arman
 * @date 2021/11/10 21:29
 */
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtModify;

}
