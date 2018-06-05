package com.zzgele.qmkx.sys.controller;

import com.zzgele.qmkx.sys.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: ${file_name}
 * @Description: ${todo}
 * @author: Haijun
 * @emial: isaiah@sohu.com
 * @date 2018/6/5下午1:53
 */
@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;
}
