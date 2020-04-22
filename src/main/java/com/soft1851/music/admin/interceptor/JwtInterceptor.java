package com.soft1851.music.admin.interceptor;

import com.soft1851.music.admin.common.ResultCode;
import com.soft1851.music.admin.exception.CustomException;
import com.soft1851.music.admin.util.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 描述:
 * token拦截器
 *
 * @author：Guorc
 * @create 2020-04-22 9:11
 */
@Slf4j
public class JwtInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("Authorization");
        if (token == null){
            log.info("用户未登录，请先登录");
            throw new CustomException("用户未登录，请先登录", ResultCode.USER_NOT_SIGN_IN);
        }else {
            log.info("## token = {}",token);
            //认证
            if (JwtTokenUtil.isExpiration(token)){
                log.info("## log已失效");
                //通过自定义异常抛出token失效的信息
                throw new CustomException("token已失效",ResultCode.USER_TOKEN_EXPIRES);
            }else {
                //通过认证，放行到controller
                return true;
            }
        }
    }
}
