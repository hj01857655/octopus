package com.htxk.edusystem.domain;

import com.htxk.ruoyi.common.annotation.Excel;
import com.htxk.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 课程对象 edu_course
 *
 * @author maple
 * @date 2020-01-03
 */
public class EduCourse extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 课程ID
     */
    private Long courseId;

    /**
     * 课程名
     */
    @Excel(name = "课程名")
    private String courseName;

    /**
     * 更新者
     */
    @Excel(name = "更新者")
    private String updateBy;

    /**
     * 更新时间
     */
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updateTime;

    /**
     * 课程类型ID
     */
    @Excel(name = "课程类型ID")
    private Long courseTypeid;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("courseId", getCourseId())
                .append("courseName", getCourseName())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("courseTypeid", getCourseTypeid())
                .append("delFlag", getDelFlag())
                .toString();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Long getCourseTypeid() {
        return courseTypeid;
    }

    public void setCourseTypeid(Long courseTypeid) {
        this.courseTypeid = courseTypeid;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
