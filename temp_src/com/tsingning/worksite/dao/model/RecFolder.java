package com.tsingning.worksite.dao.model;

//RecFolder
@Table(name="rec_folder")
public class RecFolder implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//主键编号
	@Id 
	@Column(name="rec_folder_id")	
	private java.lang.String recFolderId;	
	//项目工程ID
	@Column(name="engineering_id")	
	private java.lang.String engineeringId;
	//文件夹名称
	@Column(name="folder_name")	
	private java.lang.String folderName;
	//父节点ID，顶节点为0
	@Column(name="parent_id")	
	private java.lang.String parentId;
	//添加用户
	@Column(name="add_user")	
	private java.lang.Integer addUser;
	//添加时间
	@Column(name="add_time")	
	private java.util.Date addTime;
	//更新用户
	@Column(name="update_user")	
	private java.lang.Integer updateUser;
	//更新时间
	@Column(name="update_time")	
	private java.util.Date updateTime;

	public java.lang.String getRecFolderId() {
		return recFolderId;
	}
	public java.lang.String getEngineeringId() {
		return engineeringId;
	}
	public java.lang.String getFolderName() {
		return folderName;
	}
	public java.lang.String getParentId() {
		return parentId;
	}
	public java.lang.Integer getAddUser() {
		return addUser;
	}
	public java.util.Date getAddTime() {
		return addTime;
	}
	public java.lang.Integer getUpdateUser() {
		return updateUser;
	}
	public java.util.Date getUpdateTime() {
		return updateTime;
	}
	public void setRecFolderId(java.lang.String recFolderId) {
		this.recFolderId=recFolderId;
	}
	public void setEngineeringId(java.lang.String engineeringId) {
		this.engineeringId=engineeringId;
	}
	public void setFolderName(java.lang.String folderName) {
		this.folderName=folderName;
	}
	public void setParentId(java.lang.String parentId) {
		this.parentId=parentId;
	}
	public void setAddUser(java.lang.Integer addUser) {
		this.addUser=addUser;
	}
	public void setAddTime(java.util.Date addTime) {
		this.addTime=addTime;
	}
	public void setUpdateUser(java.lang.Integer updateUser) {
		this.updateUser=updateUser;
	}
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime=updateTime;
	}
}
