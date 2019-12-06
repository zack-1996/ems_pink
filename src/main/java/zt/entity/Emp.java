package zt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Emp {
    private Integer id;
    private String name;
    private Double salary;
    private Integer age;
    private Data bir;
    private Integer dept_id;
    private String deptname;
}
