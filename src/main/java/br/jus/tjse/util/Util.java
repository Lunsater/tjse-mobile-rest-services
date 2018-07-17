package br.jus.tjse.util;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Util {
	
	    public static String geradorMD5(String arg) throws Exception {
	       MessageDigest m = MessageDigest.getInstance("MD5");
	       m.update(arg.getBytes(),0,arg.length());
	       return new BigInteger(1,m.digest()).toString(16);
	    }	

}
