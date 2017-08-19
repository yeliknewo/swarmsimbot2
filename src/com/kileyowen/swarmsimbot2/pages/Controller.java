
package com.kileyowen.swarmsimbot2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.kileyowen.swarmsimbot2.Brain;
import com.kileyowen.swarmsimbot2.Command;

//TODO Document
public class Controller {

	// TODO Document
	private static final String BASE_URL = "https://swarmsim.github.io/";

	// TODO Document
	private static final String WEBDRIVER_CHROME_PATH = "C:\\Program Files (x86)\\webdriver\\chromedriver.exe";

	// TODO Document
	private static final String WEBDRIVER_CHROME_PROPERTY = "webdriver.chrome.driver";

	// TODO Document
	public static final Controller init() {

		// TODO Document
		return new Controller(Controller.setup());

	}

	// TODO Document
	private final static ManagerPage setup() {

		// TODO Document
		System.setProperty(Controller.WEBDRIVER_CHROME_PROPERTY, Controller.WEBDRIVER_CHROME_PATH);

		// TODO Document
		final WebDriver driver = new ChromeDriver();

		// TODO Document
		driver.get(Controller.BASE_URL);

		// TODO Document
		driver.manage().window().maximize();

		// TODO Document
		return ManagerPage.init(driver);

	}

	// TODO Document
	private final ManagerPage managerPage;

	// TODO Document
	private Controller(final ManagerPage newManagerPage) {

		// TODO Document
		this.managerPage = newManagerPage;

	}

	// TODO Document
	public final void executeBrain(final Brain brain) {

		// TODO Document
		while (!brain.isDone()) {

			// TODO Document
			final Command cmd = brain.getCommand();

		}

	}

}
