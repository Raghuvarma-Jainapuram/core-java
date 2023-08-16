import java.util.Scanner;

// class Payment
class Payment{
	Scanner p = new Scanner(System.in);
	void P(String a) {
		if(a.equals("1")) {
			System.out.print("Enter UPI Address :  ");
			String upi = p.nextLine();
			System.out.print("Enter UPI PIN :  ");
			String pin = p.nextLine();
			System.out.println("Your order is Placed!");
			System.out.println("\n   *** THANK YOU FOR ORDERING, HAVE A NICE DAY! ***"   );
			System.out.println("       -------------------***------------------");
		}
		else if(a.equals("2")) {
			System.out.println("Your order is Placed!");
			System.out.println("\n   *** THANK YOU FOR ORDERING, HAVE A NICE DAY! ***"   );
			System.out.println("       -------------------***------------------");
		}
		else {
			System.out.println("Choose correct payment method");
			moreOrPayment selectPayment = new moreOrPayment();
			selectPayment.p1();
		}
	}
}
// class moreOrPayment
class moreOrPayment{
	void more(String m){
		if(m.equals("1")) {
			Homepage homepage = new Homepage();
			homepage.foodTypes();
		}
		else {
			p1();
		}
	}
	void p1() {
		System.out.println("Select Payment Mode");
		System.out.println("-------------------");
		System.out.println("Press 1 to UPI");
		System.out.println("Press 2 to CASH");
		Payment payment=new Payment();
		Scanner s = new Scanner(System.in);
		payment.P(s.nextLine());
		s.close();
	}
}
// class selectItems
class selectItems{
	Scanner s = new Scanner(System.in);
	moreOrPayment M_P = new moreOrPayment();
	void B(String A, String B){
		if(A.equals("1")) {
			if(B.equals("Single") || B.equals("single")) {
				System.out.println("You chose Chicken Biryani Single   -   120/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("Full") || (B.equals("full"))) {
				System.out.println("You chose Chicken Biryani Full   -   230/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("FamilyPack") || (B.equals("Familypack") || (B.equals("familypack")))) {
				System.out.println("You chose Chicken Biryani Family Pack   -   450/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong size, choose correct size.");
				foodItems food=new foodItems();
				food.biryani();
			}
		}
		else if(A.equals("2")) {
			if(B.equals("Single") || B.equals("single")) {
				System.out.println("You chose Chicken Biryani Single   -   150/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("Full") || (B.equals("full"))) {
				System.out.println("You chose Chicken Biryani Full   -   260/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("FamilyPack") || (B.equals("Familypack") || (B.equals("familypack")))) {
				System.out.println("You chose Chicken Biryani Family Pack   -   500/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong size, choose correct size.");
				foodItems food=new foodItems();
				food.biryani();
			}
		}
		else if(A.equals("3")) {
			if(B.equals("Single") || B.equals("single")) {
				System.out.println("You chose Chicken Biryani Single   -   130/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("Full") || (B.equals("full"))) {
				System.out.println("You chose Chicken Biryani Full   -   230/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong size, choose correct size.");
				foodItems food=new foodItems();
				food.biryani();
			}
		}
		else if(A.equals("4")) {
			if(B.equals("Single") || B.equals("single")) {
				System.out.println("You chose Chicken Biryani Single   -   150/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("Full") || (B.equals("full"))) {
				System.out.println("You chose Chicken Biryani Full   -   250/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong size, choose correct size.");
				foodItems food=new foodItems();
				food.biryani();
			}
		}
		else {
			System.out.println("The item currently not available, please choose from available items.");
			foodItems food=new foodItems();
			food.biryani();
		}
	}
	void M(String A, String B){
		if(A.equals("1")) {
			if(B.equals("1Pc") || B.equals("1pc")) {
				System.out.println("You chose Chicken Fried Mandi 1Pc   -   260/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("2Pc") || (B.equals("2pc"))) {
				System.out.println("You chose Chicken Fried Mandi 2Pc   -   460/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("3Pc") || (B.equals("3pc"))) {
				System.out.println("You chose Chicken Fried Mandi 3Pc   -   630/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong piece, choose correct piece.");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
				foodItems food=new foodItems();
				food.mandi();
			}
		}
		else if(A.equals("2")) {
			if(B.equals("1Pc") || B.equals("1pc")) {
				System.out.println("You chose Chicken Juicy mandi 1Pc   -   290/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("2Pc") || (B.equals("2pc"))) {
				System.out.println("You chose Chicken Juicy Mandi 2Pc   -   490/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("3Pc") || (B.equals("3pc"))) {
				System.out.println("You chose Chicken Juicy Mandi 3Pc   -   660/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong piece, choose correct piece.");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
				foodItems food=new foodItems();
				food.mandi();
			}
		}
		else if(A.equals("3")) {
			if(B.equals("1Pc") || B.equals("1pc")) {
				System.out.println("You chose Mutton Fried Mandi 1Pc  -  360/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("2Pc") || (B.equals("2pc"))) {
				System.out.println("You chose Mutton Fried Mandi 2Pc  -  580/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("3Pc") || (B.equals("3pc"))) {
				System.out.println("You chose Mutton Fried Mandi 3Pc  -  760/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong piece, choose correct piece.");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
				foodItems food=new foodItems();
				food.mandi();
			}
		}
		else if(A.equals("4")) {
			if(B.equals("1Pc") || B.equals("1pc")) {
				System.out.println("You chose Mutton Juicy Mandi 1Pc  -  30/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("2Pc") || (B.equals("2pc"))) {
				System.out.println("You chose Mutton Juicy Mandi 2Pc  -  610/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("3Pc") || (B.equals("3pc"))) {
				System.out.println("You chose Mutton Juicy Mandi 3Pc  -  790/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong piece, choose correct piece.");
				foodItems food=new foodItems();
				food.mandi();
			}
		}
		else if(A.equals("5")) {
			if(B.equals("1Pc") || B.equals("1pc")) {
				System.out.println("You chose Arablan Basa Fish mandi 1Pc  -  260/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("2Pc") || (B.equals("2pc"))) {
				System.out.println("You chose Arablan Basa Fish mandi 2Pc  -  460/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("3Pc") || (B.equals("3pc"))) {
				System.out.println("You chose Arablan Basa Fish mandi 3Pc  -  630/-");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong piece, choose correct piece.");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
				foodItems food=new foodItems();
				food.mandi();
			}
		}
		else {
			System.out.println("The item currently not available, please choose from available items.");
			foodItems food=new foodItems();
			food.mandi();
		}
	}
	void P(String A, String B){
		if(A.equals("1")) {
			if(B.equals("Regular") || B.equals("regular")) {
				System.out.println("You chose Chicken Sausage Pizza Regular   -   ₹165");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("Medium") || (B.equals("medium"))) {
				System.out.println("You chose Chicken Sausage Pizza Medium   -   ₹305");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("Large") || (B.equals("large"))) {
				System.out.println("You chose Chicken Sausage Pizza Large   -   ₹495");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong size, choose correct size.");
				foodItems food=new foodItems();
				food.pizza();
			}
		}
		else if(A.equals("2")) {
			if(B.equals("Regular") || B.equals("regular")) {
				System.out.println("You chose Pepper Barbecue Chicken Pizza Regular   -   ₹185");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("Medium") || (B.equals("medium"))) {
				System.out.println("You chose Pepper Barbecue Chicken Pizza Medium   -   ₹335");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("Large") || (B.equals("large"))) {
				System.out.println("You chose Pepper Barbecue Chicken Pizza Large   -   ₹535");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong size, choose correct size.");
				foodItems food=new foodItems();
				food.pizza();
			}
		}
		else if(A.equals("3")) {
			if(B.equals("Regular") || B.equals("regular")) {
				System.out.println("You chose Pepper Barbecue & Onion Pizza Regular   -   ₹215");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("Medium") || (B.equals("medium"))) {
				System.out.println("You chose Pepper Barbecue & Onion Pizza Medium   -   ₹395");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("Large") || (B.equals("large"))) {
				System.out.println("You chose Pepper Barbecue & Onion Pizza Large   -   ₹595");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong size, choose correct size.");
				foodItems food=new foodItems();
				food.pizza();
			}
		}
		else if(A.equals("4")) {
			if(B.equals("Regular") || B.equals("regular")) {
				System.out.println("You chose Chicken Fiesta Pizza Regular   -   ₹235");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("Medium") || (B.equals("medium"))) {
				System.out.println("You chose Chicken Fiesta Pizza Medium   -   ₹450");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("Large") || (B.equals("large"))) {
				System.out.println("You chose Chicken Fiesta Pizza Large   -   ₹695");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong size, choose correct size.");
				foodItems food=new foodItems();
				food.pizza();
			}
		}
		else if(A.equals("5")) {
			if(B.equals("Regular") || B.equals("regular")) {
				System.out.println("You chose Chicken Pepperoni Pizza Regular   -   ₹305");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("Medium") || (B.equals("medium"))) {
				System.out.println("You chose Chicken Pepperoni Pizza Medium   -   ₹570");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("Large") || (B.equals("large"))) {
				System.out.println("You chose Chicken Pepperoni Pizza Large   -   ₹835");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong size, choose correct size.");
				foodItems food=new foodItems();
				food.pizza();
			}
		}
		else {
			System.out.println("The item currently not available, please choose from available items.");
			foodItems food=new foodItems();
			food.pizza();
		}
	}
	void S(String A){
		if(A.equals("1")) {
			System.out.println("You chose Chicken 65   -   170");
			System.out.println("Press 1 to More \n Press any number to payment");
			M_P.more(s.next());
		}
		else if(A.equals("2")) {
			System.out.println("You chose Chicken Manchuria   -   170");
			System.out.println("Press 1 to More \n Press any number to payment");
			M_P.more(s.next());
		}
		else if(A.equals("3")) {
			System.out.println("You chose Chicken Lollipop   -   180");
			System.out.println("Press 1 to More \n Press any number to payment");
			M_P.more(s.next());
		}
		else if(A.equals("4")) {
			System.out.println("You chose Veg Manchuria   -   130");
			System.out.println("Press 1 to More \n Press any number to payment");
			M_P.more(s.next());
		}
		else if(A.equals("5")) {
			System.out.println("You chose Paneer 65   -   160");
			System.out.println("Press 1 to More \n Press any number to payment");
			M_P.more(s.next());
		}
		else if(A.equals("6")) {
			System.out.println("You chose Paneer Manchuria   -   150");
			System.out.println("Press 1 to More \n Press any number to payment");
			M_P.more(s.next());
		}
		else {
			System.out.println("You chose wrong option, choose correct option.");
			foodItems food=new foodItems();
			food.starters();
		}
		
	}
	void D(String A, String B){
		if(A.equals("1")) {
			if(B.equals("1LT") || B.equals("1lt")) {
				System.out.println("You chose 1LT Water Bottle   -   20rs");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong size, choose correct size.");
				foodItems food=new foodItems();
				food.drinks();
			}
		}
		else if(A.equals("2")) {
			if(B.equals("250ML") || B.equals("250ml")) {
				System.out.println("You chose 250ML ThumbsUp   -   20rs");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("7250ML") || B.equals("750ml")) {
				System.out.println("You chose 750ML ThumbsUp   -   60rs");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("1LT") || B.equals("1lt")) {
				System.out.println("You chose 1LT ThumbsUp   -   90rs");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong size, choose correct size.");
				foodItems food=new foodItems();
				food.drinks();
			}
		}
		else if(A.equals("3")) {
			if(B.equals("250ML") || B.equals("250ml")) {
				System.out.println("You chose 250ML Sprite   -   20rs");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("7250ML") || B.equals("750ml")) {
				System.out.println("You chose 750ML Sprite   -   60rs");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("1LT") || B.equals("1lt")) {
				System.out.println("You chose 1LT Sprite   -   90rs");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong size, choose correct size.");
				foodItems food=new foodItems();
				food.drinks();
			}
		}
		else if(A.equals("4")) {
			if(B.equals("250ML") || B.equals("250ml")) {
				System.out.println("You chose 250ML Maazza   -   25rs");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("7250ML") || B.equals("750ml")) {
				System.out.println("You chose 750ML Maazza   -   70rs");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else if(B.equals("1LT") || B.equals("1lt")) {
				System.out.println("You chose 1LT Maazza   -   100rs");
				System.out.println("Press 1 to More \n Press any number to payment");
				M_P.more(s.next());
			}
			else {
				System.out.println("You chose wrong size, choose correct size.");
				foodItems food=new foodItems();
				food.drinks();
			}
		}
		else {
			System.out.println("The item currently not available, please choose from available items.");
			foodItems food=new foodItems();
			food.drinks();
		}
		
	}
	void IC(String A){
		if(A.equals("1")) {
			System.out.println("You chose Vanilla Ice Cream   -   ₹90");
			System.out.println("Press 1 to More \n Press any number to payment");
			M_P.more(s.next());
		}
		else if(A.equals("2")) {
			System.out.println("You chose Strawberry Ice Cream   -   ₹90");
			System.out.println("Press 1 to More \n Press any number to payment");
			M_P.more(s.next());
		}
		else if(A.equals("3")) {
			System.out.println("You chose Black Currant Ice Cream   -   ₹109");
			System.out.println("Press 1 to More \n Press any number to payment");
			M_P.more(s.next());
		}
		else if(A.equals("4")) {
			System.out.println("You chose ButterScotch Ice Cream   -   ₹99");
			System.out.println("Press 1 to More \n Press any number to payment");
			M_P.more(s.next());
		}
		else if(A.equals("5")) {
			System.out.println("You chose Mango Ice Cream   -   ₹99");
			System.out.println("Press 1 to More \n Press any number to payment");
			M_P.more(s.next());
		}
		else if(A.equals("6")) {
			System.out.println("You chose Chocolate Ice Cream   -   ₹109");
			System.out.println("Press 1 to More \n Press any number to payment");
			M_P.more(s.next());
		}
		else if(A.equals("7")) {
			System.out.println("You chose Honeymoon Delight Ice Cream   -   ₹109");
			System.out.println("Press 1 to More \n Press any number to payment");
			M_P.more(s.next());
		}
		else {
			System.out.println("You chose wrong option, choose correct option.");
			foodItems food=new foodItems();
			food.iceCreams();
		}
	}
}
// class foodItems
class foodItems{
	Scanner choice=new Scanner(System.in);
	selectItems SI = new selectItems();
	void biryani(){
		System.out.println("    Biryani            Sinlge     Full    FamilyPack    ");
		System.out.println("---------------------------------------------------------");
		System.out.println("1.Chicken Biryani       120/-      230/-      450/-      ");
		System.out.println("2.Mutton Biryani        150/-      260/-      500/-      ");
		System.out.println("3.Veg Biryani           130/-      230/-        -        ");
		System.out.println("4.Paneer Biryani        150/-      250/-        -        ");
		System.out.println("\nCHOOSE YOUR WISH!");
		SI.B(choice.next(), choice.next());
	}
	void mandi() {
		System.out.println("      Mandi                 1pc      2pc      3pc   ");
		System.out.println("----------------------------------------------------");
		System.out.println("1.Chicken Fried mandi       260/-    460/-    630/- ");
		System.out.println("2.Chicken Juicy mandi       290/-    490/-    660/- ");
		System.out.println("3.Mutton Fried mandi        360/-    580/-    760/- ");
		System.out.println("4.Mutton Juicy mandi        370/-    610/-    790/- ");
		System.out.println("5.Arablan Basa Fish mandi   260/-    460/-    630/- ");
		System.out.println("\nCHOOSE YOUR WISH!");
		SI.M(choice.next(), choice.next());
	}
	void pizza() {
		System.out.println("      Pizza                Regular   Medium   Large   ");
		System.out.println("------------------------------------------------------");
		System.out.println("1.Chicken Sausage           ₹165      ₹305    ₹495    ");
		System.out.println("2.Pepper Barbecue Chicken   ₹185      ₹335    ₹535    ");
		System.out.println("3.Pepper Barbecue & Onion   ₹215      ₹395    ₹595    ");
		System.out.println("4.Chicken Fiesta            ₹235      ₹450    ₹695    ");
		System.out.println("5.Chicken Pepperoni         ₹305      ₹570    ₹835    ");
		System.out.println("\nCHOOSE YOUR WISH!");
		SI.P(choice.next(), choice.next());
		
	}
	void starters() {
		System.out.println("   Starters                Price   ");
		System.out.println("-----------------------------------");
		System.out.println("1.Chicken 65                170    ");
		System.out.println("2.Chicken Manchuria         170    ");
		System.out.println("3.Chicken Lollipop          180    ");
		System.out.println("4.Veg Manchuria             130    ");
		System.out.println("5.Paneer 65                 160    ");
		System.out.println("6.Paneer Manchuria          150    ");
		System.out.println("\nCHOOSE YOUR WISH!");
		SI.S(choice.nextLine());
	}
	void drinks() {

		System.out.println("   Soft Drink     250ML   750ML  1LT    ");
		System.out.println("----------------------------------------");
		System.out.println("1.Water Bottle     -       -     20rs   ");
		System.out.println("2.ThumbsUp        20rs    60rs   90rs   ");
		System.out.println("3.Sprite          20rs    60rs   90rs   ");
		System.out.println("4.Maazza          25rs    70rs   100rs  ");
		System.out.println("\nCHOOSE YOUR WISH!");
		SI.D(choice.next(), choice.next());
	}
	void iceCreams() {
		System.out.println("   Ice Creams        Price   ");
		System.out.println("-----------------------------");
		System.out.println("1.Vanilla             ₹90    ");
		System.out.println("2.Strawberry          ₹90    ");
		System.out.println("3.Black Currant       ₹109   ");
		System.out.println("4.ButterScotch        ₹99    ");
		System.out.println("5.Mango               ₹99    ");
		System.out.println("6.Chocolate           ₹109   ");
		System.out.println("7.Honeymoon Delight   ₹109   ");
		System.out.println("\nCHOOSE YOUR WISH!");
		SI.IC(choice.nextLine());
	}
}
// class Homepage
class Homepage{
	static Scanner sc=new Scanner(System.in);
	static String id;
	static String password;
	void setter(String user,String pass)
	{
		this.id=user;
		this.password=pass;
		checkLoginDetails();
	}
	void checkLoginDetails()
	{
		String user_name = sc.nextLine();
		String user_password = sc.nextLine();
		if(user_name.equals(this.id)&&user_password.equals(this.password))
		{
			foodTypes();
		}
		else {
			System.out.println("Invalid Login details.");
			checkLoginDetails();
		}
	}
	void foodTypes() {
		System.out.println("* SELECT THE CATAGORY *\n-----------------------");
		System.out.println("1. BIRYANY\n2. MANDI\n3. PIZZA\n4. STARTERS\n5. SOFT DRINKS\n6. ICE CREAMS\nCoose your option OR Enter a number to proceed\n");
		String catagory=sc.nextLine();
		
		foodItems food=new foodItems();
		if(catagory.equals("BIRYANY")||catagory.equals("1")) {
			food.biryani();
		}
		else if(catagory.equals("MANDI")||catagory.equals("2")) {
			food.mandi();
		}
		else if(catagory.equals("PIZZA")||catagory.equals("3")) {
			food.pizza();
		}
		else if(catagory.equals("STARTERS")||catagory.equals("4")) {
			food.starters();
		}
		else if(catagory.equals("SOFT DRINKS")||catagory.equals("5")) {
			food.drinks();
		}
		else if(catagory.equals("ICE CREAMS")||catagory.equals("6")) {
			food.iceCreams();
		}
		else {
			System.out.println("You chose wrong type, try from the above only.");
			foodTypes();
		}
	}
}
// class createAccount
class createAccount{
	Scanner input = new Scanner(System.in);
	void signUp(){
		System.out.print("Enter User_ame :  ");
		String id = input.nextLine();
		System.out.print("Create Your Password :  ");
		String password = input.nextLine();
		System.out.println("Your account has created Successfully!\nPlease enter your details again to Login");
		Homepage homepage=new Homepage();
		homepage.setter(id,password);
	}
}
// class logInAccount
class logInAccount{
	Scanner input = new Scanner(System.in);
	void signIn() {
		System.out.print("Enter User_ame :  ");
		String i=input.nextLine();
		System.out.print("Enter Your Password :  ");
		String p=input.nextLine();
		System.out.println("You don't have an account please Register first.");
		createAccount create_account = new createAccount();
		create_account.signUp();
	}
}
// class registerOrLogin
class registerOrLogin{
	void validate(String name){
		Scanner input = new Scanner(System.in);
		if(name.endsWith(".in"))
		{
			System.out.printf("WELCOME TO %s\n--------------------\n", name );
			System.out.println("SELECT  Register  OR  Login");
			String a=input.nextLine();
			if(a.equals("Register"))
			{
				createAccount create_account = new createAccount();
				create_account.signUp();	
			}
			else if(a.equals("Login"))
			{
				logInAccount log_in_account = new logInAccount();
				log_in_account.signIn();				
			}
			else {
				System.out.println("Invalid selection, Select Correct Option");
				validate(name);
			}
		}
		else
		{
			System.out.println("Invalid website name please try again later!");
			FoodDeliveryApp website = new FoodDeliveryApp();
			website.checkWebsite();
		}
		input.close();
	}
}
// class food_delivery_app (main)
// class main {
public class FoodDeliveryApp {

	static void checkWebsite() {
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		registerOrLogin R_L = new registerOrLogin();
		R_L.validate(name);
		input.close();
	}
	public static void main(String[] args) {
		System.out.println("ENTER WEBSITE NAME \nNote: Website name must be endswith .in");
		checkWebsite();
	}
}
