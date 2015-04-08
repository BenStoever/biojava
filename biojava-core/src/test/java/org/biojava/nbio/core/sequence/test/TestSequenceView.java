package org.biojava.nbio.core.sequence.test;


import org.biojava.nbio.core.sequence.compound.NucleotideCompound;
import org.biojava.nbio.core.sequence.template.Compound;
import org.biojava.nbio.core.sequence.template.EditableSequence;
import org.biojava.nbio.core.sequence.template.Sequence;
import org.biojava.nbio.core.sequence.template.SequenceProxyView;
import org.biojava.nbio.core.sequence.template.SequenceView;



public class TestSequenceView<C extends Compound> extends SequenceProxyView<C> {
	public TestSequenceView(Sequence<C> sequence) {
		super(sequence);
		
		if (sequence instanceof EditableSequence<?>) {
			throw new IllegalArgumentException("Editable sequences cannot be viewed using this class.");
		}
	}

}
