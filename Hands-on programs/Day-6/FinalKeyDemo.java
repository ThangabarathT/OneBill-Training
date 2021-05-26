package com.onebill.corejava.basics;

class ErrMsg {
	/** Define the final variables */
	final int OUTERR = 0;
	final int INERR = 1;
	final int DISKERR = 2;
	final int INDEXERR = 3;
	/* Create string array */
	String[] errMsg = { "Output Error", "Input Error", "Disk Error", "Index Error" };

	String errMethod(int i) {
		if (i >= 0 & i < errMsg.length) {
			return errMsg[i];
		} else {
			return ("Invalid code");
		}
	}
}

public class FinalKeyDemo {

	public static void main(String[] args) {
		ErrMsg err = new ErrMsg();
		System.out.println(err.errMethod(err.DISKERR));
	}

}
