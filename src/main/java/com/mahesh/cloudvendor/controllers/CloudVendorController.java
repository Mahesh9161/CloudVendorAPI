package com.mahesh.cloudvendor.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahesh.cloudvendor.model.CloudVendor;
import com.mahesh.cloudvendor.service.CloudVendorService;

@RestController
@RequestMapping("/api")
public class CloudVendorController {

	CloudVendorService cloudVendorService;
	
	public CloudVendorController(CloudVendorService cloudVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}
	@GetMapping("{vendorid}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorid")String vendorid) {
		
		return cloudVendorService.getCloudVendor(vendorid);
	
	}	
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails() {
		
		return cloudVendorService.getAllCloudVendors();
	}
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {
		
		cloudVendorService.createCloudVendor(cloudvendor);
		return "Cloud Vendor Created Successfully";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {
		
		cloudVendorService.updateCloudVendor(cloudvendor);
		return " Cloud Vendor Updated Successfully";
	}
	
	@DeleteMapping("{vendorid}")
	public String deleteCloudVendorDetails(@PathVariable("vendorid") String vendorid) {
		
		cloudVendorService.deleteCloudVendor(vendorid);
		return "Cloud Vendor Deleted Successfully";
	}
}

