package com.jala.menus;

	public class Ztree {  
	private String id;  
	private String pId;  
	private String name;  
	private String isParent;  
	private String file; 
	
	public Ztree() {  
	    super();  
	    this.isParent="false";  
	}  
	public String getId() {  
	    return id;  
	}  
	public void setId(String id) {  
	    this.id = id;  
	}  
	public String getpId() {  
	    return pId;  
	}  
	public void setpId(String pId) {  
	    this.pId = pId;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	public String getIsParent() {  
	    return isParent;  
	}  
	public void setIsParent(String isParent) {  
	    this.isParent = isParent;  
	}  
	public String getFile() {  
	    return file;  
	}  
	public void setFile(String file) {  
	    this.file = file;  
	}  
  
}  
