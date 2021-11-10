package com.arman.controller;


import com.arman.entity.SysUser;
import com.arman.service.SysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(SysUser)表控制层
 *
 * @author Arman
 * @date 2021-11-10 21:27:06
 */
@RestController
@RequestMapping("user")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    @GetMapping("/all")
    public List<SysUser> allUser() {
        return sysUserService.list();
    }

}

