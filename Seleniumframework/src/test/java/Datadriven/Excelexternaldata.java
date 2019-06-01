package Datadriven;

public class Excelexternaldata {

	public static void main(String[] args) throws Exception {
		
		String path = System.getProperty("user.dir");
		excel1 excel=new excel1(path+"\\Excelsheets\\data1.xlsx", "Sheet1");
		//excel.getcellvalue(0,0);
		excel.getrowcount();
		excel.getcellvalue(0, 0);
		excel.getcellvaluenumber(2,1 );
		

	}

}
