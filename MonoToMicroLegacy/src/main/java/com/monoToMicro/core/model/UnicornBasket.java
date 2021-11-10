/**
 * Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.

 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the "Software"), to deal in the Software
 * without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.monoToMicro.core.model;

import java.util.List;

/**
 * 
 * @author nirozeri
 * 
 */
public class UnicornBasket {
	
        // Modifying uuid into userUid for UnicornBasket
	private String userUid = null;		
	private List<Unicorn> unicorns = null;
	
	
	/**
	 * 
	 */
	public UnicornBasket(){
	}
	
	/**  
	 * 
	 * @param uuid
	 */
	public UnicornBasket(String uuid){
		this.userUid = uuid;
	}

	/**
	 * 
	 * @return
	 */
	public String getUserUid() {
		return userUid;
	}

	/**
	 * 
	 * @param uuid
	 */
	public void setUserUid(String uuid) {
		this.userUid = uuid;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Unicorn> getUnicorns() {
		return unicorns;
	}

	/**
	 * 
	 * @param unicorns
	 */
	public void setUnicorns(List<Unicorn> unicorns) {
		this.unicorns = unicorns;
	}
}
