package com.soft1851.music.admin.mapper;

import com.soft1851.music.admin.entity.SysAdmin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Guorc
 * @since 2020-04-21
 */
public interface SysAdminMapper extends BaseMapper<SysAdmin> {
    /**
     * 根据用户名查询用户是否存在
     * @param name
     * @return
     */
    SysAdmin findUserByName(@Param("name") String name);

    /**
     * 根据用户账号查询用户信息以及角色
     * @param name
     * @return
     */
    List<Map<String,Object>> getAdminRoleByAdminName(@Param("name") String name);
}
