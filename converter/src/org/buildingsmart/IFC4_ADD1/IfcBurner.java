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

public class IfcBurner extends IfcEnergyConversionDevice 
{
	// The property attributes
	private IfcBurnerTypeEnum PredefinedType_of_IfcBurner;


	// Getters and setters of properties
	public IfcBurnerTypeEnum getPredefinedType_of_IfcBurner() {
		return PredefinedType_of_IfcBurner;
	}

	public void setPredefinedType_of_IfcBurner(IfcBurnerTypeEnum value){
		this.PredefinedType_of_IfcBurner=value;
	}

}
