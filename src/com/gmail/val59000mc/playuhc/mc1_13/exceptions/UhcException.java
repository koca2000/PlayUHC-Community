package com.gmail.val59000mc.playuhc.mc1_13.exceptions;

import com.gmail.val59000mc.playuhc.mc1_13.languages.Lang;

public class UhcException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5868977668183366492L;

	
	public UhcException(String message){
		super(Lang.DISPLAY_MESSAGE_PREFIX+" "+message);
	}
}
