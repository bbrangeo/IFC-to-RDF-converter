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

public class IfcProject extends IfcObject 
{
	// The property attributes
	private IfcLabel LongName_of_IfcProject;
	private IfcLabel Phase;
	private List<IfcRepresentationContext> RepresentationContexts = new ArrayList<IfcRepresentationContext>();
	private IfcUnitAssignment UnitsInContext;


	// Getters and setters of properties
	public IfcLabel getLongName_of_IfcProject() {
		return LongName_of_IfcProject;
	}

	public void setLongName_of_IfcProject(IfcLabel value){
		this.LongName_of_IfcProject=value;
	}

	public IfcLabel getPhase() {
		return Phase;
	}

	public void setPhase(IfcLabel value){
		this.Phase=value;
	}

	public List<IfcRepresentationContext> getRepresentationContexts() {
		return RepresentationContexts;
	}

	public void setRepresentationContexts(IfcRepresentationContext value){
		this.RepresentationContexts.add(value);
	}

	public IfcUnitAssignment getUnitsInContext() {
		return UnitsInContext;
	}

	public void setUnitsInContext(IfcUnitAssignment value){
		this.UnitsInContext=value;
	}

}
