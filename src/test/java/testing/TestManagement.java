package testing;


class TestCases{
	TestCases(){
		System.out.println("This class defines the Steps to be performed for Testing ");
	}
	public void firstStep() {
		System.out.print("Open Browser and Enter URL");
	}
	public void secondStep() {
		System.out.print("Enter User Nmae and Password");
	}
	public void thirdStep() {
		System.out.print("Click on Login Button");
	}
	public void fourthStep() {
		System.out.print("Search the required product");
	}
	public void fifthStep() {
		System.out.print("select the product, check the price and click on Add cart button");
	}
	public void sisthStep() {
		System.out.print("Go to cart, check the information and click on proceed to next page");
	}
	public void sevenStep() {
		System.out.print("Complete the payment and check the receipt");
	}
	public void eigthStep() {
		System.out.print("Click on Logout");
	}
	
}
class TestCycle extends TestCases{
	TestCycle(){
		System.out.print("Total 3 cycles: 3 Sprints");
	}
	public void tester() {
		System.out.println("KUSHI is the Tester for this application");
	}
	public void environment() {
		System.out.println("Testing is done in SIT,UAT and Prod");
	}
	public void endToEnd() {
		System.out.println("Post tseting each module, end to end testing is done");
	}
	public void regression(String newbuild, int existingbuild) {
		System.out.println("User need to verify existing functionalities ");
	}
	public void regression(int Sprint2build, double Sprint3build) {
		System.out.println("User need to verify existing functionalities ");   //overloading method
	}
	public void regression(double newbuild, int existingbuild) {
		System.out.println("User need to verify existing functionalities ");
	}
}
class TestPlan extends TestCycle{   //inheritance
	public void requirements() {
		System.out.println("Application is stable and ready for testing ");
	}
	public void stability() {
		System.out.println("Application is stable and ready for testing ");
	}
	public void estimation() {
		System.out.print("10 Backlogs, estimation is 15 days 1.5 days for each backlog");
	}
	public void noOfBacklogs() {
		System.out.println("Sprint1: 10 Backlogs");
	}
	public void tester() {
		System.out.println("RAM is the new Tester");   //overridden method
	}
}
abstract class ResultDeatils{
	
	private int numberOfTestcases=1;
	private int passedTestCases=10;
	private int failedTestCases=1;
	private String executionStatus="pass";
	
	public void setNoOfTestCases(int num) {
		if(num>0) {
			numberOfTestcases=num;
		}
	}
	public int getPassedTestCases(){        //Abstraction using getter and Setter
		return passedTestCases;
	}
	public int getFailedTestCases(){
		return failedTestCases;
	}
	public String status(){
		return executionStatus;
	}
}
class ResultExceution extends ResultDeatils{
	{
	super.setNoOfTestCases(100);
	int pass = super.getPassedTestCases();
	int fail = super.getFailedTestCases();
	String status = super.status();
}
}
interface Test{
	public void test1();
	public void test2();    
}
class TestInterface implements Test{

	public void test1() {
		System.out.print("Test1 exmaple for Interface");
		
	}

	public void test2() {
		System.out.print("Test2 exmaple for Interface");
		
	}
	
}
public class TestManagement {

	public static void main(String[] args) {
		String a="Test";
		int b=10;
		double c=1.462;
		TestCases tc= new TestCases();
		tc.firstStep();
		tc.secondStep();
		tc.thirdStep();
		tc.fourthStep();
		tc.fifthStep();
		tc.sisthStep();
		tc.sevenStep();
		tc.eigthStep();
		TestCycle tcy=new TestCycle();
		tcy.eigthStep();
		tcy.thirdStep();
		tcy.tester();
		tcy.environment();
		tcy.endToEnd();
	    tcy.regression(c,b);
	    tcy.regression(b,c);
	    tcy.regression(a, b);
	    TestPlan tp=new TestPlan();
	    tp.eigthStep();
	    tp.regression(a, b);
	   tp.estimation();
	   tp.requirements();
	   tp.tester();
	   tp.stability();
	   tp.noOfBacklogs();
	   TestInterface tif=new TestInterface();
	   tif.test1();
	   tif.test2();
	   
	}

}
