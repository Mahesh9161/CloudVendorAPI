package com.mahesh.cloudvendor.service;

import java.util.List;

import com.mahesh.cloudvendor.model.CloudVendor;

public interface CloudVendorService {

	public String createCloudVendor(CloudVendor cloudvendor);
	public String updateCloudVendor(CloudVendor cloudvendor);
	public String deleteCloudVendor(String cloudvendorId);
	public CloudVendor getCloudVendor(String cloudVendorId);
	public List<CloudVendor> getAllCloudVendors();
}
