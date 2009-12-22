package fr.imag.adele.fede.workspace.as.initmodel;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.var.ContextVariable;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LogicalWorkspace;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.fede.workspace.as.initmodel.jaxb.CValuesType;
import fr.imag.adele.fede.workspace.as.initmodel.jaxb.ObjectFactory;

public interface InitModelLoadAndWrite {

	public abstract IAttributeType<?> loadAttributeDefinition(IInitModel initModel,
			LogicalWorkspace theWorkspaceLogique, ItemType parent, CValuesType type, String cadseName)
			throws CadseException;

	public abstract void writeAttributeDefinition(ObjectFactory factory, ContextVariable cxt,
			IAttributeCadsegForGenerate cadsegManager, CValuesType cvt, Item attribute);

}