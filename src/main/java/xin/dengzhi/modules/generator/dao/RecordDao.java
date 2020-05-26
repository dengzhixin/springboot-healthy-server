package xin.dengzhi.modules.generator.dao;

import xin.dengzhi.modules.generator.entity.RecordEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 健康信息记录
 * 
 * @author dengzhixin
 * @email 786339231@qq.com
 * @date 2020-05-14 23:27:30
 */
@Mapper
public interface RecordDao extends BaseMapper<RecordEntity> {
	
}
