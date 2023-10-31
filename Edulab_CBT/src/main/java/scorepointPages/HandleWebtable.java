package scorepointPages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import webHandler.*;
public class HandleWebtable {
	public static By BrandManageTable = By.xpath("//table/tbody/tr[1]/th");
	public void searchClickOnBrandSetting(String ColumnName1,String BrandKey) {
		//First loop will find the 'ClOCK TWER HOTEL' in the first column
		for (int i=1;i<=4;i++){
			String sValue = null;
			sValue = WebHandler.driver.findElement(By.xpath("//table/tbody/tr[1]/th["+i+"]")).getText();;
			if(sValue.equalsIgnoreCase(ColumnName1)){				
				// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
				List<WebElement> rowsNumber = WebHandler.driver.findElements(By.xpath("//table[1]/tbody/tr[1]/td[1]"));
				int rowCount = rowsNumber.size();
				System.out.println("No of rows in this table : " + rowCount);
				for (int j=1;j<=rowCount;j++){
					String sRowValue= WebHandler.driver.findElement(By.xpath("//table/tbody/tr["+j+"]/td["+i+"]")).getText();
					if(sValue.equalsIgnoreCase(BrandKey)) {						
					}
				}
				break;
			}
		}

	}
}
