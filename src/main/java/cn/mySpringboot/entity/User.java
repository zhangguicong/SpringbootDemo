package cn.mySpringboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @ApiModelProperty(value="用户Id")
    private String userId;
    @ApiModelProperty(value="用户名")
    private String username;
    @ApiModelProperty(value="年龄")
    private int age;
    @ApiModelProperty(value="地址")
    private String address;
}
