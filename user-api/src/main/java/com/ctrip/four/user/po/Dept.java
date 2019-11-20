package com.ctrip.four.user.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "DEPT")   //此实体映射表dept
public class Dept {

    @Id
    @Column(name = "DEPTNO")    //如果属性名与字段名相符，则此注解可以省略
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键策略
    private Integer deptno;
    private String dname;
    private String loc;

}
