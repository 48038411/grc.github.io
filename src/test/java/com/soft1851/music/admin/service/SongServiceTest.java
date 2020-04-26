package com.soft1851.music.admin.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SongServiceTest {
    @Resource
    private SongService songService;
    @Test
    void selectAll() {
        System.out.println(songService.selectAll());
    }

    @Test
    void getSongBy() {
        System.out.println(songService.getSongBy("周杰伦"));
    }
    @Test
    void getPage(){
        System.out.println(songService.getPage(1,10));
    }
}