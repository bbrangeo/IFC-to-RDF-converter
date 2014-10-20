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

public class IfcMetric extends IfcConstraint 
{
	// The property attributes
	private IfcBenchmarkEnum Benchmark;
	private IfcLabel ValueSource;
	private IfcMetricValueSelect DataValue;
	private IfcReference ReferencePath_of_IfcMetric;


	// Getters and setters of properties
	public IfcBenchmarkEnum getBenchmark() {
		return Benchmark;
	}

	public void setBenchmark(IfcBenchmarkEnum value){
		this.Benchmark=value;
	}

	public IfcLabel getValueSource() {
		return ValueSource;
	}

	public void setValueSource(IfcLabel value){
		this.ValueSource=value;
	}

	public IfcMetricValueSelect getDataValue() {
		return DataValue;
	}

	public void setDataValue(IfcMetricValueSelect value){
		this.DataValue=value;
	}

	public IfcReference getReferencePath_of_IfcMetric() {
		return ReferencePath_of_IfcMetric;
	}

	public void setReferencePath_of_IfcMetric(IfcReference value){
		this.ReferencePath_of_IfcMetric=value;
	}

}
