# 2020.04.29
 - 后端彻底重构，增加EXCEL导出功能
 - 修复JWT一直携带roleId问题
 - 优化了token的生成机制，简化了controller的代码
 - 增加了判断用户提交表单判断的注解以及使用
 - 继续重构...
# 2020.04.26
 - 完成了歌曲的查询，模糊查询以及分页查询
 - 完成了歌单的查询，模糊查询以及分页查询
 - mybatis plus的基础方法需要掌握
# 2020.04.24
 - 前后端整理，完成前后端角色管理
 - 前端登录后会根据角色身份选择不同角色进入系统后传id到后端进行查询实现权限管理
# 2020.04.22
 - 完成了根据角色ID查询资源后端模块
 - 完成了前后端登录连通，测试全部通过才会进入dashboard
 - 有待继续改进
# 2020.04.21
 - 实现了登录接口
 - 登录完成后生成token
 - 可以结合redis比对验证码是否正确