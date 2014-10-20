package org.buildingsmart.IFC4_ADD1;
import org.buildingsmart.*;
import java.util.*;

/*
 * IFC Java class
/ *
 * The GNU Affero General Public License
 * 
 * Copyright (c) 2014 Jyrki Oraskari (original)
 * Copyright (c) 2014 Pieter Pauwels (modifications - pipauwel.pauwels@ugent.be / pipauwel@gmail.com)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

public class IfcComplexProperty extends IfcProperty 
{
	// The property attributes
	private IfcIdentifier UsageName_of_IfcComplexProperty;
	private List<IfcProperty> HasProperties_of_IfcComplexProperty = new ArrayList<IfcProperty>();


	// Getters and setters of properties
	public IfcIdentifier getUsageName_of_IfcComplexProperty() {
		return UsageName_of_IfcComplexProperty;
	}

	public void setUsageName_of_IfcComplexProperty(IfcIdentifier value){
		this.UsageName_of_IfcComplexProperty=value;
	}

	public List<IfcProperty> getHasProperties_of_IfcComplexProperty() {
		return HasProperties_of_IfcComplexProperty;
	}

	public void setHasProperties_of_IfcComplexProperty(IfcProperty value){
		this.HasProperties_of_IfcComplexProperty.add(value);
	}

}
