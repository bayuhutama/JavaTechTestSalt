package com.MiniProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.MiniProject.Models.Model;
import com.sun.istack.Nullable;

public interface Repository extends JpaRepository<Model, Long> {
		
		@Modifying
		@Query(value = "INSERT into konsumen (nama, alamat,kota,provinsi,tgl,status) values (?1,?2,?3,?4,?5,?6)", nativeQuery = true)
		void insertData(String name, String alamat, String kota, String provinsi, String tgl, String status);
		
		@Query(value = "select * from konsumen where nama like '%?1%'", nativeQuery = true)
		String dataByName(String nama);
		
		@Query(value = "select * from konsumen where alamat like '%?1%'", nativeQuery = true)
		String dataByAlamat(String alamat);
		
		@Query(value = "select * from konsumen where kota like '%?1%'", nativeQuery = true)
		String dataByKota(String kota);
		
		@Query(value = "select * from konsumen where provinsi like '%?1%'", nativeQuery = true)
		String dataByProvinsi(String provinsi);
		
		@Query(value = "select * from konsumen where tgl like '%?1%'", nativeQuery = true)
		String dataByTgl(String tgl);
		
		@Query(value = "select * from konsumen where status = '%?1%'", nativeQuery = true)
		String dataByStatus(String status);
		
		
}
