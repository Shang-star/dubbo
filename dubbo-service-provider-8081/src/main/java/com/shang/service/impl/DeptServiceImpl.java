package com.shang.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.shang.pojo.Dept;
import com.shang.service.DeptService;

/**
 * @author shang
 * @PackageName:com.shang.service.impl
 * @ClassName:DeptServiceImpl
 * @Description: 暴露服务
 * @date 2021/3/19 18:19
 */
@Service // dubbo注解，暴露服务
public class DeptServiceImpl implements DeptService {

    @Override
    public Dept findDeptById() {
        return new Dept().setDeptName("db01测试数据")
                .setDeptNo(1001L);
    }
}
