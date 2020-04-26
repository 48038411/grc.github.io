package com.soft1851.music.admin.service.impl;

import com.soft1851.music.admin.entity.SongType;
import com.soft1851.music.admin.mapper.SongMapper;
import com.soft1851.music.admin.mapper.SongTypeMapper;
import com.soft1851.music.admin.service.SongTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Guorc
 * @since 2020-04-21
 */
@Service
public class SongTypeServiceImpl extends ServiceImpl<SongTypeMapper, SongType> implements SongTypeService {
}
