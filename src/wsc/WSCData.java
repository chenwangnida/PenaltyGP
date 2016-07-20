package wsc;

import java.util.HashSet;
import java.util.Set;

import ec.gp.*;

/**
 * Represents GPData handed to GPNode reused during excution hand it to one
 * another
 *
 * @author sawczualex
 */

public class WSCData extends GPData {
	private static final long serialVersionUID = 1L;
	// time 0 , cost 1 , available 2, reliability 3
	public double[] qos = { 0, 1, 2, 3 };
	public Set<String> inputs = new HashSet<String>();
	public Set<String> outputs = new HashSet<String>();
	public int totalInputs;
	public int satisfiedInputs;

	public void copyTo(final GPData gpd) {
		WSCData wscd = (WSCData) gpd;
		 wscd.qos = qos;
//		System.arraycopy(qos, 0, ((WSCData) gpd).qos, 0, qos.length);
		wscd.inputs = inputs;
		wscd.outputs = outputs;
		wscd.totalInputs = totalInputs;
		wscd.satisfiedInputs = satisfiedInputs;
	}
	// GPData is a Prototype and so it needs to implement the clone() method as
	// a deep clone.

//	public Object clone() {
//		WSCData other = (WSCData) (super.clone());
//		other.qos = (double[]) (other.clone());
//
//		return other;
//	}

}
