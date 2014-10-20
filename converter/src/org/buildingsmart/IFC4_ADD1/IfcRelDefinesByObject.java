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

public class IfcRelDefinesByObject extends IfcRelDefines 
{
	// The property attributes
	private List<IfcObject> RelatedObjects_of_IfcRelDefinesByObject = new ArrayList<IfcObject>();
	private IfcObject RelatingObject_of_IfcRelDefinesByObject;


	// Getters and setters of properties
	public List<IfcObject> getRelatedObjects_of_IfcRelDefinesByObject() {
		return RelatedObjects_of_IfcRelDefinesByObject;
	}

	public void setRelatedObjects_of_IfcRelDefinesByObject(IfcObject value){
		this.RelatedObjects_of_IfcRelDefinesByObject.add(value);
	}

	public IfcObject getRelatingObject_of_IfcRelDefinesByObject() {
		return RelatingObject_of_IfcRelDefinesByObject;
	}

	public void setRelatingObject_of_IfcRelDefinesByObject(IfcObject value){
		this.RelatingObject_of_IfcRelDefinesByObject=value;
	}

}
