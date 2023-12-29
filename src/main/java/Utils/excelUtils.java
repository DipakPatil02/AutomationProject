
package Utils;
import java.util.Map;
import commonFunctions.CommonFunctions;
import java.util.HashMap;
import java.util.List;
public class excelUtils {
	public static void main(String[] args) {
		String GLOBAL_ALIAS = "example"; // Replace with your desired GLOBAL_ALIAS value
		String userName = getUserNameFromExcel(GLOBAL_ALIAS);
		String password = getPasswordFromExcel(GLOBAL_ALIAS);
		System.out.println("userName: " + userName);
		System.out.println("password: " + password);
	}
	public static String getUserNameFromExcel(String globalAlias) {
		String userName = null;
		try {
			java.util.List<Map<String, String>> values = ExcelReader.readGlobalSheetFromExcel();

			for (Map<String, String> map : values) {
				if (map.containsKey("GLOBAL_ALIAS") && map.get("GLOBAL_ALIAS").equals(globalAlias)) {
					userName = map.get("VARIABLENAME");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userName;
	}
	public static String getPasswordFromExcel(String globalAlias) {
		String password = null;
		try {
			java.util.List<Map<String, String>> values = ExcelReader.readGlobalSheetFromExcel();
			for (Map<String, String> map : values) {
				if (map.containsKey("GLOBAL_ALIAS") && map.get("GLOBAL_ALIAS").equals(globalAlias)) {
					password = map.get("VARIABLEVALUE");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return password;
	}   
	public static String getRaterId(String globalAlias) {
		String raterId = null;		
		try {
			String env = CommonFunctions.getEnviornment();
			java.util.List<Map<String, String>> values = ExcelReader.readGlobalSheetFromExcel();
			for (Map<String, String> map : values) {			
				if (map.containsKey("GLOBAL_ALIAS") && map.get("GLOBAL_ALIAS").equals(globalAlias) && map.containsKey("ENV") && map.get("ENV").equals(env)) {
					raterId = map.get("GLOBAL_ID");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return raterId;
	}
	public static Map<String, String> getTestData(String TestCaseId) {
		Map<String, String> testData = new HashMap<>();
		try {
			List<Map<String, String>> values = ExcelReader.readCredentialSheetFromExcel();
			String env = CommonFunctions.getEnviornment();
			for (Map<String, String> map : values) {
				if (map.containsKey("TESTCASEID") && map.get("TESTCASEID").equals(TestCaseId) && map.containsKey("env") && map.get("env").equals(env) ) {
					testData.put("PROJECTID", map.get("PROJECTID"));
					testData.put("PROJECTNAME", map.get("PROJECTNAME"));
					testData.put("PROJECTNAME2", map.get("PROJECTNAME2"));
					testData.put("PROJECTNAME3", map.get("PROJECTNAME3"));
					testData.put("PROJECTNAME4", map.get("PROJECTNAME4"));
					testData.put("BRANDNAME", map.get("BRANDNAME"));
					testData.put("TESTSET", map.get("TESTSET"));
					testData.put("TESTSET_2", map.get("TESTSET_2")); 
					testData.put("TESTSET_3", map.get("TESTSET_3"));
					testData.put("TESTSET_4", map.get("TESTSET_4"));
					testData.put("NAME", map.get("NAME")); 
					testData.put("USERNAME", map.get("USERNAME"));
					testData.put("COMPANY", map.get("COMPANY"));
					testData.put("GROUP1", map.get("GROUP1"));
					testData.put("GROUP2", map.get("GROUP2"));
					testData.put("BRANDKEY", map.get("BRANDKEY"));
					testData.put("BRANDKEY1", map.get("BRANDKEY1"));
					testData.put("GROUPKEY1", map.get("GROUPKEY1"));
					testData.put("GROUPKEY2", map.get("GROUPKEY2"));
					testData.put("TESTSETIDS", map.get("TESTSETIDS"));
					testData.put("BRANDNAME1", map.get("BRANDNAME1"));
					testData.put("COMPANY_1", map.get("COMPANY_1"));
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testData;
	}
}
