package cn.ekgc.amp.base.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础实体信息</b>
 * <p>
 *     包含所有实体的通用属性,其他实体信息都应当及成本基础实体信息
 *     从而继承这些通用属性
 * </p>
 *
 * */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 13214421513139924L;
	private Integer status;                 //系统状态  : 0-禁用,1-启用
	private Long createUser;                //创建人
	private Date createTime;                //创建时间
	private Long updateUser;                //修改人
	private Date updateTime;                //修改时间

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
