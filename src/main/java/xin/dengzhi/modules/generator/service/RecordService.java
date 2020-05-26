package xin.dengzhi.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xin.dengzhi.common.utils.PageUtils;
import xin.dengzhi.modules.generator.entity.RecordEntity;

import java.util.Map;

/**
 * 健康信息记录
 *
 * @author dengzhixin
 * @email 786339231@qq.com
 * @date 2020-05-14 23:27:30
 */
public interface RecordService extends IService<RecordEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

