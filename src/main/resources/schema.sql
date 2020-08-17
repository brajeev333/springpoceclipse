DROP TABLE IF EXISTS TVVPSKU;
create table TVVPSKU(
	 VV2_PNR			NUMBER(10),
	 VV2_KUNDID		    VARCHAR2(6),
	 VV2_GRUPPID		NUMBER(3),
	 VV2_BER_DAT		NUMBER(8),
	 VV2_BERKOD		CHAR(2),
	 VV2_LKOD			CHAR(1),
	 VV2_MYNDK		VARCHAR2(5),
	 VV2_KATEGORI		CHAR(1),
	 VV2_FORML		NUMBER(3),
	 VV2_FSLAG		VARCHAR2(3),
	 VV2_DEBKOD		NUMBER(2),
	 VV2_FTEKNGR		VARCHAR2(2),
	 VV2_URSPRUNG		VARCHAR2(1),
	 VV2_FROMDATUM	NUMBER(8),
	 VV2_UPPHALDER	NUMBER(3),
	 VV2_UPPHDAT		NUMBER(8),
	 VV2_UPPHKOD		NUMBER,
	 VV2_PA_ANTM		NUMBER(3),
	 VV2_TJTFAKT		NUMBER(6),
	 VV2_UPPRFAKT		NUMBER(6),
	 VV2_BELOPP		NUMBER(7),
	 VV2_ITT			NUMBER(3),
	 VV2_MTT			NUMBER(3),
	 VV2_SCHABLON		VARCHAR2(1),
	 VV2_PUNDERL		NUMBER(7),
	 VV2_PSKULD		NUMBER(7),
	 VV2_PUNDERLAR	NUMBER(4),
	 VV2_KBIDR		VARCHAR2(1),
	 VV2_FELSTS		VARCHAR2(1),
	 VV2_A_PNR		NUMBER(10),
	 VV2_PSKULD_STI	NUMBER(7),
	 VV2_KAPFAKT		NUMBER(9),
	 VV2_RETRO		NUMBER(7),
	 
	 PRIMARY KEY(VV2_PNR,VV2_KUNDID,VV2_GRUPPID,VV2_BER_DAT)
	 
	 
	);
