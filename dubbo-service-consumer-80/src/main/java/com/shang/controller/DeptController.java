package com.shang.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shang.pojo.Dept;
import com.shang.service.DeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shang
 * @PackageName:com.shang
 * @ClassName:DeptController
 * @Description:
 * @date 2021/3/19 20:01
 */
@RestController
public class DeptController {

    @Reference(loadbalance="roundrobin")
    DeptService deptService;

    @GetMapping("/dept")
    public Dept findDept() {
        Dept dept = deptService.findDeptById();
        System.out.println(dept);
        return dept;
    }

}
