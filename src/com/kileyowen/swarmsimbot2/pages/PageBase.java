
package com.kileyowen.swarmsimbot2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.kileyowen.exceptions.ExceptionNope;
import com.kileyowen.exceptions.ExceptionNull;
import com.kileyowen.selenium.core.Element;
import com.kileyowen.selenium.core.ManagerElement;

//TODO Document
class PageBase {

	// TODO Document
	private final ManagerPage managerPage;

	// TODO Document
	private final ManagerElement managerElement;

	// TODO Document
	protected PageBase(final ManagerPage newManager, final ManagerElement newManagerElement) {

		// TODO Document
		this.managerPage = newManager;

		// TODO Document
		this.managerElement = newManagerElement;

	}

	// TODO Document
	protected final WebDriver getDriver() {

		// TODO Document
		return this.getManagerPage().getDriver();

	}

	// TODO Document
	protected final Element getElement(final By by) throws ExceptionNull, ExceptionNope {

		// TODO Document
		return this.getManagerElement().getElement(by);

	}

	// TODO Document
	private final ManagerElement getManagerElement() {

		// TODO Document
		return this.managerElement;

	}

	// TODO Document
	protected final ManagerPage getManagerPage() {

		// TODO Document
		return this.managerPage;

	}

}
