package sock.ex03;

public class MyDto {
	private int code; // 1 통신성공, -1 실패
	private String msg; // 통신이 어떻게 됐는지 설명
	private String data; // 실제 데이터를 담자
	
	public MyDto() {
		// TODO Auto-generated constructor stub
	}

	public MyDto(int code, String msg, String data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}
