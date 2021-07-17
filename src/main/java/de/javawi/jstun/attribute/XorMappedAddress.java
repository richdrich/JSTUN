/*
 * This file is part of JSTUN. 
 * 
 * Copyright (c) 2005 Thomas King <king@t-king.de> - All rights
 * reserved.
 * 
 * This software is licensed under either the GNU Public License (GPL),
 * or the Apache 2.0 license. Copies of both license agreements are
 * included in this distribution.
 */

package de.javawi.jstun.attribute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XorMappedAddress extends MappedResponseChangedSourceAddressReflectedFrom {
	private static final Logger LOGGER = LoggerFactory.getLogger(XorMappedAddress.class);
	public XorMappedAddress() {
		super(MessageAttributeType.XorMappedAddress);
	}
	
	public static MessageAttribute parse(byte[] data) throws MessageAttributeParsingException {
		XorMappedAddress ma = new XorMappedAddress();
		MappedResponseChangedSourceAddressReflectedFrom.parse(ma, data);
		LOGGER.debug("Message Attribute: Mapped Address (xored) parsed: " + ma.toString() + ".");
		return ma;
	}
}
