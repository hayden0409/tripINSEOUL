package com.tripinseoul.boardService;

public class Pagination {
	
	private static int FROM;
	private static int HOWMANY;
	private static int COUNTPERPAGE = 10;
	private static int TOTALCOUNT;
	private static int CURPAGE;
	private static int TOTALPAGE;
	
	public static int calculateTotalPage(){
		if(TOTALCOUNT % COUNTPERPAGE == 0){
			return TOTALCOUNT / COUNTPERPAGE;
		}else{
			return (TOTALCOUNT / COUNTPERPAGE) + 1;
		}
	}
	public static int calculateFrom() {
		return (CURPAGE-1) * COUNTPERPAGE;
		
	}
	public static int getFROM() {
		return FROM;
	}
	public static void setFROM(int fROM) {
		FROM = fROM;
	}
	public static int getHOWMANY() {
		return HOWMANY;
	}
	public static void setHOWMANY(int hOWMANY) {
		HOWMANY = hOWMANY;
	}
	public static int getCOUNTPERPAGE() {
		return COUNTPERPAGE;
	}
	public static void setCOUNTPERPAGE(int cOUNTPERPAGE) {
		COUNTPERPAGE = cOUNTPERPAGE;
	}
	public static int getTOTALCOUNT() {
		return TOTALCOUNT;
	}
	public static void setTOTALCOUNT(int tOTALCOUNT) {
		TOTALCOUNT = tOTALCOUNT;
	}
	public static int getCURPAGE() {
		return CURPAGE;
	}
	public static void setCURPAGE(int cURPAGE) {
		CURPAGE = cURPAGE;
	}
	public static int getTOTALPAGE() {
		return TOTALPAGE;
	}
	public static void setTOTALPAGE(int tOTALPAGE) {
		TOTALPAGE = tOTALPAGE;
	}
	
	

	
	
	
}
