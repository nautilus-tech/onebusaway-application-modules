/**
 * Copyright (C) 2015 Cambridge Systematics
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onebusaway.nextbus.model.nextbus;

import java.util.ArrayList;
import java.util.List;

import org.onebusaway.nextbus.impl.conversion.ListToStringConverter;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class Body<T> {
  
  private static final String COPYRIGHT = "All data copyright WMATA Washington 2015"; 
  
	@XStreamImplicit
	private List<T> response = new ArrayList<T>();
	
	@XStreamImplicit
	private List<BodyError> errors;
	
	private LastTime lastTime;
	
	@XStreamAsAttribute 
	private String copyright = COPYRIGHT;

	public List<T> getResponse() {
		return response;
	}

	public void setResponse(List<T> response) {
		this.response = response;
	}
	
	public List<BodyError> getErrors() {
		if(errors == null)
			 errors = new ArrayList<BodyError>();
		return errors;
	}

	public void setErrors(List<BodyError> errors) {
		this.errors = errors;
	}

	public LastTime getLastTime() {
		return lastTime;
	}

	public void setLastTime(LastTime lastTime) {
		this.lastTime = lastTime;
	}

  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }
}
