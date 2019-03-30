package org.exam.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.exam.bean.dto.RespBean;
import org.exam.bean.entity.TClazz;
import org.exam.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * exam-server/org.exam.controller
 *
 * @author heshiyuan
 */
@Api(tags = "班级相关")
@RestController
@RequestMapping("/clazz")
public class ClazzController {
    @Autowired
    ClazzService clazzService;
    @GetMapping(value = "/list")
    public RespBean<PageInfo<List<TClazz>>> list(
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "10") Integer pageSize){
        return RespBean.ok(clazzService.list(pageNum, pageSize));
    }

    @PutMapping
    public RespBean<Integer> put(TClazz academy){
        return RespBean.ok(clazzService.update(academy));
    }
    @PostMapping
    public RespBean post(TClazz academy){
        return RespBean.ok(clazzService.insert(academy));
    }


    @DeleteMapping(value = "/{id}")
    public RespBean delete(@PathVariable("id") Long id){
        return RespBean.ok(clazzService.delete(id));
    }

}