package com.arman.service.impl;

import com.arman.entity.SysUser;
import com.arman.mapper.SysUserMapper;
import com.arman.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户表(SysUser)表服务实现类
 *
 * @author Arman
 * @date 2021-11-10 21:27:11
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}

