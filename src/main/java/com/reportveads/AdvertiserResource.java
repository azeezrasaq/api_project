package com.reportveads;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.reportveads.model.Advertisers;
import com.reportveads.repository.AdvertiserRepository;
import com.reportveads.repository.AdvertiserRepositoryStub;


@Path("clients")
public class AdvertiserResource {

	private AdvertiserRepository  advertiserRepository = new AdvertiserRepositoryStub(); 
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Advertisers> getAllAdvertiser(){
		return advertiserRepository.findAllAdvertiser(); 
		
	}
}
