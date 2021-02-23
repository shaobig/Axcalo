package com.shaobig.languages.shizproject.services.core.logic.dictionary.language;

import com.shaobig.languages.shizproject.services.core.logic.dictionary.Language;

//INSPIRED BY THE FREQUENCY STATISTICS OF THE ENGLISH ALPHABET
public class IcezheLanguage implements Language {
	
	private static final int MORA_COUNT = 240;
	
	@Override
	public String getMora(int index) {
		switch (index) {
			//E
			case 0: return "ET";
			case 1: return "EN";
			case 2: return "ES";
			case 3: return "EH";
			case 4: return "ER";
			case 5: return "ED";
			case 6: return "EL";
			case 7: return "EC";
			case 8: return "EM";
			case 9: return "EW";
			case 10: return "EF";
			case 11: return "EG";
			case 12: return "EP";
			case 13: return "EB";
			case 14: return "EV";
			case 15: return "EK";
			case 16: return "EJ";
			case 17: return "EX";
			case 18: return "EQ";
			case 19: return "EZ";
			//T
			case 20: return "TE";
			case 21: return "TA";
			case 22: return "TO";
			case 23: return "TI";
			case 24: return "TU";
			case 25: return "TY";
			//A
			case 26: return "AT";
			case 27: return "AN";
			case 28: return "AS";
			case 29: return "AH";
			case 30: return "AR";
			case 31: return "AD";
			case 32: return "AL";
			case 33: return "AC";
			case 34: return "AM";
			case 35: return "AW";
			case 36: return "AF";
			case 37: return "AG";
			case 38: return "AP";
			case 39: return "AB";
			case 40: return "AV";
			case 41: return "AK";
			case 42: return "AJ";
			case 43: return "AX";
			case 44: return "AQ";
			case 45: return "AZ";
			//O
			case 46: return "OT";
			case 47: return "ON";
			case 48: return "OS";
			case 49: return "OH";
			case 50: return "OR";
			case 51: return "OD";
			case 52: return "OL";
			case 53: return "OC";
			case 54: return "OM";
			case 55: return "OW";
			case 56: return "OF";
			case 57: return "OG";
			case 58: return "OP";
			case 59: return "OB";
			case 60: return "OV";
			case 61: return "OK";
			case 62: return "OJ";
			case 63: return "OX";
			case 64: return "OQ";
			case 65: return "OZ";
			//I
			case 66: return "IT";
			case 67: return "IN";
			case 68: return "IS";
			case 69: return "IH";
			case 70: return "IR";
			case 71: return "ID";
			case 72: return "IL";
			case 73: return "IC";
			case 74: return "IM";
			case 75: return "IW";
			case 76: return "IF";
			case 77: return "IG";
			case 78: return "IP";
			case 79: return "IB";
			case 80: return "IV";
			case 81: return "IK";
			case 82: return "IJ";
			case 83: return "IX";
			case 84: return "IQ";
			case 85: return "IZ";
			//N
			case 86: return "NE";
			case 87: return "NA";
			case 88: return "NO";
			case 89: return "NI";
			case 90: return "NU";
			case 91: return "NY";
			//S
			case 92: return "SE";
			case 93: return "SA";
			case 94: return "SO";
			case 95: return "SI";
			case 96: return "SU";
			case 97: return "SY";
			//H
			case 98: return "HE";
			case 99: return "HA";
			case 100: return "HO";
			case 101: return "HI";
			case 102: return "HU";
			case 103: return "HY";
			//R
			case 104: return "RE";
			case 105: return "RA";
			case 106: return "RO";
			case 107: return "RI";
			case 108: return "RU";
			case 109: return "RY";
			//D
			case 110: return "DE";
			case 111: return "DA";
			case 112: return "DO";
			case 113: return "DI";
			case 114: return "DU";
			case 115: return "DY";
			//L
			case 116: return "LE";
			case 117: return "LA";
			case 118: return "LO";
			case 119: return "LI";
			case 120: return "LU";
			case 121: return "LY";
			//C
			case 122: return "CE";
			case 123: return "CA";
			case 124: return "CO";
			case 125: return "CI";
			case 126: return "CU";
			case 127: return "CY";
			//U
			case 128: return "UT";
			case 129: return "UN";
			case 130: return "US";
			case 131: return "UH";
			case 132: return "UR";
			case 133: return "UD";
			case 134: return "UL";
			case 135: return "UC";
			case 136: return "UM";
			case 137: return "UW";
			case 138: return "UF";
			case 139: return "UG";
			case 140: return "UP";
			case 141: return "UB";
			case 142: return "UV";
			case 143: return "UK";
			case 144: return "UJ";
			case 145: return "UX";
			case 146: return "UQ";
			case 147: return "UZ";
			//M
			case 148: return "ME";
			case 149: return "MA";
			case 150: return "MO";
			case 151: return "MI";
			case 152: return "MU";
			case 153: return "MY";
			//W
			case 154: return "WE";
			case 155: return "WA";
			case 156: return "WO";
			case 157: return "WI";
			case 158: return "WU";
			case 159: return "WY";
			//F
			case 160: return "FE";
			case 161: return "FA";
			case 162: return "FO";
			case 163: return "FI";
			case 164: return "FU";
			case 165: return "FY";
			//G
			case 166: return "GE";
			case 167: return "GA";
			case 168: return "GO";
			case 169: return "GI";
			case 170: return "GU";
			case 171: return "GY";
			//Y
			case 172: return "YT";
			case 173: return "YN";
			case 174: return "YS";
			case 175: return "YH";
			case 176: return "YR";
			case 177: return "YD";
			case 178: return "YL";
			case 179: return "YC";
			case 180: return "YM";
			case 181: return "YW";
			case 182: return "YF";
			case 183: return "YG";
			case 184: return "YP";
			case 185: return "YB";
			case 186: return "YV";
			case 187: return "YK";
			case 188: return "YJ";
			case 189: return "YX";
			case 190: return "YQ";
			case 191: return "YZ";
			//P
			case 192: return "PE";
			case 193: return "PA";
			case 194: return "PO";
			case 195: return "PI";
			case 196: return "PU";
			case 197: return "PY";
			//B
			case 198: return "BE";
			case 199: return "BA";
			case 200: return "BO";
			case 201: return "BI";
			case 202: return "BU";
			case 203: return "BY";
			//V
			case 204: return "VE";
			case 205: return "VA";
			case 206: return "VO";
			case 207: return "VI";
			case 208: return "VU";
			case 209: return "VY";
			//K
			case 210: return "KE";
			case 211: return "KA";
			case 212: return "KO";
			case 213: return "KI";
			case 214: return "KU";
			case 215: return "KY";
			//J
			case 216: return "JE";
			case 217: return "JA";
			case 218: return "JO";
			case 219: return "JI";
			case 220: return "JU";
			case 221: return "JY";
			//X
			case 222: return "XE";
			case 223: return "XA";
			case 224: return "XO";
			case 225: return "XI";
			case 226: return "XU";
			case 227: return "XY";
			//Q
			case 228: return "QE";
			case 229: return "QA";
			case 230: return "QO";
			case 231: return "QI";
			case 232: return "QU";
			case 233: return "QY";
			//Z
			case 234: return "ZE";
			case 235: return "ZA";
			case 236: return "ZO";
			case 237: return "ZI";
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
