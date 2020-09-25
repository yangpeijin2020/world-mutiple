package com.example.demo.bean.stacker;

import java.math.BigDecimal;
import java.util.Date;

public class ContainerStock {
    private Long id;

    private String binNo;

    private Long mapAreaId;

    private String containerNo;

    private String surfaceNo;

    private String shelfNo;

    private Integer status;

    private String goodsNo;

    private BigDecimal qty;

    private BigDecimal qtyDiff;

    private BigDecimal qtyOutOccupy;

    private String productLevel;

    private String lotNo;

    private String ownerNo;

    private String uuid;

    private String orgNo;

    private String distributeNo;

    private String warehouseNo;

    private String remark;

    private Boolean isDelete;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Date ts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBinNo() {
        return binNo;
    }

    public void setBinNo(String binNo) {
        this.binNo = binNo == null ? null : binNo.trim();
    }

    public Long getMapAreaId() {
        return mapAreaId;
    }

    public void setMapAreaId(Long mapAreaId) {
        this.mapAreaId = mapAreaId;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getSurfaceNo() {
        return surfaceNo;
    }

    public void setSurfaceNo(String surfaceNo) {
        this.surfaceNo = surfaceNo == null ? null : surfaceNo.trim();
    }

    public String getShelfNo() {
        return shelfNo;
    }

    public void setShelfNo(String shelfNo) {
        this.shelfNo = shelfNo == null ? null : shelfNo.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getQtyDiff() {
        return qtyDiff;
    }

    public void setQtyDiff(BigDecimal qtyDiff) {
        this.qtyDiff = qtyDiff;
    }

    public BigDecimal getQtyOutOccupy() {
        return qtyOutOccupy;
    }

    public void setQtyOutOccupy(BigDecimal qtyOutOccupy) {
        this.qtyOutOccupy = qtyOutOccupy;
    }

    public String getProductLevel() {
        return productLevel;
    }

    public void setProductLevel(String productLevel) {
        this.productLevel = productLevel == null ? null : productLevel.trim();
    }

    public String getLotNo() {
        return lotNo;
    }

    public void setLotNo(String lotNo) {
        this.lotNo = lotNo == null ? null : lotNo.trim();
    }

    public String getOwnerNo() {
        return ownerNo;
    }

    public void setOwnerNo(String ownerNo) {
        this.ownerNo = ownerNo == null ? null : ownerNo.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    public String getDistributeNo() {
        return distributeNo;
    }

    public void setDistributeNo(String distributeNo) {
        this.distributeNo = distributeNo == null ? null : distributeNo.trim();
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo == null ? null : warehouseNo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }
}