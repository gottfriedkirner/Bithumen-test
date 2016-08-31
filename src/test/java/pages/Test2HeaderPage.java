package pages;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class Test2HeaderPage {

	@FindBy(css = "div[id='form-container'] table[id='bottom'] td tr>td>input")
	private List<WebElementFacade> categoryName;
	
	@FindBy(css = "div[id='form-container'] table[id='bottom'] td tr>td>a")
	private List<WebElementFacade> categoryCheckbox;
	{
	List<String> categoryName = new ArrayList<String>();
	for (int i = 0; i < categoryName.size(); i++) {
		System.out.println(categoryName.get(i));
	}	
	
	
}
}




