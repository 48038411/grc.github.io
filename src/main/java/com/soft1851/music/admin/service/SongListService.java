package com.soft1851.music.admin.service;

import com.soft1851.music.admin.entity.SongList;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Guorc
 * @since 2020-04-21
 */
public interface SongListService extends IService<SongList> {
    /**
     * 根据类型获取歌单
     * @return
     */
    List<Map<String,Object>> getByType();

    /**
     * 根据属性模糊查询
     * @param field
     * @return
     */
    List<SongList> blurSelect(String field);

    /**
     * 查询分页数据
     * @param
     * @return
     */
    List<SongList> getByPage(int current,int size);

    /**
     * 查询所有歌曲
     * @return
     */
    List<Map<String, Object>> selectAll();
}
