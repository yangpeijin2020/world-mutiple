package com.example.demo.bean.stacker;

import java.util.Date;

public class AsTaskM {
    private Long id;

    private Long sourceId;

    private String wcsTaskNo;

    private String taskNo;

    private Byte taskType;

    private String containerNo;

    private String fromPoint;

    private String toPoint;

    private String bufferPoint;

    private Integer priority;

    private Integer containerStatus;

    private Boolean isTransfer;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Long areaNo;

    private String orgNo;

    private String distributeNo;

    private String warehouseNo;

    private Boolean isDelete;

    private Date ts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public String getWcsTaskNo() {
        return wcsTaskNo;
    }

    public void setWcsTaskNo(String wcsTaskNo) {
        this.wcsTaskNo = wcsTaskNo == null ? null : wcsTaskNo.trim();
    }

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo == null ? null : taskNo.trim();
    }

    public Byte getTaskType() {
        return taskType;
    }

    public void setTaskType(Byte taskType) {
        this.taskType = taskType;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getFromPoint() {
        return fromPoint;
    }

    public void setFromPoint(String fromPoint) {
        this.fromPoint = fromPoint == null ? null : fromPoint.trim();
    }

    public String getToPoint() {
        return toPoint;
    }

    public void setToPoint(String toPoint) {
        this.toPoint = toPoint == null ? null : toPoint.trim();
    }

    public String getBufferPoint() {
        return bufferPoint;
    }

    public void setBufferPoint(String bufferPoint) {
        this.bufferPoint = bufferPoint == null ? null : bufferPoint.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getContainerStatus() {
        return containerStatus;
    }

    public void setContainerStatus(Integer containerStatus) {
        this.containerStatus = containerStatus;
    }

    public Boolean getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(Boolean isTransfer) {
        this.isTransfer = isTransfer;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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

    public Long getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(Long areaNo) {
        this.areaNo = areaNo;
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

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }
}