package com.example.demo.bean;

import java.util.Date;

public class StStorageLocation {
    private Long id;

    private Integer mapAreaId;

    private String storageLocationNo;

    private String point;

    private Integer status;

    private Integer locationType;

    private String containerNo;

    private String groupNo;

    private Byte groupIndex;

    private String storageAreaCode;

    private Integer usablestatus;

    private Boolean parking;

    private Boolean parkingStatus;

    private String carName;

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

    public Integer getMapAreaId() {
        return mapAreaId;
    }

    public void setMapAreaId(Integer mapAreaId) {
        this.mapAreaId = mapAreaId;
    }

    public String getStorageLocationNo() {
        return storageLocationNo;
    }

    public void setStorageLocationNo(String storageLocationNo) {
        this.storageLocationNo = storageLocationNo == null ? null : storageLocationNo.trim();
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point == null ? null : point.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLocationType() {
        return locationType;
    }

    public void setLocationType(Integer locationType) {
        this.locationType = locationType;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo == null ? null : groupNo.trim();
    }

    public Byte getGroupIndex() {
        return groupIndex;
    }

    public void setGroupIndex(Byte groupIndex) {
        this.groupIndex = groupIndex;
    }

    public String getStorageAreaCode() {
        return storageAreaCode;
    }

    public void setStorageAreaCode(String storageAreaCode) {
        this.storageAreaCode = storageAreaCode == null ? null : storageAreaCode.trim();
    }

    public Integer getUsablestatus() {
        return usablestatus;
    }

    public void setUsablestatus(Integer usablestatus) {
        this.usablestatus = usablestatus;
    }

    public Boolean getParking() {
        return parking;
    }

    public void setParking(Boolean parking) {
        this.parking = parking;
    }

    public Boolean getParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(Boolean parkingStatus) {
        this.parkingStatus = parkingStatus;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName == null ? null : carName.trim();
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