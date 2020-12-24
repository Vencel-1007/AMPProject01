package cn.ekgc.amp.base.enums;

import cn.ekgc.amp.util.ConstantUtil;

import java.util.Properties;

/**
 * <b>状态枚举信息</b>
 * @author Vencel
 * @version 1.0.0
 * */

public enum StatusEnum {
	STATUS_ENABLE(ConstantUtil.STATUS_ENABLE,"启用"),
	STATUS_DISABLE(ConstantUtil.STATUS_DISABLE,"禁用");

	private Integer code;
	private String remark;


	private StatusEnum(Integer code,String remark){
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
