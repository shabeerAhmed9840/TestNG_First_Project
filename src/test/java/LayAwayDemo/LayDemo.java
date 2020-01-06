package LayAwayDemo;
import pojoo.L;
import pojoo.PageFirst;
import pojoo.R;

import LayAwayDemo.BaseClass;

public class LayDemo extends BaseClass{
	public static void main(String[] args) throws InterruptedException{
		launch("https://www.layawaytravel.com.au/");
		Thread.sleep(5000);
		L l =new L();
		click(l.getLog());
		System.out.println("done"); 
		//WebElement x = driver.findElement(By.xpath("(//li[@class='loadAccount  '])[1]"));
		//x.click();
		R e=new R();
		//click(e.getRush());
	    //F f= new F();
		/*fill(f.getFirstname(), "joker");
		fill(f.getMiddlename(), "batman");
		fill(f.getLastname(), "superman");
		fill(f.getMob(), "1234567890");
		fill(f.getLandline(),"9874561230");
		fill(f.getEmail(),"mustag.s.ahmed@gmail.com");
		fill(f.getEmail2(), "xyz@gmail.com");
		fill(f.getPass(), "Jawa is my love2");
		fill(f.getRepass(),"my love is jawa");
		fill(f.getHow(), "internet");
		click(f.getReg()); 
		*/
		
		fill(e.getMail(), "ahmedshabeer1996@gmail.com");
		fill(e.getLoginpass(), "9840585752msA");
		click(e.getLoginbtn());
		Thread.sleep(7000);
		PageFirst f=new PageFirst();
		click(f.getMydet());
		click(f.getMydesign());
		click(f.getVoucher());
		click(f.getChangepassword());
	    click(f.getHoliday());
		click(f.getCurise());
        click(f.getInfo());
        click(f.getProfile());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
