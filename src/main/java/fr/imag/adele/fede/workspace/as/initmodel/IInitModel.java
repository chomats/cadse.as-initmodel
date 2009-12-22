/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package fr.imag.adele.fede.workspace.as.initmodel;

import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.CadseRuntime;
import java.util.UUID;
import fr.imag.adele.cadse.core.LogicalWorkspace;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fede.workspace.role.initmodel.ErrorWhenLoadedModel;
import fede.workspace.tool.loadmodel.model.jaxb.CAttType;
import fede.workspace.tool.loadmodel.model.jaxb.CCadse;
import fede.workspace.tool.loadmodel.model.jaxb.CItemType;
import fede.workspace.tool.loadmodel.model.jaxb.CValuesType;

/**
 * 
 */
public interface IInitModel {

	/**
	 * @generated
	 */
	String	AS_ID	= "AS.Workspace.InitModel";

	CadseRuntime[] loadCadses();

	/**
	 * Load cadses.
	 * 
	 * @param cadseName
	 *            the cadse name
	 * 
	 * @return the int
	 * 
	 * @throws ErrorWhenLoadedModel
	 *             the error when loaded model
	 */
	int executeCadses(CadseRuntime... cadseName) throws ErrorWhenLoadedModel;

	

	void save(CCadse test, File file) throws JAXBException, FileNotFoundException;

	CCadse load(File file) throws FileNotFoundException, JAXBException;

	CAttType convertToCAttType(IAttributeType<?> attributeType);

	CAttType convertCadsegToCAttType(Item attributeType);

	IAttributeType<?> convertToAttributeType(CAttType attType, Item parent, String cadseName);

	IAttributeType<?> convertToAttributeType(CValuesType attType);

	CItemType convertToCItemType(ItemType itemType);

	CItemType convertCadsegToCItemType(Item itemType);

	ItemType convertToItemType(CItemType itemType);

	Object convertToCValue(CValuesType value, IAttributeType<?> attDefinition);

	// method to interact with cadse root and cadseg
	public UUID getUUID(String id);

	public int getFlag(CValuesType type);

	public <T> Class<T> loadClass(String cadseName, String qualifiedClassName);

	public int getMin(CValuesType type);

	public int getMax(CValuesType type);

	public IAttributeType<?> createAttrituteType(LogicalWorkspace theWorkspaceLogique, ItemType itemTypeParent,
			CValuesType valuesType, String cadseName) throws CadseException;
}
