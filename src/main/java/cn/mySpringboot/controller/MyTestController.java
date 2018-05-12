package cn.mySpringboot.controller;

import cn.mySpringboot.entity.User;
import cn.mySpringboot.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Api(description = "第一个Controller ")
public class MyTestController {
    @Autowired
    private TestService testService;

    @GetMapping("/sayHello")
    @ApiOperation(value = "打招呼", notes = "作者：张贵聪<br/>")
    public String sayHello(@RequestParam String username) {
        return "hello!";
    }

    @PostMapping("/findUserById")
    @ApiOperation(value = "根据用户Id查找用户", notes = "作者：张贵聪<br/>")
    public User fingUserById(@RequestParam String userId) {
        return testService.getUserById(userId);
    }

    @PostMapping("/findUserByUser")
    @ApiOperation(value = "根据用户user查找用户", notes = "作者：张贵聪<br/>")
    public User fingUserByUser(@RequestBody @ApiParam(required = false) User user) {
        return testService.getUserById(user.getUserId());

    }

}
