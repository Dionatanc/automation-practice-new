package br.com.automationpractice.pageObject.portal;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import br.com.automationpractice.pageObject.common.CommonPageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class PaginaAutenticacao extends CommonPageObject{

		@FindBy (id = "email_create")
		private WebElementFacade campoEmail;
		
		@FindBy (id = "SubmitCreate")
		private WebElementFacade bntCriarConta;
		
		@FindBy (id = "email")
		private WebElementFacade campoEmailJaRegistrado;
		
		@FindBy (id = "passwd")
		private WebElementFacade campoSenha;
		
		
		public void efetuarCadastro() throws Exception{
			try {
				getDriver().findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.F5));
			}catch (Exception ignore) {}
			
			campoEmail.waitUntilClickable();
			campoEmail.clear();
			
		}

		public void efetuarLogin(String email) throws Exception{
			
			
		}
		
}
