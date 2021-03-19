package com.shang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author shang
 * @PackageName:com.shang
 * @ClassName:Dept
 * @Description:
 * @date 2021/3/19 18:14
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Dept implements Serializable {
    private Long deptNo;
    private String deptName;
}
