package com.mahesh.cloudvendor.service;
import java.util.*;

import org.springframework.stereotype.Service;

import com.mahesh.cloudvendor.exception.CloudVendorNotFoundException;
import com.mahesh.cloudvendor.model.CloudVendor;
import com.mahesh.cloudvendor.repository.CloudVendorRepository;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

	CloudVendorRepository cloudVendorRepository;
	
	
	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudvendor) {
		cloudVendorRepository.save(cloudvendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudvendor) {
		cloudVendorRepository.save(cloudvendor);
		return "Success";
	}

	@Override
	public String deleteCloudVendor(String cloudvendorId) {
		cloudVendorRepository.deleteById(cloudvendorId);
		return "Deleted";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		
		if(cloudVendorRepository.findById(cloudVendorId).isEmpty())
			throw new CloudVendorNotFoundException("Cloud Vendor Does Not Exist");
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		if(cloudVendorRepository.findAll().isEmpty())
			throw new CloudVendorNotFoundException("Cloud Vendor Does Not Exist" );
		return cloudVendorRepository.findAll();
	}

	
}
