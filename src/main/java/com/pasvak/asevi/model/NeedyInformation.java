package com.pasvak.asevi.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "needy_information")
@SuppressWarnings("serial")
public class NeedyInformation implements Serializable{
	
	@Basic
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Basic
	@Column(name = "TC")
	public String getKimlikNo() {
		return kimlikNo;
	}
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}
	@Basic
	@Column(name = "ADI")
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	@Basic
	@Column(name = "SOYADI")
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	@Basic
	@Column(name = "KISI_SAYISI")
	public int getKisiSayisi() {
		return kisiSayisi;
	}
	public void setKisiSayisi(int kisiSayisi) {
		this.kisiSayisi = kisiSayisi;
	}
	@Basic
	@Column(name = "IKAMET_ADR")
	public String getIkametAdr() {
		return ikametAdr;
	}
	public void setIkametAdr(String ikametAdr) {
		this.ikametAdr = ikametAdr;
	}
	@Basic
	@Column(name = "DAGITIM_ADR")
	public String getDagitimAdr() {
		return dagitimAdr;
	}
	public void setDagitimAdr(String yemekAdr) {
		this.dagitimAdr = yemekAdr;
	}
	private String kimlikNo;
	private String isim;
	private String soyisim;
	private int kisiSayisi;
	private String ikametAdr;
	private String dagitimAdr; //yemekAlacagiLokasyon
	
}
