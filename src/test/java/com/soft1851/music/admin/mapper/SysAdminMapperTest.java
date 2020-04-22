package com.soft1851.music.admin.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SysAdminMapperTest {
@Resource
private SysAdminMapper sysAdminMapper;
    @Test
    void findUserByName() {
        String name = "mqxu";
        System.out.println(sysAdminMapper.findUserByName(name));
    }
}