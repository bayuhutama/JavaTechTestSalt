package com.MiniProject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.MiniProject.Repository.Repository;
import com.sun.istack.Nullable;

@Service
@Transactional
public class Services {


	@Autowired
	private Repository r;
	
	public void insertData(String name, String alamat, String kota, String provinsi, String tgl, String status) {
		r.insertData(name, alamat, kota, provinsi, tgl, status);
	}

	public String dataByName(String name) {
		return r.dataByName(name);
	}
	
	public String dataByAlamat(String alamat) {
		return r.dataByAlamat(alamat);
	}
	
	public String dataByKota(String kota) {
		return r.dataByKota(kota);
	}
	
	public String dataByProvinsi(String provinsi) {
		return r.dataByProvinsi(provinsi);
	}
	
	public String dataByTgl(String tgl) {
		return r.dataByTgl(tgl);
	}
	
	public String dataByStatus(String status) {
		return r.dataByStatus(status);
	}
	

}
