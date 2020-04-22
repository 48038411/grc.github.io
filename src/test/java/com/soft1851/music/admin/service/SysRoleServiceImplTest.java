package com.soft1851.music.admin.service;

import com.soft1851.music.admin.mapper.SysRoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Guorc
 * @Date: 2020/4/22 15:49
 * @Description:
 */
@SpringBootTest
class SysRoleServiceImplTest {
@Resource
private SysRoleMapper sysRoleMapper;
    @Test
    void selectRoleById() {
        System.out.println(sysRoleMapper.selectRoleById(1));
    }
}