package com.MiniProject.Models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tToken")
public class Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getKota() {
		return kota;
	}

	public void setKota(String kota) {
		this.kota = kota;
	}

	public String getProvinsi() {
		return provinsi;
	}

	public void setProvinsi(String provinsi) {
		this.provinsi = provinsi;
	}

	public String getTgl_registrasi() {
		return tgl_registrasi;
	}

	public void setTgl_registrasi(String tgl_registrasi) {
		this.tgl_registrasi = tgl_registrasi;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name="name",length=100,nullable=true)
	private String name;
	
	@Column(name="alamat",length=1000,nullable=true)
	private String alamat;
	
	@Column(name="kota",length=10,nullable=true)
	private String kota;
	
	@Column(name="provinsi",length=10,nullable=true)
	private String provinsi;
	
	@Column(name="tgl_registrasi",nullable=true)
	private String tgl_registrasi;
	
	@Column(name="status",length=10 ,nullable=true)
	private String status;
	

}
