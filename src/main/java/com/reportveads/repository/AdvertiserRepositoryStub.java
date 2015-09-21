package com.reportveads.repository;

import java.util.ArrayList;
import java.util.List;

import com.reportveads.model.Advertisers;

public class AdvertiserRepositoryStub implements AdvertiserRepository {
	
	public List<Advertisers> findAllAdvertiser(){
		List<Advertisers> advertisers = new ArrayList<Advertisers>();
	
		Advertisers advertiser1 = new Advertisers(); 
		advertiser1.setAdvertiser_id("20144");
		advertiser1.setAppnexus_seat("209");
		advertiser1.setAffiliate_network_id("50");
		advertiser1.setVeinteractive_id("101010");
		advertiser1.setMerchant_guid("010");
		advertiser1.setCms_username("veinter");
		advertiser1.setName("Doro");
		advertiser1.setAccount_manager_name("Bobby Johnson");
		advertiser1.setAccount_manager_email("boobyjohnson@hotmail.com");
		advertiser1.setSector_id("4");
		advertiser1.setCountry_id("3");
		advertiser1.setCurrency_id("3");
		advertiser1.setState("active");
		advertiser1.setDate_added("2015-07-09 10:06:30");
		advertiser1.setLast_updated("2015-07-09 10:07:30");
		advertiser1.setApproval_rate_override("99");
		advertiser1.setAdvertisers_cache__cache_id("01");
		advertiser1.setAdvertisers_cache__advertiser_id("02");
		advertiser1.setAdvertisers_cache__start_date("2015-06-10");
		advertiser1.setAdvertisers_cache__end_date("2015-07-10");
		advertiser1.setAdvertisers_cache__date_type("");
		advertiser1.setAdvertisers_cache__impressions("45");
		advertiser1.setAdvertisers_cache__impressions_delta("2555");
		advertiser1.setAdvertisers_cache__clicks("6045");
		advertiser1.setAdvertisers_cache__clicks_delta("30");
		advertiser1.setAdvertisers_cache__ctr_percent("74");
		advertiser1.setAdvertisers_cache__ctr_percent_delta("52");
		advertiser1.setAdvertisers_cache__conversions("4552");
		advertiser1.setAdvertisers_cache__conversions_delta("14");
		advertiser1.setAdvertisers_cache__appnexus_commission("45");
		advertiser1.setAdvertisers_cache__appnexus_commission_delta("14");
		advertiser1.setAdvertisers_cache__sales_revenue("789");
		advertiser1.setAdvertisers_cache__sales_revenue_delta("52");
		advertiser1.setAdvertisers_cache__cost("785");
		advertiser1.setAdvertisers_cache__cost_delta("25");
		advertiser1.setAdvertisers_cache__profit("1000");
		advertiser1.setAdvertisers_cache__profit_delta("25");
		advertiser1.setAdvertisers_cache__profit_percent("86");
		advertiser1.setAdvertisers_cache__profit_percent_delta("22");
		advertiser1.setAdvertisers_cache__affiliate_conversions("12");
		advertiser1.setAdvertisers_cache__affiliate_conversions_delta("77");
		advertiser1.setAdvertisers_cache__affiliate_sales("11");
		advertiser1.setAdvertisers_cache__affiliate_sales_delta("71");
		advertiser1.setAdvertisers_cache__affiliate_commission("21");
		advertiser1.setAdvertisers_cache__affiliate_commission_delta("27");
		advertiser1.setAdvertisers_cache__approval_rate("77");
		advertiser1.setAdvertisers_cache__approval_rate_delta("71");
		advertiser1.setAdvertisers_cache__adjusted_affiliate_commission("89");
		advertiser1.setAdvertisers_cache__adjusted_affiliate_commission_delta("56");
		advertiser1.setAdvertisers_cache__adjusted_profit("28");
		advertiser1.setAdvertisers_cache__adjusted_profit_delta("96");
		advertiser1.setAffiliates__name("Affiliate Window");
		advertiser1.setAffiliates__url("wwww");
		advertiser1.setAffiliates__service_type("Retail");
		advertiser1.setCurrencies__code("USD");
		advertiser1.setCurrencies__name("Dollars");
		advertiser1.setCountries__code("US");
		advertiser1.setCountries__name("United Kingdom");
		advertiser1.setSectors__name("Travel");
		
		advertisers.add(advertiser1);
		
		return advertisers; 
	}

}
