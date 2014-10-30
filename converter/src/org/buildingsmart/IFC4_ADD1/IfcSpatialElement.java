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

public class IfcSpatialElement extends IfcProduct 
{
	// The property attributes
	private IfcLabel LongName_of_IfcSpatialElement;
	// The inverse attributes
	private List<IfcRelContainedInSpatialStructure> ContainsElements= new ArrayList<IfcRelContainedInSpatialStructure>();
	private List<IfcRelServicesBuildings> ServicedBySystems= new ArrayList<IfcRelServicesBuildings>();
	private List<IfcRelReferencedInSpatialStructure> ReferencesElements= new ArrayList<IfcRelReferencedInSpatialStructure>();


	// Getters and setters of properties
	public IfcLabel getLongName_of_IfcSpatialElement() {
		return LongName_of_IfcSpatialElement;
	}

	public void setLongName_of_IfcSpatialElement(IfcLabel value){
		this.LongName_of_IfcSpatialElement=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelContainedInSpatialStructure> getContainsElements() {
		return ContainsElements;
	}

	public void setContainsElements(IfcRelContainedInSpatialStructure value){
		this.ContainsElements.add(value);
	}

	public List<IfcRelServicesBuildings> getServicedBySystems() {
		return ServicedBySystems;
	}

	public void setServicedBySystems(IfcRelServicesBuildings value){
		this.ServicedBySystems.add(value);
	}

	public List<IfcRelReferencedInSpatialStructure> getReferencesElements() {
		return ReferencesElements;
	}

	public void setReferencesElements(IfcRelReferencedInSpatialStructure value){
		this.ReferencesElements.add(value);
	}

}
