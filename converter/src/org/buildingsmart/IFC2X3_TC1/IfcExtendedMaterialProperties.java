package org.buildingsmart.IFC2X3_TC1;
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

public class IfcExtendedMaterialProperties extends IfcMaterialProperties 
{
	// The property attributes
	private List<IfcProperty> ExtendedProperties = new ArrayList<IfcProperty>();
	private IfcText Description_of_IfcExtendedMaterialProperties;
	private IfcLabel Name_of_IfcExtendedMaterialProperties;


	// Getters and setters of properties
	public List<IfcProperty> getExtendedProperties() {
		return ExtendedProperties;
	}

	public void setExtendedProperties(IfcProperty value){
		this.ExtendedProperties.add(value);
	}

	public IfcText getDescription_of_IfcExtendedMaterialProperties() {
		return Description_of_IfcExtendedMaterialProperties;
	}

	public void setDescription_of_IfcExtendedMaterialProperties(IfcText value){
		this.Description_of_IfcExtendedMaterialProperties=value;
	}

	public IfcLabel getName_of_IfcExtendedMaterialProperties() {
		return Name_of_IfcExtendedMaterialProperties;
	}

	public void setName_of_IfcExtendedMaterialProperties(IfcLabel value){
		this.Name_of_IfcExtendedMaterialProperties=value;
	}

}
