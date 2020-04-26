package com.soft1851.music.admin.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SongListServiceTest {
    @Resource
    private SongListService songListService;
    @Test
    void getByType() {
        System.out.println(songListService.getByType());
    }

    @Test
    void blurSelect() {
        System.out.println(songListService.blurSelect("周杰伦"));
    }

    @Test
    void getByPage() {
        int current = 10;
        int size = 10;
        System.out.println(songListService.getByPage(current,size));
    }

    @Test
    void selectAll() {
        System.out.println(songListService.selectAll());
    }
}