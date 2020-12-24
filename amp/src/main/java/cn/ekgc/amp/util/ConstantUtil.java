package cn.ekgc.amp.util;

import cn.ekgc.amp.base.enums.StatusEnum;

import java.util.Properties;

/**
 * <b>系统常量工具类</b>
 * @author Vencel
 * @version 1.0.0
 * */

public class ConstantUtil {
	private static Properties props = new Properties();

	static {
		try {
			props.load(StatusEnum.class.getClassLoader().getResourceAsStream("system.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * <b>分页信息:默认当前页码</b>
	 * */
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("page.num"));

	/**
	 * <b>分页信息:默认每页显示数量</b>
	 * */
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("page.size"));
	/**
	 * <b>系统状态:启用状态</b>
	 * */
	public static final Integer STATUS_ENABLE = Integer.parseInt(props.getProperty("status.enable"));
	/**
	 * <b>系统状态:禁用状态</b>
	 * */
	public static final Integer STATUS_DISABLE = Integer.parseInt(props.getProperty("status.disable"));
}
