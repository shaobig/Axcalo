package com.shaobig.languages.shizproject.services.core.logic.dictionary.language;

import com.shaobig.languages.shizproject.services.core.logic.dictionary.Language;

//INSPIRED BY THE ENGLISH ALPHABET
public class EsdopeLanguage implements Language {
	
	private static final int MORA_COUNT = 240;
	
	@Override
	public String getMora(int index) {
		switch (index) {
			//A
			case 0: return "AB";
			case 1: return "AC";
			case 2: return "AD";
			case 3: return "AF";
			case 4: return "AG";
			case 5: return "AH";
			case 6: return "AJ";
			case 7: return "AK";
			case 8: return "AL";
			case 9: return "AM";
			case 10: return "AN";
			case 11: return "AP";
			case 12: return "AQ";
			case 13: return "AR";
			case 14: return "AS";
			case 15: return "AT";
			case 16: return "AV";
			case 17: return "AW";
			case 18: return "AX";
			case 19: return "AZ";
			//B
			case 20: return "BA";
			case 21: return "BE";
			case 22: return "BI";
			case 23: return "BO";
			case 24: return "BU";
			case 25: return "BY";
			//C
			case 26: return "CA";
			case 27: return "CE";
			case 28: return "CI";
			case 29: return "CO";
			case 30: return "CU";
			case 31: return "CY";
			//D
			case 32: return "DA";
			case 33: return "DE";
			case 34: return "DI";
			case 35: return "DO";
			case 36: return "DU";
			case 37: return "DY";
			//E
			case 38: return "EB";
			case 39: return "EC";
			case 40: return "ED";
			case 41: return "EF";
			case 42: return "EG";
			case 43: return "EH";
			case 44: return "EJ";
			case 45: return "EK";
			case 46: return "EL";
			case 47: return "EM";
			case 48: return "EN";
			case 49: return "EP";
			case 50: return "EQ";
			case 51: return "ER";
			case 52: return "ES";
			case 53: return "ET";
			case 54: return "EV";
			case 55: return "EW";
			case 56: return "EX";
			case 57: return "EZ";
			//F
			case 58: return "FA";
			case 59: return "FE";
			case 60: return "FI";
			case 61: return "FO";
			case 62: return "FU";
			case 63: return "FY";
			//G
			case 64: return "GA";
			case 65: return "GE";
			case 66: return "GI";
			case 67: return "GO";
			case 68: return "GU";
			case 69: return "GY";
			//H
			case 70: return "HA";
			case 71: return "HE";
			case 72: return "HI";
			case 73: return "HO";
			case 74: return "HU";
			case 75: return "HY";
			//I
			case 76: return "IB";
			case 77: return "IC";
			case 78: return "ID";
			case 79: return "IF";
			case 80: return "IG";
			case 81: return "IH";
			case 82: return "IJ";
			case 83: return "IK";
			case 84: return "IL";
			case 85: return "IM";
			case 86: return "IN";
			case 87: return "IP";
			case 88: return "IQ";
			case 89: return "IR";
			case 90: return "IS";
			case 91: return "IT";
			case 92: return "IV";
			case 93: return "IW";
			case 94: return "IX";
			case 95: return "IZ";
			//J
			case 96: return "JA";
			case 97: return "JE";
			case 98: return "JI";
			case 99: return "JO";
			case 100: return "JU";
			case 101: return "JY";
			//K
			case 102: return "KA";
			case 103: return "KE";
			case 104: return "KI";
			case 105: return "KO";
			case 106: return "KU";
			case 107: return "KY";
			//L
			case 108: return "LA";
			case 109: return "LE";
			case 110: return "LI";
			case 111: return "LO";
			case 112: return "LU";
			case 113: return "LY";
			//M
			case 114: return "MA";
			case 115: return "ME";
			case 116: return "MI";
			case 117: return "MO";
			case 118: return "MU";
			case 119: return "MY";
			//N
			case 120: return "NA";
			case 121: return "NE";
			case 122: return "NI";
			case 123: return "NO";
			case 124: return "NU";
			case 125: return "NY";
			//O
			case 126: return "OB";
			case 127: return "OC";
			case 128: return "OD";
			case 129: return "OF";
			case 130: return "OG";
			case 131: return "OH";
			case 132: return "OJ";
			case 133: return "OK";
			case 134: return "OL";
			case 135: return "OM";
			case 136: return "ON";
			case 137: return "OP";
			case 138: return "OQ";
			case 139: return "OR";
			case 140: return "OS";
			case 141: return "OT";
			case 142: return "OV";
			case 143: return "OW";
			case 144: return "OX";
			case 145: return "OZ";
			//P
			case 146: return "PA";
			case 147: return "PE";
			case 148: return "PI";
			case 149: return "PO";
			case 150: return "PU";
			case 151: return "PY";
			//Q
			case 152: return "QA";
			case 153: return "QE";
			case 154: return "QI";
			case 155: return "QO";
			case 156: return "QU";
			case 157: return "QY";
			//R
			case 158: return "RA";
			case 159: return "RE";
			case 160: return "RI";
			case 161: return "RO";
			case 162: return "RU";
			case 163: return "RY";
			//S
			case 164: return "SA";
			case 165: return "SE";
			case 166: return "SI";
			case 167: return "SO";
			case 168: return "SU";
			case 169: return "SY";
			//T
			case 170: return "TA";
			case 171: return "TE";
			case 172: return "TI";
			case 173: return "TO";
			case 174: return "TU";
			case 175: return "TY";
			//U
			case 176: return "UB";
			case 177: return "UC";
			case 178: return "UD";
			case 179: return "UF";
			case 180: return "UG";
			case 181: return "UH";
			case 182: return "UJ";
			case 183: return "UK";
			case 184: return "UL";
			case 185: return "UM";
			case 186: return "UN";
			case 187: return "UP";
			case 188: return "UQ";
			case 189: return "UR";
			case 190: return "US";
			case 191: return "UT";
			case 192: return "UV";
			case 193: return "UW";
			case 194: return "UX";
			case 195: return "UZ";
			//V
			case 196: return "VA";
			case 197: return "VE";
			case 198: return "VI";
			case 199: return "VO";
			case 200: return "VU";
			case 201: return "VY";
			//W
			case 202: return "WA";
			case 203: return "WE";
			case 204: return "WI";
			case 205: return "WO";
			case 206: return "WU";
			case 207: return "WY";
			//X
			case 208: return "XA";
			case 209: return "XE";
			case 210: return "XI";
			case 211: return "XO";
			case 212: return "XU";
			case 213: return "XY";
			//Y
			case 214: return "YB";
			case 215: return "YC";
			case 216: return "YD";
			case 217: return "YF";
			case 218: return "YG";
			case 219: return "YH";
			case 220: return "YJ";
			case 221: return "YK";
			case 222: return "YL";
			case 223: return "YM";
			case 224: return "YN";
			case 225: return "YP";
			case 226: return "YQ";
			case 227: return "YR";
			case 228: return "YS";
			case 229: return "YT";
			case 230: return "YV";
			case 231: return "YW";
			case 232: return "YX";
			case 233: return "YZ";
			//Z
			case 234: return "ZA";
			case 235: return "ZE";
			case 236: return "ZI";
			case 237: return "ZO";
			case 238: return "ZU";
			case 239: return "ZY";
			default: return "";
		}
	}

	@Override
	public int getMoraCount() {
		return MORA_COUNT;
	}

}
