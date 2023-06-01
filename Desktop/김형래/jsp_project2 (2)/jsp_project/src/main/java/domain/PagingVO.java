package domain;

public class PagingVO {

	private int pageNo;  //�쁽�옱 �솕硫댁뿉 異쒕젰�릺�뒗 �럹�씠吏��꽕�씠�뀡 踰덊샇
	private int qty; //�븳 �럹�씠吏��뿉 蹂댁뿬以� 寃뚯떆湲� �닔  => 10媛�
	private String type;
	private String keyword;
	
	public PagingVO() {  //�럹�씠吏��꽕�씠�뀡�쓣 �겢由��븯湲곗쟾 湲곕낯 媛믪쑝濡� 吏��젙
		this(1, 10);
	}
	public PagingVO(int pageNo, int qty) {
		this.pageNo = pageNo;
		this.qty = qty;
	}
	
	//타입을 배열처리
	   public String[] getTypeToArray() {
	      return this.type == null ? new String[] {} : this.type.split("");
	   }
	public int getPageStart() {
		return (this.pageNo-1)*10;  //�떆�옉 limit 踰덉� 援ы븯湲�
	}
	
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "PagingVO [pageNo=" + pageNo + ", qty=" + qty + ", type=" + type + ", keyword=" + keyword + "]";
	}
	
	
}
