package com.reportveads.repository;

import java.util.List;

import com.reportveads.model.Advertisers;

public interface AdvertiserRepository {

	List<Advertisers> findAllAdvertiser();

}