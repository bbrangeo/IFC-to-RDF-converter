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

public class IfcDraughtingCalloutRelationship extends Thing 
{
	// The property attributes
	private IfcLabel Name_of_IfcDraughtingCalloutRelationship;
	private IfcText Description_of_IfcDraughtingCalloutRelationship;
	private IfcDraughtingCallout RelatingDraughtingCallout;
	private IfcDraughtingCallout RelatedDraughtingCallout;


	// Getters and setters of properties
	public IfcLabel getName_of_IfcDraughtingCalloutRelationship() {
		return Name_of_IfcDraughtingCalloutRelationship;
	}

	public void setName_of_IfcDraughtingCalloutRelationship(IfcLabel value){
		this.Name_of_IfcDraughtingCalloutRelationship=value;
	}

	public IfcText getDescription_of_IfcDraughtingCalloutRelationship() {
		return Description_of_IfcDraughtingCalloutRelationship;
	}

	public void setDescription_of_IfcDraughtingCalloutRelationship(IfcText value){
		this.Description_of_IfcDraughtingCalloutRelationship=value;
	}

	public IfcDraughtingCallout getRelatingDraughtingCallout() {
		return RelatingDraughtingCallout;
	}

	public void setRelatingDraughtingCallout(IfcDraughtingCallout value){
		this.RelatingDraughtingCallout=value;
	}

	public IfcDraughtingCallout getRelatedDraughtingCallout() {
		return RelatedDraughtingCallout;
	}

	public void setRelatedDraughtingCallout(IfcDraughtingCallout value){
		this.RelatedDraughtingCallout=value;
	}

}
