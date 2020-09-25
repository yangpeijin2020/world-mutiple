package com.example.demo.bean.stacker;

import java.math.BigDecimal;
import java.util.Date;

public class Container {
    private Long id;

    private String containerNo;

    private String trayNo;

    private String containerTypeNo;

    private String containerBizTypeNo;

    private String storageLocationNo;

    private Long mapAreaId;

    private Integer pickType;

    private String point;

    private String orientationNo;

    private BigDecimal weight;

    private String band;

    private Integer status;

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

    private String zoneNo;

    private Byte stopInFlag;

    private String zoneName;

    private String subAreaNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getTrayNo() {
        return trayNo;
    }

    public void setTrayNo(String trayNo) {
        this.trayNo = trayNo == null ? null : trayNo.trim();
    }

    public String getContainerTypeNo() {
        return containerTypeNo;
    }

    public void setContainerTypeNo(String containerTypeNo) {
        this.containerTypeNo = containerTypeNo == null ? null : containerTypeNo.trim();
    }

    public String getContainerBizTypeNo() {
        return containerBizTypeNo;
    }

    public void setContainerBizTypeNo(String containerBizTypeNo) {
        this.containerBizTypeNo = containerBizTypeNo == null ? null : containerBizTypeNo.trim();
    }

    public String getStorageLocationNo() {
        return storageLocationNo;
    }

    public void setStorageLocationNo(String storageLocationNo) {
        this.storageLocationNo = storageLocationNo == null ? null : storageLocationNo.trim();
    }

    public Long getMapAreaId() {
        return mapAreaId;
    }

    public void setMapAreaId(Long mapAreaId) {
        this.mapAreaId = mapAreaId;
    }

    public Integer getPickType() {
        return pickType;
    }

    public void setPickType(Integer pickType) {
        this.pickType = pickType;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point == null ? null : point.trim();
    }

    public String getOrientationNo() {
        return orientationNo;
    }

    public void setOrientationNo(String orientationNo) {
        this.orientationNo = orientationNo == null ? null : orientationNo.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band == null ? null : band.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getZoneNo() {
        return zoneNo;
    }

    public void setZoneNo(String zoneNo) {
        this.zoneNo = zoneNo == null ? null : zoneNo.trim();
    }

    public Byte getStopInFlag() {
        return stopInFlag;
    }

    public void setStopInFlag(Byte stopInFlag) {
        this.stopInFlag = stopInFlag;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName == null ? null : zoneName.trim();
    }

    public String getSubAreaNo() {
        return subAreaNo;
    }

    public void setSubAreaNo(String subAreaNo) {
        this.subAreaNo = subAreaNo == null ? null : subAreaNo.trim();
    }
}