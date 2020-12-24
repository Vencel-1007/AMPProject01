package cn.ekgc.amp.base.pojo.vo;

import cn.ekgc.amp.util.ConstantUtil;

import java.io.Serializable;
import java.util.List;

/**
 * <b>分页视图信息</b>
 * @author Vencel
 * @param <E>
 * @version 1.0.0
 * */
public class PageVO<E>implements Serializable {

	private static final long serialVersionUID = 1591843018015541751L;
	private Integer pageNum;            //当前页码
	private Integer pageSize;           //每页显示数量
	private List<E> list;                //分页列表
	private Long totalCount;            //总条数
	private Integer totalPage;          //总页数

	public PageVO() {
	}

	public PageVO(Integer pageNum, Integer pageSize) {
		if (pageNum != null && pageNum > 0){
			this.pageNum = pageNum;
		}else {
			this.pageNum = ConstantUtil.PAGE_NUM;
		}
		if (pageSize != null && pageSize > 0){
			this.pageSize = pageNum;
		}else {
			this.pageSize = ConstantUtil.PAGE_SIZE;
		}

	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
}
