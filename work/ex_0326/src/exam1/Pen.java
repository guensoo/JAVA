package exam1;

public class Pen {
	private int amount;
    private String color; //볼펜의 색
	
	public int getAmount() {
		return amount;
		}
	
	// 남은 량
    public void setAmount(int amount) {
    	this.amount = amount;
    	}
    
    // 남은 량 설정
    public String getColor() {
    	return color;
    	}
    
    public void setColor(String color) {
    	this.color = color;
    	}
    
    public void refill(int n) {
    	setAmount(n);
    	}
}
