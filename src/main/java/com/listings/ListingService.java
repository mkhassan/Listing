package com.listings;

import com.listings.Listing;

public interface ListingService {
	
	
	
	Iterable<Listing> listAllListings();


	
	Listing saveListing(Listing listing);
	
    Listing getListingById(Integer id); 
    
    
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	