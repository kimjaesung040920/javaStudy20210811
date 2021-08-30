package b10_클래스;

public class Regular {
    private boolean yearCheck;

    public boolean isYearCheck() {
		return yearCheck;
    }
    
	public void setYearCheck(int year, String schoolName) {
		this.yearCheck = year > 2 && schoolName.equals("코라아아이티");
	}

}
