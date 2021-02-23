package com.shaobig.languages.shizproject.services.core.logic.dictionary.language;

import com.shaobig.languages.shizproject.services.core.logic.dictionary.Language;

//INSPIRED BY THE GREEK ALPHABET
public class OthxiakLanguage implements Language {
	
	private static final int MORA_COUNT = 215;
	
	@Override
	public String getMora(int index) {
		switch (index) {
			//A
			case 0: return "AB";
			case 1: return "AG";
			case 2: return "AD";
			case 3: return "AZ";
			case 4: return "ATH";
			case 5: return "AK";
			case 6: return "AL";
			case 7: return "AM";
			case 8: return "AN";
			case 9: return "AX";
			case 10: return "AP";
			case 11: return "AS";
			case 12: return "AT";
			case 13: return "AF";
			case 14: return "ACH";
			case 15: return "APS";
			//B
			case 16: return "BA";
			case 17: return "BE";
			case 18: return "BE'";
			case 19: return "BI";
			case 20: return "BO";
			case 21: return "BU";
			case 22: return "BO'";
			//G
			case 23: return "GA";
			case 24: return "GE";
			case 25: return "GE'";
			case 26: return "GI";
			case 27: return "GO";
			case 28: return "GU";
			case 29: return "GO'";
			//D
			case 30: return "DA";
			case 31: return "DE";
			case 32: return "DE'";
			case 33: return "DI";
			case 34: return "DO";
			case 35: return "DU";
			case 36: return "DO'";
			//E
			case 37: return "EB";
			case 38: return "EG";
			case 39: return "ED";
			case 40: return "EZ";
			case 41: return "ETH";
			case 42: return "EK";
			case 43: return "EL";
			case 44: return "EM";
			case 45: return "EN";
			case 46: return "EX";
			case 47: return "EP";
			case 48: return "ES";
			case 49: return "ET";
			case 50: return "EF";
			case 51: return "ECH";
			case 52: return "EPS";
			//Z
			case 53: return "ZA";
			case 54: return "ZE";
			case 55: return "ZE'";
			case 56: return "ZI";
			case 57: return "ZO";
			case 58: return "ZU";
			case 59: return "ZO'";
			//E'
			case 60: return "E'B";
			case 61: return "E'G";
			case 62: return "E'D";
			case 63: return "E'Z";
			case 64: return "E'TH";
			case 65: return "E'K";
			case 66: return "E'L";
			case 67: return "E'M";
			case 68: return "E'N";
			case 69: return "E'X";
			case 70: return "E'P";
			case 71: return "E'S";
			case 72: return "E'T";
			case 73: return "E'F";
			case 74: return "E'CH";
			case 75: return "E'PS";
			//TH
			case 76: return "THA";
			case 77: return "THE";
			case 78: return "THE'";
			case 79: return "THI";
			case 80: return "THO";
			case 81: return "THU";
			case 82: return "THO'";
			//I
			case 83: return "IB";
			case 84: return "IG";
			case 85: return "ID";
			case 86: return "IZ";
			case 87: return "ITH";
			case 88: return "IK";
			case 89: return "IL";
			case 90: return "IM";
			case 91: return "IN";
			case 92: return "IX";
			case 93: return "IP";
			case 94: return "IS";
			case 95: return "IT";
			case 96: return "IF";
			case 97: return "ICH";
			case 98: return "IPS";
			//K
			case 99: return "KA";
			case 100: return "KE";
			case 101: return "KE'";
			case 102: return "KI";
			case 103: return "KO";
			case 104: return "KU";
			case 105: return "KO'";
			//L
			case 106: return "LA";
			case 107: return "LE";
			case 108: return "LE'";
			case 109: return "LI";
			case 110: return "LO";
			case 111: return "LU";
			case 112: return "LO'";
			//M
			case 113: return "MA";
			case 114: return "ME";
			case 115: return "ME'";
			case 116: return "MI";
			case 117: return "MO";
			case 118: return "MU";
			case 119: return "MO'";
			//N
			case 120: return "NA";
			case 121: return "NE";
			case 122: return "NE'";
			case 123: return "NI";
			case 124: return "NO";
			case 125: return "NU";
			case 126: return "NO'";
			//X
			case 127: return "XA";
			case 128: return "XE";
			case 129: return "XE'";
			case 130: return "XI";
			case 131: return "XO";
			case 132: return "XU";
			case 133: return "XO'";
			//O
			case 134: return "OB";
			case 135: return "OG";
			case 136: return "OD";
			case 137: return "OZ";
			case 138: return "OTH";
			case 139: return "OK";
			case 140: return "OL";
			case 141: return "OM";
			case 142: return "ON";
			case 143: return "OX";
			case 144: return "OP";
			case 145: return "OS";
			case 146: return "OT";
			case 147: return "OF";
			case 148: return "OCH";
			case 149: return "OPS";
			//P
			case 150: return "PA";
			case 151: return "PE";
			case 152: return "PE'";
			case 153: return "PI";
			case 154: return "PO";
			case 155: return "PU";
			case 156: return "PO'";
			//R
			case 157: return "RA";
			case 158: return "RE";
			case 159: return "RE'";
			case 160: return "RI";
			case 161: return "RO";
			case 162: return "RU";
			case 163: return "RO'";
			//S
			case 164: return "SA";
			case 165: return "SE";
			case 166: return "SE'";
			case 167: return "SI";
			case 168: return "SO";
			case 169: return "SU";
			case 170: return "SO'";
			//T
			case 171: return "TA";
			case 172: return "TE";
			case 173: return "TE'";
			case 174: return "TI";
			case 175: return "TO";
			case 176: return "TU";
			case 177: return "TO'";
			//F
			case 178: return "FA";
			case 179: return "FE";
			case 180: return "FE'";
			case 181: return "FI";
			case 182: return "FO";
			case 183: return "FU";
			case 184: return "FO'";
			//CH
			case 185: return "CHA";
			case 186: return "CHE";
			case 187: return "CHE'";
			case 188: return "CHI";
			case 189: return "CHO";
			case 190: return "CHU";
			case 191: return "CHO'";
			//PS
			case 192: return "PSA";
			case 193: return "PSE";
			case 194: return "PSE'";
			case 195: return "PSI";
			case 196: return "PSO";
			case 197: return "PSU";
			case 198: return "PSO'";
			//O'
			case 199: return "O'B";
			case 200: return "O'G";
			case 201: return "O'D";
			case 202: return "O'Z";
			case 203: return "O'TH";
			case 204: return "O'K";
			case 205: return "O'L";
			case 206: return "O'M";
			case 207: return "O'N";
			case 208: return "O'X";
			case 209: return "O'P";
			case 210: return "O'S";
			case 211: return "O'T";
			case 212: return "O'F";
			case 213: return "O'CH";
			case 214: return "O'PS";
			
			default: return "";
		}
	}

	@Override
	public int getMoraCount() {
		return MORA_COUNT;
	}

}
