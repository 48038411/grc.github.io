package com.soft1851.music.admin.controller;


import com.soft1851.music.admin.domain.entity.Song;
import com.soft1851.music.admin.service.SongService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Guorc
 * @since 2020-04-21
 */
@RestController
@RequestMapping("/song")
public class SongController {
    @Resource
    private SongService songService;

    @GetMapping("/list")
    public List<Song> selectAll() {
        return songService.selectAll();
    }

    @GetMapping("/blur")
    public List<Song> getSongBy(@Param("field") String field) {
        return songService.getSongBy(field);
    }
    @GetMapping("/page")
    public List<Song> getPage(@Param("currentPage") int currentPage,@Param("size") int size){
        return songService.getPage(currentPage,size);
    }

    /**
     * 导出歌曲
     */
    @GetMapping(value = "/export")
    public void exportData() {
        songService.exportData();
    }
}
