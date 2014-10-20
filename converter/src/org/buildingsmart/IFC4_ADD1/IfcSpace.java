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

public class IfcSpace extends IfcSpatialStructureElement implements IfcSpaceBoundarySelect
{
	// The property attributes
	private IfcSpaceTypeEnum PredefinedType_of_IfcSpace;
	private IfcLengthMeasure ElevationWithFlooring;
 // The inverse attributes

	private List<IfcRelCoversSpaces> HasCoverings= new ArrayList<IfcRelCoversSpaces>();
	private List<IfcRelSpaceBoundary> BoundedBy= new ArrayList<IfcRelSpaceBoundary>();


	// Getters and setters of properties
	public IfcSpaceTypeEnum getPredefinedType_of_IfcSpace() {
		return PredefinedType_of_IfcSpace;
	}

	public void setPredefinedType_of_IfcSpace(IfcSpaceTypeEnum value){
		this.PredefinedType_of_IfcSpace=value;
	}

	public IfcLengthMeasure getElevationWithFlooring() {
		return ElevationWithFlooring;
	}

	public void setElevationWithFlooring(IfcLengthMeasure value){
		this.ElevationWithFlooring=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelCoversSpaces> getHasCoverings() {
		return HasCoverings;
	}

	public void setHasCoverings(IfcRelCoversSpaces value){
		this.HasCoverings.add(value);
	}

	public List<IfcRelSpaceBoundary> getBoundedBy() {
		return BoundedBy;
	}

	public void setBoundedBy(IfcRelSpaceBoundary value){
		this.BoundedBy.add(value);
	}

}
