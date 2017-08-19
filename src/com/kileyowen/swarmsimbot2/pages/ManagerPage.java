
package com.kileyowen.swarmsimbot2.pages;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

//TODO Document
class ManagerPage implements AutoCloseable {

	// TODO Document
	public final static ManagerPage init(final WebDriver driver) {

		// TODO Document
		return new ManagerPage(driver);

	}

	// TODO Document
	private final WebDriver driver;

	// TODO Document
	private final HashMap<Class<? extends PageBase>, List<PageBase>> pages;

	// TODO Document
	private ManagerPage(final WebDriver newDriver) {

		// TODO Document
		this.driver = newDriver;

		// TODO Document
		this.pages = new HashMap<>();

	}

	// TODO Document
	@Override
	public void close() {

		// TODO Document
		this.getDriver().close();

	}

	// TODO Document
	final WebDriver getDriver() {

		// TODO Document
		return this.driver;

	}

}
