package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {
	public void saveLead(Lead lead);

	public Lead getOneLead(long id);

	public void deleteOneLead(long id);

	public List<Lead> listLeads();

	public Lead findOneLead(long id);
	
}
