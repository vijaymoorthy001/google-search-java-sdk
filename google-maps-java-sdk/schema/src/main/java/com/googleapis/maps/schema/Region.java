/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.googleapis.maps.schema;

import java.util.HashMap;
import java.util.Map;


/**
 * The Enum CCTLD.
 */
public enum Region implements ValueEnum  {
	
	AscensionIsland("ac"),
	Andorra("ad"),
	UnitedArabEmirates("ae"),
	Afghanistan("af"),
	AntiguaAndBarbuda("ag"),
	Anguilla("ai"),
	Albania("al"),
	Armenia("am"),
	NetherlandsAntilles("an"),
	Angola("ao"),
	Antarctica("aq"),
	Argentina("ar"),
	AmericanSamoa("as"),
	Austria("at"),
	Australia("au"),
	Aruba("aw"),
	Åland("ax"),
	Azerbaijan("az"),
	BosniaAndHerzegovina("ba"),
	Barbados("bb"),
	Bangladesh("bd"),
	Belgium("be"),
	BurkinaFaso("bf"),
	Bulgaria("bg"),
	Bahrain("bh"),
	Burundi("bi"),
	Benin("bj"),
	Bermuda("bm"),
	BruneiDarussalam("bn"),
	Bolivia("bo"),
	Brazil("br"),
	Bahamas("bs"),
	Bhutan("bt"),
	BouvetIsland("bv"),
	Botswana("bw"),
	Belarus("by"),
	Belize("bz"),
	Canada("ca"),
	CocosIslands("cc"),
	DemocraticRepublicOfCongo("cd"),
	CentralAfricanRepublic("cf"),
	RepublicOfCongo("cg"),
	Switzerland("ch"),
	CôteDIvoire("ci"),
	CookIslands("ck"),
	Chile("cl"),
	Cameroon("cm"),
	PeoplesRepublicOfChina("cn"),
	Colombia("co"),
	CostaRica("cr"),
	Cuba("cu"),
	CapeVerde("cv"),
	ChristmasIsland("cx"),
	Cyprus("cy"),
	CzechRepublic("cz"),
	Germany("de"),
	Djibouti("dj"),
	Denmark("dk"),
	Dominica("dm"),
	DominicanRepublic("do"),
	Algeria("dz"),
	Ecuador("ec"),
	Estonia("ee"),
	Egypt("eg"),
	Eritrea("er"),
	Spain("es"),
	Ethiopia("et"),
	EuropeanUnion("eu"),
	Finland("fi"),
	Fiji("fj"),
	FalklandIslands("fk"),
	FederatedStatesOfMicronesia("fm"),
	FaroeIslands("fo"),
	France("fr"),
	Gabon("ga"),
	Grenada("gd"),
	Georgia("ge"),
	FrenchGuiana("gf"),
	Guernsey("gg"),
	Ghana("gh"),
	Gibraltar("gi"),
	Greenland("gl"),
	TheGambia("gm"),
	Guinea("gn"),
	Guadeloupe("gp"),
	EquatorialGuinea("gq"),
	Greece("gr"),
	SouthGeorgia("gs"),
	Guatemala("gt"),
	Guam("gu"),
	GuineaBissau("gw"),
	Guyana("gy"),
	HongKong("hk"),
	HeardIsland("hm"),
	Honduras("hn"),
	Croatia("hr"),
	Haiti("ht"),
	Hungary("hu"),
	Indonesia("id"),
	RepublicOfIreland("ie"),
	Israel("il"),
	IsleOfMan("im"),
	India("in"),
	BritishIndianOceanTerritory("io"),
	Iraq("iq"),
	Iran("ir"),
	Iceland("is"),
	Italy("it"),
	Jersey("je"),
	Jamaica("jm"),
	Jordan("jo"),
	Japan("jp"),
	Kenya("ke"),
	Kyrgyzstan("kg"),
	Cambodia("kh"),
	Kiribati("ki"),
	Comoros("km"),
	SaintKittsAndNevis("kn"),
	DemocraticPeoplesRepublicOfKorea("kp"),
	RepublicOfKorea("kr"),
	Kuwait("kw"),
	CaymanIslands("ky"),
	Kazakhstan("kz"),
	Laos("la"),
	Lebanon("lb"),
	SaintLucia("lc"),
	Liechtenstein("li"),
	SriLanka("lk"),
	Liberia("lr"),
	Lesotho("ls"),
	Lithuania("lt"),
	Luxembourg("lu"),
	Latvia("lv"),
	Libya("ly"),
	Morocco("ma"),
	Monaco("mc"),
	Moldova("md"),
	Montenegro("me"),
	Madagascar("mg"),
	MarshallIslands("mh"),
	RepublicOfMacedonia("mk"),
	Mali("ml"),
	Myanmar("mm"),
	Mongolia("mn"),
	Macau("mo"),
	NorthernMarianaIslands("mp"),
	Martinique("mq"),
	Mauritania("mr"),
	Montserrat("ms"),
	Malta("mt"),
	Mauritius("mu"),
	Maldives("mv"),
	Malawi("mw"),
	Mexico("mx"),
	Malaysia("my"),
	Mozambique("mz"),
	Namibia("na"),
	NewCaledonia("nc"),
	Niger("ne"),
	NorfolkIsland("nf"),
	Nigeria("ng"),
	Nicaragua("ni"),
	Netherlands("nl"),
	Norway("no"),
	Nepal("np"),
	Nauru("nr"),
	Niue("nu"),
	NewZealand("nz"),
	Oman("om"),
	Panama("pa"),
	Peru("pe"),
	FrenchPolynesia("pf"),
	PapuaNewGuinea("pg"),
	Philippines("ph"),
	Pakistan("pk"),
	Poland("pl"),
	SaintPierreAndMiquelon("pm"),
	PitcairnIslands("pn"),
	PuertoRico("pr"),
	Palestine("ps"),
	Portugal("pt"),
	Palau("pw"),
	Paraguay("py"),
	Qatar("qa"),
	Réunion("re"),
	Romania("ro"),
	Serbia("rs"),
	Russia("ru"),
	Rwanda("rw"),
	SaudiArabia("sa"),
	SolomonIslands("sb"),
	Seychelles("sc"),
	Sudan("sd"),
	Sweden("se"),
	Singapore("sg"),
	SaintHelena("sh"),
	Slovenia("si"),
	Svalbard("sj"),
	Slovakia("sk"),
	SierraLeone("sl"),
	SanMarino("sm"),
	Senegal("sn"),
	Somalia("so"),
	Suriname("sr"),
	SãoToméAndPríncipe("st"),
	ElSalvador("sv"),
	Syria("sy"),
	Swaziland("sz"),
	TurksAndCaicosIslands("tc"),
	ChadTchad("td"),
	Togo("tg"),
	Thailand("th"),
	Tajikistan("tj"),
	Tokelau("tk"),
	EastTimor("tl"),
	Turkmenistan("tm"),
	Tunisia("tn"),
	Tonga("to"),
	Turkey("tr"),
	TrinidadAndTobago("tt"),
	Tuvalu("tv"),
	Taiwan("tw"),
	Tanzania("tz"),
	Ukraine("ua"),
	Uganda("ug"),
	UnitedKingdom("uk"),
	UnitedStatesOfAmerica("us"),
	Uruguay("uy"),
	Uzbekistan("uz"),
	VaticanCity("va"),
	SaintVincent("vc"),
	Venezuela("ve"),
	BritishVirginIslands("vg"),
	USVirginIslands("vi"),
	Vietnam("vn"),
	Vanuatu("vu"),
	WallisAndFutuna("wf"),
	Samoa("ws"),
	Yemen("ye"),
	Mayotte("yt"),
	SouthAfrica("za"),
	Zambia("zm"),
	Zimbabwe("zw");
	
    /** The Constant stringToEnum. */
	private static final Map<String, Region> stringToEnum = new HashMap<String, Region>();

	static { // Initialize map from constant name to enum constant
		for (Region op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new cCTLD.
     * 
     * @param value the value
     */
    Region(String value) {
        this.value = value;
    }

	/* (non-Javadoc)
	 * @see com.googleapis.maps.schema.ValueEnum#value()
	 */
	@Override
	public String value() {
		return value;
	}
	
	/**
	 * From value.
	 * 
	 * @param value the value
	 * 
	 * @return the cCTLD
	 */
	public static Region fromValue(String value) {
		return stringToEnum.get(value);
	}

}
