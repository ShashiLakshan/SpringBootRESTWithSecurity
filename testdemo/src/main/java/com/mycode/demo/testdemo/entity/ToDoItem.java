package com.mycode.demo.testdemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;


@Entity
@Table(name = "todoitem")
public class ToDoItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "to_id")
	private Long toId;
	
	@Column(name = "name")
	private String itemName;
	
	@Column(name = "description")
	private String itemDescription;
	
	@Column(name = "date_time")
	private Date dataTimeStamp;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "category")
	private String category;
	
	@ManyToOne
	private User user;
	
	public ToDoItem() {
		
	}

	public ToDoItem(String itemName, String itemDescription, Date dataTimeStamp, String status, String category,
			User user) {
		super();
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.dataTimeStamp = dataTimeStamp;
		this.status = status;
		this.category = category;
		this.user = user;
	}


	public Long getToId() {
		return toId;
	}

	public void setToId(Long toId) {
		this.toId = toId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public Date getDataTimeStamp() {
		return dataTimeStamp;
	}

	public void setDataTimeStamp(Date dataTimeStamp) {
		this.dataTimeStamp = dataTimeStamp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "ToDoItem [toId=" + toId + ", itemName=" + itemName + ", itemDescription=" + itemDescription
				+ ", dataTimeStamp=" + dataTimeStamp + ", status=" + status + ", category=" + category + "]";
	}

}
