package xin.dengzhi.modules.generator.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import xin.dengzhi.common.utils.PageUtils;
import xin.dengzhi.common.utils.Query;
import xin.dengzhi.modules.generator.dao.RecordDao;
import xin.dengzhi.modules.generator.entity.RecordEntity;
import xin.dengzhi.modules.generator.service.RecordService;

import java.util.Map;


@Service("recordService")
public class RecordServiceImpl extends ServiceImpl<RecordDao, RecordEntity> implements RecordService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        QueryWrapper wrapper = new QueryWrapper();
        if(StringUtils.isNotEmpty(params.get("stuNum").toString()) ){
            wrapper.eq("stu_num",params.get("stuNum"));
        }
        if(StringUtils.isNotEmpty(params.get("name").toString()) ){
            wrapper.like("name",params.get("name"));
        }
        if(StringUtils.isNotEmpty(params.get("grade").toString()) ){
            wrapper.like("grade",params.get("grade"));
        }
        if(params.get("sex")!=null && StringUtils.isNotEmpty(params.get("sex").toString()) ){
            wrapper.eq("sex",params.get("sex"));
        }
        IPage<RecordEntity> page = this.page(
                new Query<RecordEntity>().getPage(params),
                wrapper);

        return new PageUtils(page);
    }

}