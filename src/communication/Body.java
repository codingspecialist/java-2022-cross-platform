package communication;

public class Body{
	private String dataType;
	private Items items;
	private int pageNo;
	private int numOfRows;
	private int totalCount;
	
	public Body() {
	
	}

	public Body(String dataType, Items items, int pageNo, int numOfRows, int totalCount) {
		this.dataType = dataType;
		this.items = items;
		this.pageNo = pageNo;
		this.numOfRows = numOfRows;
		this.totalCount = totalCount;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getNumOfRows() {
		return numOfRows;
	}

	public void setNumOfRows(int numOfRows) {
		this.numOfRows = numOfRows;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	
}
