package org.biojava.nbio.core.sequence.template;



public interface EditableSequence<C extends Compound> extends Sequence<C> {
	public void setCompoundAt(int index, C compount);

	public void insertCompoundAt(int index, C compount);

	public void removeCompoundAt(int index);

	public void insertSequenceAt(int index, Sequence<? extends C> sequence);
	
	public void appendCompound(C compound);

	public void appendSequence(Sequence<? extends C> sequence);
	
	// Additional methods (including listener management) could be added here...
}
