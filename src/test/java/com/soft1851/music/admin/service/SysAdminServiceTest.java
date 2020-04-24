package com.soft1851.music.admin.service;

import com.soft1851.music.admin.dto.LoginDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SysAdminServiceTest {
@Resource
private SysAdminService sysAdminService;
    @Test
    void login() {
        LoginDto loginDto = new LoginDto();
        loginDto.setName("mqxu");
        loginDto.setPassword("123456");
        System.out.println(sysAdminService.login(loginDto));
    }
    @Test
    void find(){
        System.out.println(sysAdminService.getAdminAndRolesByName("mqxu"));
    }

}