package fr.imag.adele.fede.workspace.as.initmodel;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.var.ContextVariable;
import fr.imag.adele.cadse.core.CadseGCST;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LogicalWorkspace;
import fr.imag.adele.cadse.core.TypeDefinition;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.objectadapter.ObjectAdapter;
import fr.imag.adele.fede.workspace.as.initmodel.jaxb.CValuesType;
import fr.imag.adele.fede.workspace.as.initmodel.jaxb.ObjectFactory;

public abstract class InitModelLoadAndWrite extends ObjectAdapter<InitModelLoadAndWrite> {

	public abstract IAttributeType<?> loadAttributeDefinition(IInitModel initModel,
			LogicalWorkspace theWorkspaceLogique, TypeDefinition parent, CValuesType type, String cadseName)
			throws CadseException;

	public abstract void writeAttributeDefinition(ObjectFactory factory, ContextVariable cxt,
			CValuesType cvt, Item attribute);

	@Override
	public Class<InitModelLoadAndWrite> getClassAdapt() {
		return InitModelLoadAndWrite.class;
	}

	public abstract int getCadseRootFlag(Item attribute);
	
	public Class<?> getTypeJava(boolean primitive) {
		return Object.class;
	}

	public abstract Class<?> getAttributeDefinitionTypeJava();
	
	public ItemType getCadseRootType() {
		return CadseGCST.ATTRIBUTE;
	}
	
	public abstract Object getCadseRootAttributeValue(ContextVariable cxt, IAttributeType<?> attType, Item attribute);

	public abstract boolean isCadseRootRequireAttribute(Item attribute);
}