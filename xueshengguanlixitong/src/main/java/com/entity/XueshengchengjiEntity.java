package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 学生成绩
 *
 * @author 
 * @email
 */
@TableName("xueshengchengji")
public class XueshengchengjiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XueshengchengjiEntity() {

	}

	public XueshengchengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 科目
     */
    @TableField(value = "xueshengchengji_name")

    private String xueshengchengjiName;


    /**
     * 学生成绩
     */
    @TableField(value = "xueshengchengji")

    private Integer xueshengchengji;


    /**
     * 成绩详情
     */
    @TableField(value = "xueshengchengji_content")

    private String xueshengchengjiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：科目
	 */
    public String getXueshengchengjiName() {
        return xueshengchengjiName;
    }


    /**
	 * 获取：科目
	 */

    public void setXueshengchengjiName(String xueshengchengjiName) {
        this.xueshengchengjiName = xueshengchengjiName;
    }
    /**
	 * 设置：学生成绩
	 */
    public Integer getXueshengchengji() {
        return xueshengchengji;
    }


    /**
	 * 获取：学生成绩
	 */

    public void setXueshengchengji(Integer xueshengchengji) {
        this.xueshengchengji = xueshengchengji;
    }
    /**
	 * 设置：成绩详情
	 */
    public String getXueshengchengjiContent() {
        return xueshengchengjiContent;
    }


    /**
	 * 获取：成绩详情
	 */

    public void setXueshengchengjiContent(String xueshengchengjiContent) {
        this.xueshengchengjiContent = xueshengchengjiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xueshengchengji{" +
            "id=" + id +
            ", jiaoshiId=" + jiaoshiId +
            ", yonghuId=" + yonghuId +
            ", xueshengchengjiName=" + xueshengchengjiName +
            ", xueshengchengji=" + xueshengchengji +
            ", xueshengchengjiContent=" + xueshengchengjiContent +
            ", createTime=" + createTime +
        "}";
    }
}
