package xin.dengzhi.modules.generator.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xin.dengzhi.common.utils.PageUtils;
import xin.dengzhi.common.utils.R;
import xin.dengzhi.modules.generator.entity.RecordEntity;
import xin.dengzhi.modules.generator.service.RecordService;

import java.util.Arrays;
import java.util.Map;


/**
 * 健康信息记录
 *
 * @author dengzhixin
 * @email 786339231@qq.com
 * @date 2020-05-14 23:27:30
 */
@RestController
@RequestMapping("generator/record")
public class RecordController {
    @Autowired
    private RecordService recordService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:record:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = recordService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:record:info")
    public R info(@PathVariable("id") Integer id) {
        RecordEntity record = recordService.getById(id);

        return R.ok().put("record", record);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:record:save")
    public R save(@RequestBody RecordEntity record) {
        recordService.save(record);

        return R.ok();
    }

    /**
     * 保存
     */
    @RequestMapping("/saves")
    @RequiresPermissions("generator:record:save")
    public R saves(@RequestBody Map<String, RecordEntity[]> map) {
        RecordEntity[] records = map.get("records");
        for (RecordEntity record : records) {
            System.out.println(record.getStuNum());

        }
        recordService.saveBatch(Arrays.asList(records));
//        recordService.save(record);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:record:update")
    public R update(@RequestBody RecordEntity record) {
        recordService.updateById(record);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:record:delete")
    public R delete(@RequestBody Integer[] ids) {
        recordService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
