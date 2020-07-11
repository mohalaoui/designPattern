package com.design.pattern;

import org.junit.jupiter.api.Test;

import com.design.pattern.core.adapter.Bird;
import com.design.pattern.core.adapter.BirdAdapter;
import com.design.pattern.core.adapter.Budgie;
import com.design.pattern.core.adapter.PlasticToyDuck;
import com.design.pattern.core.adapter.ToyDuck;
import com.design.pattern.core.builder.Author;
import com.design.pattern.core.builder.Book;
import com.design.pattern.core.builder.BookFromat;
import com.design.pattern.core.composite.Article;
import com.design.pattern.core.composite.ArticleComponent;
import com.design.pattern.core.composite.ArticleGroup;
import com.design.pattern.core.decorator.Beverage;
import com.design.pattern.core.decorator.HouseBlend;
import com.design.pattern.core.decorator.Mocha;
import com.design.pattern.core.facade.ComputerFacade;
import com.design.pattern.core.factory.Shape;
import com.design.pattern.core.factory.ShapeFactory;
import com.design.pattern.core.factory.ShapeType;
import com.design.pattern.core.proxy.Image;
import com.design.pattern.core.proxy.ImageProxy;
import com.design.pattern.core.singleton.CacheSingleton;
import com.design.pattern.core.strategy.Employee;
import com.design.pattern.core.strategy.FiftyPercentBonus;
import com.design.pattern.core.strategy.TwentyPercentBonus;


//@SpringBootTest
class DesignPatternApplicationTests {

	@Test
	void testDecoratorPattern() {
		
		Beverage beverage = new HouseBlend();
		
		System.out.println(beverage.getDesc());
		System.out.println(beverage.cost());
		
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);

		System.out.println(beverage.getDesc());
		System.out.println(beverage.cost());
	}
	
	@Test
	void testCompositePattern() {
		ArticleComponent fruitComponent = new ArticleGroup("FRUITS");
		ArticleComponent legumeComponent = new ArticleGroup("LEGUMES");
		
		ArticleComponent allArticles = new ArticleGroup("ALL ARTICLES");
		
		allArticles.add(fruitComponent);
		allArticles.add(legumeComponent);
		
		Article fraise = new Article("fraise", "2");
		Article pomme = new Article("pomme", "3");
		
		fruitComponent.add(pomme);
		fruitComponent.add(fraise);
		
		ArticleComponent haricots = new Article("haricots", "1");
		
		legumeComponent.add(haricots);
		
		allArticles.articleInfo();
		
		// remove article
		allArticles.get(fruitComponent).get().remove(pomme);
		
		allArticles.articleInfo();
		
	}
	
	@Test
	void testStrategyPattern() {
		// we can imagine another implementation with payment mode (Paypal, credit card, ...)
		
		Employee employeeWithoutBonus = new Employee("firsname", "lastname", 1000.0); 
		
		Employee employeeWithFyftyPercentBonus = new Employee("firsname", "lastname", 1000.0, new FiftyPercentBonus());
		
		Employee employeeWithTwentyPercentBonus = new Employee("firsname", "lastname", 1000.0, new TwentyPercentBonus()); 
		
		System.out.println("salary for employeeWithoutBonus: " + employeeWithoutBonus.getSalary());
		System.out.println("salary for employeeWithFyftyPercentBonus: " + employeeWithFyftyPercentBonus.getSalary());
		System.out.println("salary for employeeWithTwentyPercentBonus: " + employeeWithTwentyPercentBonus.getSalary());
	}
	
	@Test
	void testFactoryPattern() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape(ShapeType.Rectangle);
		shape.draw();
	}
	
	@Test
	void testProxyPattern() {
		Image imageProxy = new ImageProxy("my_image");
		// restricted access to the imageService 
		imageProxy.display();
	}
	
	@Test
	void testSingletonPattern() {
		CacheSingleton cacheSingleton1 = CacheSingleton.getInstance();
		cacheSingleton1.putValue("toto", "toto");
		
		CacheSingleton cacheSingleton2 = CacheSingleton.getInstance();
		System.out.println("the value with cacheSingleton2 " + cacheSingleton2.getValue("toto"));
	}
	
	@Test
	void testAdapterPattern() {
		// initial demande
		System.out.println("Budgie...");
		Bird budgie = new Budgie();
		budgie.fly();
		budgie.makeSound();
		
		// current demande: all bird must squeak
		System.out.println("PlasticToyDuck...");
		ToyDuck plasticToyDuck = new PlasticToyDuck();
		plasticToyDuck.squeak();
		
		System.out.println("BudgieAdapter...");
		ToyDuck birdAdapter = new BirdAdapter(budgie);
		birdAdapter.squeak();
	}
	
	@Test
	void testFacadePattern() {
		ComputerFacade computerFacade = new ComputerFacade();
		
		computerFacade.loadFromMemory();
		computerFacade.readDataFromHDD();
		computerFacade.processDataFromCPU();
	}
	
	@Test
	void testBuilderPattern() {
		Author author = new Author("Martin", "Fowler");
		Book book = new Book.Builder()
								.withAuthor(author)
								.withIsbn("Refactoring")
								.withEdition("2nd edition")
								.withAuthor(BookFromat.PDF)
								.build();
		
		System.out.println(book);
	}


}
