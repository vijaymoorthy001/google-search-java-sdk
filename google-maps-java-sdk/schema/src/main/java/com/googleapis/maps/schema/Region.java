/*
 * Copyright 2010-2011 Nabeel Mukhtar 
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
 * The Enum Region.
 */
public enum Region implements ValueEnum  {
	
	/** The Ascension island. */
	AscensionIsland("ac"),
	
	/** The Andorra. */
	Andorra("ad"),
	
	/** The United arab emirates. */
	UnitedArabEmirates("ae"),
	
	/** The Afghanistan. */
	Afghanistan("af"),
	
	/** The Antigua and barbuda. */
	AntiguaAndBarbuda("ag"),
	
	/** The Anguilla. */
	Anguilla("ai"),
	
	/** The Albania. */
	Albania("al"),
	
	/** The Armenia. */
	Armenia("am"),
	
	/** The Netherlands antilles. */
	NetherlandsAntilles("an"),
	
	/** The Angola. */
	Angola("ao"),
	
	/** The Antarctica. */
	Antarctica("aq"),
	
	/** The Argentina. */
	Argentina("ar"),
	
	/** The American samoa. */
	AmericanSamoa("as"),
	
	/** The Austria. */
	Austria("at"),
	
	/** The Australia. */
	Australia("au"),
	
	/** The Aruba. */
	Aruba("aw"),
	
	/** The Åland. */
	Åland("ax"),
	
	/** The Azerbaijan. */
	Azerbaijan("az"),
	
	/** The Bosnia and herzegovina. */
	BosniaAndHerzegovina("ba"),
	
	/** The Barbados. */
	Barbados("bb"),
	
	/** The Bangladesh. */
	Bangladesh("bd"),
	
	/** The Belgium. */
	Belgium("be"),
	
	/** The Burkina faso. */
	BurkinaFaso("bf"),
	
	/** The Bulgaria. */
	Bulgaria("bg"),
	
	/** The Bahrain. */
	Bahrain("bh"),
	
	/** The Burundi. */
	Burundi("bi"),
	
	/** The Benin. */
	Benin("bj"),
	
	/** The Bermuda. */
	Bermuda("bm"),
	
	/** The Brunei darussalam. */
	BruneiDarussalam("bn"),
	
	/** The Bolivia. */
	Bolivia("bo"),
	
	/** The Brazil. */
	Brazil("br"),
	
	/** The Bahamas. */
	Bahamas("bs"),
	
	/** The Bhutan. */
	Bhutan("bt"),
	
	/** The Bouvet island. */
	BouvetIsland("bv"),
	
	/** The Botswana. */
	Botswana("bw"),
	
	/** The Belarus. */
	Belarus("by"),
	
	/** The Belize. */
	Belize("bz"),
	
	/** The Canada. */
	Canada("ca"),
	
	/** The Cocos islands. */
	CocosIslands("cc"),
	
	/** The Democratic republic of congo. */
	DemocraticRepublicOfCongo("cd"),
	
	/** The Central african republic. */
	CentralAfricanRepublic("cf"),
	
	/** The Republic of congo. */
	RepublicOfCongo("cg"),
	
	/** The Switzerland. */
	Switzerland("ch"),
	
	/** The Côte d ivoire. */
	CôteDIvoire("ci"),
	
	/** The Cook islands. */
	CookIslands("ck"),
	
	/** The Chile. */
	Chile("cl"),
	
	/** The Cameroon. */
	Cameroon("cm"),
	
	/** The Peoples republic of china. */
	PeoplesRepublicOfChina("cn"),
	
	/** The Colombia. */
	Colombia("co"),
	
	/** The Costa rica. */
	CostaRica("cr"),
	
	/** The Cuba. */
	Cuba("cu"),
	
	/** The Cape verde. */
	CapeVerde("cv"),
	
	/** The Christmas island. */
	ChristmasIsland("cx"),
	
	/** The Cyprus. */
	Cyprus("cy"),
	
	/** The Czech republic. */
	CzechRepublic("cz"),
	
	/** The Germany. */
	Germany("de"),
	
	/** The Djibouti. */
	Djibouti("dj"),
	
	/** The Denmark. */
	Denmark("dk"),
	
	/** The Dominica. */
	Dominica("dm"),
	
	/** The Dominican republic. */
	DominicanRepublic("do"),
	
	/** The Algeria. */
	Algeria("dz"),
	
	/** The Ecuador. */
	Ecuador("ec"),
	
	/** The Estonia. */
	Estonia("ee"),
	
	/** The Egypt. */
	Egypt("eg"),
	
	/** The Eritrea. */
	Eritrea("er"),
	
	/** The Spain. */
	Spain("es"),
	
	/** The Ethiopia. */
	Ethiopia("et"),
	
	/** The European union. */
	EuropeanUnion("eu"),
	
	/** The Finland. */
	Finland("fi"),
	
	/** The Fiji. */
	Fiji("fj"),
	
	/** The Falkland islands. */
	FalklandIslands("fk"),
	
	/** The Federated states of micronesia. */
	FederatedStatesOfMicronesia("fm"),
	
	/** The Faroe islands. */
	FaroeIslands("fo"),
	
	/** The France. */
	France("fr"),
	
	/** The Gabon. */
	Gabon("ga"),
	
	/** The Grenada. */
	Grenada("gd"),
	
	/** The Georgia. */
	Georgia("ge"),
	
	/** The French guiana. */
	FrenchGuiana("gf"),
	
	/** The Guernsey. */
	Guernsey("gg"),
	
	/** The Ghana. */
	Ghana("gh"),
	
	/** The Gibraltar. */
	Gibraltar("gi"),
	
	/** The Greenland. */
	Greenland("gl"),
	
	/** The The gambia. */
	TheGambia("gm"),
	
	/** The Guinea. */
	Guinea("gn"),
	
	/** The Guadeloupe. */
	Guadeloupe("gp"),
	
	/** The Equatorial guinea. */
	EquatorialGuinea("gq"),
	
	/** The Greece. */
	Greece("gr"),
	
	/** The South georgia. */
	SouthGeorgia("gs"),
	
	/** The Guatemala. */
	Guatemala("gt"),
	
	/** The Guam. */
	Guam("gu"),
	
	/** The Guinea bissau. */
	GuineaBissau("gw"),
	
	/** The Guyana. */
	Guyana("gy"),
	
	/** The Hong kong. */
	HongKong("hk"),
	
	/** The Heard island. */
	HeardIsland("hm"),
	
	/** The Honduras. */
	Honduras("hn"),
	
	/** The Croatia. */
	Croatia("hr"),
	
	/** The Haiti. */
	Haiti("ht"),
	
	/** The Hungary. */
	Hungary("hu"),
	
	/** The Indonesia. */
	Indonesia("id"),
	
	/** The Republic of ireland. */
	RepublicOfIreland("ie"),
	
	/** The Israel. */
	Israel("il"),
	
	/** The Isle of man. */
	IsleOfMan("im"),
	
	/** The India. */
	India("in"),
	
	/** The British indian ocean territory. */
	BritishIndianOceanTerritory("io"),
	
	/** The Iraq. */
	Iraq("iq"),
	
	/** The Iran. */
	Iran("ir"),
	
	/** The Iceland. */
	Iceland("is"),
	
	/** The Italy. */
	Italy("it"),
	
	/** The Jersey. */
	Jersey("je"),
	
	/** The Jamaica. */
	Jamaica("jm"),
	
	/** The Jordan. */
	Jordan("jo"),
	
	/** The Japan. */
	Japan("jp"),
	
	/** The Kenya. */
	Kenya("ke"),
	
	/** The Kyrgyzstan. */
	Kyrgyzstan("kg"),
	
	/** The Cambodia. */
	Cambodia("kh"),
	
	/** The Kiribati. */
	Kiribati("ki"),
	
	/** The Comoros. */
	Comoros("km"),
	
	/** The Saint kitts and nevis. */
	SaintKittsAndNevis("kn"),
	
	/** The Democratic peoples republic of korea. */
	DemocraticPeoplesRepublicOfKorea("kp"),
	
	/** The Republic of korea. */
	RepublicOfKorea("kr"),
	
	/** The Kuwait. */
	Kuwait("kw"),
	
	/** The Cayman islands. */
	CaymanIslands("ky"),
	
	/** The Kazakhstan. */
	Kazakhstan("kz"),
	
	/** The Laos. */
	Laos("la"),
	
	/** The Lebanon. */
	Lebanon("lb"),
	
	/** The Saint lucia. */
	SaintLucia("lc"),
	
	/** The Liechtenstein. */
	Liechtenstein("li"),
	
	/** The Sri lanka. */
	SriLanka("lk"),
	
	/** The Liberia. */
	Liberia("lr"),
	
	/** The Lesotho. */
	Lesotho("ls"),
	
	/** The Lithuania. */
	Lithuania("lt"),
	
	/** The Luxembourg. */
	Luxembourg("lu"),
	
	/** The Latvia. */
	Latvia("lv"),
	
	/** The Libya. */
	Libya("ly"),
	
	/** The Morocco. */
	Morocco("ma"),
	
	/** The Monaco. */
	Monaco("mc"),
	
	/** The Moldova. */
	Moldova("md"),
	
	/** The Montenegro. */
	Montenegro("me"),
	
	/** The Madagascar. */
	Madagascar("mg"),
	
	/** The Marshall islands. */
	MarshallIslands("mh"),
	
	/** The Republic of macedonia. */
	RepublicOfMacedonia("mk"),
	
	/** The Mali. */
	Mali("ml"),
	
	/** The Myanmar. */
	Myanmar("mm"),
	
	/** The Mongolia. */
	Mongolia("mn"),
	
	/** The Macau. */
	Macau("mo"),
	
	/** The Northern mariana islands. */
	NorthernMarianaIslands("mp"),
	
	/** The Martinique. */
	Martinique("mq"),
	
	/** The Mauritania. */
	Mauritania("mr"),
	
	/** The Montserrat. */
	Montserrat("ms"),
	
	/** The Malta. */
	Malta("mt"),
	
	/** The Mauritius. */
	Mauritius("mu"),
	
	/** The Maldives. */
	Maldives("mv"),
	
	/** The Malawi. */
	Malawi("mw"),
	
	/** The Mexico. */
	Mexico("mx"),
	
	/** The Malaysia. */
	Malaysia("my"),
	
	/** The Mozambique. */
	Mozambique("mz"),
	
	/** The Namibia. */
	Namibia("na"),
	
	/** The New caledonia. */
	NewCaledonia("nc"),
	
	/** The Niger. */
	Niger("ne"),
	
	/** The Norfolk island. */
	NorfolkIsland("nf"),
	
	/** The Nigeria. */
	Nigeria("ng"),
	
	/** The Nicaragua. */
	Nicaragua("ni"),
	
	/** The Netherlands. */
	Netherlands("nl"),
	
	/** The Norway. */
	Norway("no"),
	
	/** The Nepal. */
	Nepal("np"),
	
	/** The Nauru. */
	Nauru("nr"),
	
	/** The Niue. */
	Niue("nu"),
	
	/** The New zealand. */
	NewZealand("nz"),
	
	/** The Oman. */
	Oman("om"),
	
	/** The Panama. */
	Panama("pa"),
	
	/** The Peru. */
	Peru("pe"),
	
	/** The French polynesia. */
	FrenchPolynesia("pf"),
	
	/** The Papua new guinea. */
	PapuaNewGuinea("pg"),
	
	/** The Philippines. */
	Philippines("ph"),
	
	/** The Pakistan. */
	Pakistan("pk"),
	
	/** The Poland. */
	Poland("pl"),
	
	/** The Saint pierre and miquelon. */
	SaintPierreAndMiquelon("pm"),
	
	/** The Pitcairn islands. */
	PitcairnIslands("pn"),
	
	/** The Puerto rico. */
	PuertoRico("pr"),
	
	/** The Palestine. */
	Palestine("ps"),
	
	/** The Portugal. */
	Portugal("pt"),
	
	/** The Palau. */
	Palau("pw"),
	
	/** The Paraguay. */
	Paraguay("py"),
	
	/** The Qatar. */
	Qatar("qa"),
	
	/** The Réunion. */
	Réunion("re"),
	
	/** The Romania. */
	Romania("ro"),
	
	/** The Serbia. */
	Serbia("rs"),
	
	/** The Russia. */
	Russia("ru"),
	
	/** The Rwanda. */
	Rwanda("rw"),
	
	/** The Saudi arabia. */
	SaudiArabia("sa"),
	
	/** The Solomon islands. */
	SolomonIslands("sb"),
	
	/** The Seychelles. */
	Seychelles("sc"),
	
	/** The Sudan. */
	Sudan("sd"),
	
	/** The Sweden. */
	Sweden("se"),
	
	/** The Singapore. */
	Singapore("sg"),
	
	/** The Saint helena. */
	SaintHelena("sh"),
	
	/** The Slovenia. */
	Slovenia("si"),
	
	/** The Svalbard. */
	Svalbard("sj"),
	
	/** The Slovakia. */
	Slovakia("sk"),
	
	/** The Sierra leone. */
	SierraLeone("sl"),
	
	/** The San marino. */
	SanMarino("sm"),
	
	/** The Senegal. */
	Senegal("sn"),
	
	/** The Somalia. */
	Somalia("so"),
	
	/** The Suriname. */
	Suriname("sr"),
	
	/** The São tomé and príncipe. */
	SãoToméAndPríncipe("st"),
	
	/** The El salvador. */
	ElSalvador("sv"),
	
	/** The Syria. */
	Syria("sy"),
	
	/** The Swaziland. */
	Swaziland("sz"),
	
	/** The Turks and caicos islands. */
	TurksAndCaicosIslands("tc"),
	
	/** The Chad tchad. */
	ChadTchad("td"),
	
	/** The Togo. */
	Togo("tg"),
	
	/** The Thailand. */
	Thailand("th"),
	
	/** The Tajikistan. */
	Tajikistan("tj"),
	
	/** The Tokelau. */
	Tokelau("tk"),
	
	/** The East timor. */
	EastTimor("tl"),
	
	/** The Turkmenistan. */
	Turkmenistan("tm"),
	
	/** The Tunisia. */
	Tunisia("tn"),
	
	/** The Tonga. */
	Tonga("to"),
	
	/** The Turkey. */
	Turkey("tr"),
	
	/** The Trinidad and tobago. */
	TrinidadAndTobago("tt"),
	
	/** The Tuvalu. */
	Tuvalu("tv"),
	
	/** The Taiwan. */
	Taiwan("tw"),
	
	/** The Tanzania. */
	Tanzania("tz"),
	
	/** The Ukraine. */
	Ukraine("ua"),
	
	/** The Uganda. */
	Uganda("ug"),
	
	/** The United kingdom. */
	UnitedKingdom("uk"),
	
	/** The United states of america. */
	UnitedStatesOfAmerica("us"),
	
	/** The Uruguay. */
	Uruguay("uy"),
	
	/** The Uzbekistan. */
	Uzbekistan("uz"),
	
	/** The Vatican city. */
	VaticanCity("va"),
	
	/** The Saint vincent. */
	SaintVincent("vc"),
	
	/** The Venezuela. */
	Venezuela("ve"),
	
	/** The British virgin islands. */
	BritishVirginIslands("vg"),
	
	/** The US virgin islands. */
	USVirginIslands("vi"),
	
	/** The Vietnam. */
	Vietnam("vn"),
	
	/** The Vanuatu. */
	Vanuatu("vu"),
	
	/** The Wallis and futuna. */
	WallisAndFutuna("wf"),
	
	/** The Samoa. */
	Samoa("ws"),
	
	/** The Yemen. */
	Yemen("ye"),
	
	/** The Mayotte. */
	Mayotte("yt"),
	
	/** The South africa. */
	SouthAfrica("za"),
	
	/** The Zambia. */
	Zambia("zm"),
	
	/** The Zimbabwe. */
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
     * Instantiates a new region.
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
	 * @return the region
	 */
	public static Region fromValue(String value) {
		return stringToEnum.get(value);
	}

}
