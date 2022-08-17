package com.demo.onetomanybi_dir_mapp;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="Laptop")
public class Laptop {
	
	@Id
	@Column(name="Lap_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lid;
	
	@Column(name="Laptop_Name")
	private String lname;
	
	@Column(name="Laptop_Price")
	private int price;
	
	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "RollNum")
	private Student std;

	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", price=" + price + ", std=" + std + "]";
	}

}
