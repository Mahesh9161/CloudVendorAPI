package com.mahesh.cloudvendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahesh.cloudvendor.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{
	
}
