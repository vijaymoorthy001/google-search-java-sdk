/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.googleapis.maps.schema;


/**
 * The Class DistanceMatrixResult.
 */
public class DistanceMatrixResult{
   	
	   /** The distance. */
	   private Metric distance;
   	
	   /** The duration. */
	   private Metric duration;
   	
	   /** The status. */
	   private String status;
   	
	   /** The origin address. */
	   private String originAddress;
   	
	   /** The destination address. */
	   private String destinationAddress;

 	/**
	  * Gets the distance.
	  * 
	  * @return the distance
	  */
	 public Metric getDistance(){
		return this.distance;
	}
	
	/**
	 * Sets the distance.
	 * 
	 * @param distance the new distance
	 */
	public void setDistance(Metric distance){
		this.distance = distance;
	}
 	
	 /**
 	 * Gets the duration.
 	 * 
 	 * @return the duration
 	 */
	 public Metric getDuration(){
		return this.duration;
	}
	
	/**
	 * Sets the duration.
	 * 
	 * @param duration the new duration
	 */
	public void setDuration(Metric duration){
		this.duration = duration;
	}
 	
	 /**
 	 * Gets the status.
 	 * 
 	 * @return the status
 	 */
	 public String getStatus(){
		return this.status;
	}
	
	/**
	 * Sets the status.
	 * 
	 * @param status the new status
	 */
	public void setStatus(String status){
		this.status = status;
	}
	
	/**
	 * Gets the origin address.
	 * 
	 * @return the origin address
	 */
	public String getOriginAddress() {
		return originAddress;
	}
	
	/**
	 * Sets the origin address.
	 * 
	 * @param originAddress the new origin address
	 */
	public void setOriginAddress(String originAddress) {
		this.originAddress = originAddress;
	}
	
	/**
	 * Gets the destination address.
	 * 
	 * @return the destination address
	 */
	public String getDestinationAddress() {
		return destinationAddress;
	}
	
	/**
	 * Sets the destination address.
	 * 
	 * @param destinationAddress the new destination address
	 */
	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}
}
