package xin.dengzhi.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 健康信息记录
 * 
 * @author dengzhixin
 * @email 786339231@qq.com
 * @date 2020-05-14 23:27:30
 */
@Data
@TableName("tb_record")
public class RecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Integer id;
	/**
	 * 学号
	 */
	private String stuNum;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 班级
	 */
	private String grade;
	/**
	 * 身高
	 */
	private Double height;
	/**
	 * 体重
	 */
	private Double weight;
	/**
	 * 性别
	 */
	private Integer sex;
	/**
	 * 肺活量
	 */
	private String vitalCapacity;
	/**
	 * 长跑成绩
	 */
	private Double longDistanceRun;
	/**
	 * 短跑成绩
	 */
	private Double dash;
	/**
	 * 跳远
	 */
	private Double longJump;

}
