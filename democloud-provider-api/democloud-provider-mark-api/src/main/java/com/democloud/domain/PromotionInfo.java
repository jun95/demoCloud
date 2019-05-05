package com.democloud.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 促销活动信息类
 */
public class PromotionInfo implements Serializable {
	/** 主键，促销ID */
	private Long id;

	/** 经销商ID */
	private Long dealerId;

	/** 促销编码 */
	private String promotionCode;

	/** 促销类型（'1：满赠 2：返利 3：特价'） */
	private Integer type;

	/** 促销名称 */
	private String title;

	/** 开始时间 */
	private Date beginDate;

	/** 结束时间 */
	private Date endDate;

	/** 活动范围（'1：全部2：指定门店 3：指定门店类型'） */
	private Integer scope;

	/** 发布平台（'SFA、O2O'） */
	private String channel;

	/** 状态（ '1：未开始 2：已开始 3：已结束 4：失效'） */
	private Integer status;

	/** 预估费用 */
	private BigDecimal estimatedCost;

	/** 预估销量 */
	private Long forecastSales;



	/** 费用率 */
	private BigDecimal costRate;

	/** 创建时间 */
	private Date createTime;

	/** 创建人ID */
	private Long createUser;

	/** 修改时间 */
	private Date updateTime;

	/** 修改人ID */
	private Long updateUser;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDealerId() {
		return dealerId;
	}

	public void setDealerId(Long dealerId) {
		this.dealerId = dealerId;
	}

	public String getPromotionCode() {
		return promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode == null ? null : promotionCode.trim();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getScope() {
		return scope;
	}

	public void setScope(Integer scope) {
		this.scope = scope;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel == null ? null : channel.trim();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}



	public BigDecimal getEstimatedCost() {
		return estimatedCost;
	}

	public void setEstimatedCost(BigDecimal estimatedCost) {
		this.estimatedCost = estimatedCost;
	}

	public Long getForecastSales() {
		return forecastSales;
	}

	public void setForecastSales(Long forecastSales) {
		this.forecastSales = forecastSales;
	}

	public BigDecimal getCostRate() {
		return costRate;
	}

	public void setCostRate(BigDecimal costRate) {
		this.costRate = costRate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}
}