package testPkg;

import org.testng.annotations.Test;

import basePkg.BaseClass;
import pagePkg.SearchFun;

public class SearchTest extends BaseClass {
@Test
public void searchTestFun() {
SearchFun obj= new SearchFun(driver);	
obj.searchNewYork();
obj.tearDown();
}
}
