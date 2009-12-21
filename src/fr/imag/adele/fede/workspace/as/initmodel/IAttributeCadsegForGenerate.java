package fr.imag.adele.fede.workspace.as.initmodel;

import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.var.ContextVariable;

public interface IAttributeCadsegForGenerate {

	public Object getCadseRootAttributeValue(ContextVariable cxt, IAttributeType<?> attType, Item attribute);

	public boolean isCadseRootRequireAttribute(Item attribute);

	public int getCadseRootFlag(Item attribute);
}
