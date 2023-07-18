package eCommerce;

import java.util.Scanner;



class Category
{
	
		void disp() {
			System.out.println("1. Electronics\n2. Furniture\n3. Clothing\n4. Art Supplies\n5. Essentials");
		}
	

}
class Subcategory extends Category
{		
	int c1=0;
	void display(int c1) {
		this.c1 = c1;
		String[] Electronics = {"1. Mobile\n2. Laptop\n3.Tablet"};
		String[] Furniture = {"1.Couch\n2. Table\n3. Bed"};
		String[] Clothing = {"1. Tops\n2. Trousers\n3. Dresses\n"};
		String[] Art = {"1. Paint\n2.Paper\n3.Pencil"};
		String[] Essentials = {"1. Tooth Brush\n2. Tooth Paste\n3. Facewash\n"};
		if(c1==1) {
			for(int i =0;i<Electronics.length;i++) {
				System.out.print(Electronics[i]);
			}
		}
		else if(c1==2) {
			for(int i =0;i<Furniture .length;i++) {
				System.out.print(Furniture [i]);
			}
		}
		else if(c1==3) {
			for(int i =0;i<Clothing.length;i++) {
				System.out.print(Clothing[i]);
			}
		}
		else if(c1==4) {
			for(int i =0;i<Art.length;i++) {
				System.out.print(Art[i]);
			}
		}
		else if(c1==5) {
			for(int i =0;i<Essentials.length;i++) {
				System.out.print(Essentials[i]);
			}
		}

	}

}
class Products extends Subcategory
{
	public int c2;
	String prod[]= {"\"1. Samsung\n", "2. Apple\n","3. vivo\n","4. Xiaomi\n","5. Google Pixel\n",
			"1. Lenovo\n", "2. HP\n","3. Dell\n", "4. MAC\n","5. ASUS\n",
			"1. Motorola Tab\n", "2. Lenovo Tab \n","3. Samsung Galaxy Tab\n","4. Redmi Pad\n","5. Ipad",
			"1. MH DECOART\n", "2. Amazon Brand - Solimo\n","3. TreeKart Solid Sheesham Wood Sofa\n","4. IKEA\n","5. ",
			"1. DS ART PALACE\n", "2. WoodMarwar 3\n","3. Tribesigns \n","4. IKEA \n","5. Devanshi Handicraft" ,
			"1. Amazon-Solimo\n", "2. The Sleep Company\n","3.Sleepwell\n", "4. Relaxo\n","5.Comfort\n",
			"1. H&M \n", "2. ZARA\n","3.ONLY \n","4. Roadster \n","5. MANGO\n",
			"1. H&M\n", "2. ZARA\n","3. ONLY\n","4. Roadster\n","5. MANGO\n" ,
			"1. H&M\n", "2. ZARA\n","3. ONLY\n","4. Roadster\n","5. MANGO\n",
			"1. Faber Castle \n", "2. Fevicryl\n","3. Camel\n","4. INOG\n","Himalayan" ,
			"1. Brustro","2. Winasor & Newton","3. Artios","4. Artists'\n","5. Canson\n",
			"1. Doms\n", "2. Apsara \n","3.ABOUT SPACE \n","4.Luxor Pencils","5. Faber-Castell \n",
			"1. Colgate \n", "2. Sensodyne\n","3. Curaprox Dr. Reddy's \n","4. Quip\n","5. Oral B Criss Cross\n" ,
			"1. Colgate \n", "2. Dabur Red \n","3.Himalaya \n", "4. Sensodyne Toothpaste\n","5.Perfora Toothpaste\n",
			"1. Cetaphile \n", "2. Simple \n","3. AhaGlow \n", "4. Himalaya\n","5. Klairs\n",
	};
	void display(int i)
	{
		for(int j=0;j<=4;j++)
		{
			System.out.println(prod[i]);
			i++;
		}
		
	}
	
}
class Description extends Products{
	int choice2;
	String desc[]= {//phone
			"1. Price : 26,999 \nSamsung Galaxy S20 FE 5G (Cloud Navy, 8GB RAM, 128GB Storage)","2. Price: 66,999 \nApple iPhone 14 (128 GB) - Blue","3.Price : 28,499 \nVivo Y16 (Drizzling Gold, 4GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers","4. Price : 41,699 \nXiaomi 12 Pro | 5G (Noir Black, 8GB RAM, 256GB Storage) | Snapdragon 8 Gen 1 | 50+50+50MP Flagship Cameras (OIS) | 10bit 2K+ Curved AMOLED Display | Sound by Harman Kardon","5. Price : 68,999 \nGoogle Pixel 4a 5G with Snapdragon 765G (Clearly White, 6GB RAM, 128GB Storage)",
			//laptop
			"1.Price : 61,999 \nHP Laptop 15, 13th Gen Intel Core i5-1335U, 15.6-inch (39.6 cm), FHD, 8GB DDR4, 512GB SSD, Intel Iris Xe Graphics, FHD Camera w/Privacy Shutter (Win 11, MSO 2021, Silver, 1.59 kg), fd0011TU",
			"2.Price : 61,390 \nLenovo IdeaPad Slim 3 Intel Core i3 11th Gen 14\" (35.56cm) FHD Thin & Light Laptop (8GB/512GB SSD/Windows 11/Office 2021/2Yr Warranty/3months Game Pass/Arctic Grey/1.41Kg), 82H701DNIN",
			"3.Price : 41,990 \nDell Vostro 3425 Laptop, AMD Ryzen 5-5500U/8GB/512GB/14.0\" (35.56cm) FHD, TÜV Rheinland Certified Comfortview to Reduce Harmful Blue Light/Windows 11+ MSO'21/15 Month McAfee/Carbon Black/1.48kg",
			"4.Price : 81,990 \nApple 2020 MacBook Air Laptop M1 chip, 13.3-inch/33.74 cm Retina Display, 8GB RAM, 256GB SSD Storage, Backlit Keyboard, FaceTime HD Camera, Touch ID. Works with iPhone/iPad; Space Grey\r\n",
			"5.Price : 63,990 \nASUS [Smart Choice] TUF Gaming Laptop F15, Intel Core i5-11400H 11th Gen, 15.6\" (39.62 cm) FHD 144Hz, (16GB/512GB SSD/4GB NVIDIA GeForce RTX 2050/Win 11/ RGB Backlit KB/Black/2.30 kg), FX506HF-HN025W",
			// tab
			"1.Price : 26,999 \nLenovo Tab M10 5G 10.6 inch (26.9cm), 6 GB, 128 GB, Wi-Fi+ 5G, 2K Display (2000x1200), Abyss Blue and Octa-core Processor",
			"2.Price : 19,999 \nMotorola Tab (11inch, 4GB, 64GB, WiFi+LTE Calling), Modernist Teal with Mediatek Helio G90T Processor, Quadcore Speakers with Dolby Atmos, Face Unlock and Google Assistant",
			"3.Price : 15,499 \nSamsung Galaxy Tab A8 26.69cm (10.5 inch) Display, RAM 4 GB, ROM 64 GB Expandable, Wi-Fi Tablet, Gray, (SM-X200NZAEINU)",
			"4.Price : 16,999 \nRedmi Pad | MediaTek Helio G99 | 26.95cm (10.61 inch) 2K Resolution & 90Hz Refresh Rate Display | 4GB RAM & 128GB Storage, Expandable up to 1TB | Quad Speaker - Dolby Atmos | Wi-Fi | Graphite Gray",
			"5.Price : 29,990 \nApple 2021 10.2-inch (25.91 cm) iPad with A13 Bionic chip (Wi-Fi, 64GB) - Space Grey (9th Generation)",
			//couch
			"1.Price : 8,999\n Sheesham Wood Single Seater Sofa for Living Room Home Wooden Lounge Wing Chair Furniture (Brown)",
			"2.Price : 22,698\n Solimo Atingle 2 Seater Solid Sheesham Wood Sofa with Cushion (Natural Finish)",
			"3.Price : 9,999\n Wooden Couch | Wooden Sofa Set | Sofa Couch With Side Magzine Newspaper Holder for Office & Lounge | Two Seater Sofa Set | Cream Cushion, Rosewood Density 1.5 Inch, Honey Finish",
			"4.Price : 8,999 \nWooden Sofa Set for Living Room 3 Seater Sofa with 2 Drawer (ST-548P-745U)",
			"5.Price : 19,999\nWooden 3 Seater Sofa for Living Room | Sofa with Attached End Table with Shelf & 2 Drawers | Three Seater Sofa | Sheesham Wood, Honey Brown Finish",
			//table
			"1.Price : 19,999 \nKosmo Sheesham Wooden Study Table & Desk with Drawer Storage for Office and Home | Computer Laptop Table | Reading & Writing Table | Laptop Desk | Desktop Table | Gaming Desktop Table (Teak)",
			"2.Price : 18,880 \nSolid Wood Study Desk Table for Adults | Writing Laptop Computer Table with 3 Drawers Movable Storage for Home and Office | Brown Finish",
			"3.Price : 5,669 \n Computer Desk with Hutch, 47 Inches Home Office Desk with Space Saving Design with Bookshelf for Small Spaces(Engineered Wood,Walnut)",
			"4.Price : 2,890 \nOffice Table 47 Inch Engineered Wood Finish Computer Desk Study Writing Table for Home Office, Modern Simple Style PC Desk, Black Metal Frame Laptop White Table",
			"5.Price : 16,550 \n",
			//bed
			"1.Price : 8,999\nSheesham Wood Single Seater Sofa for Living Room Home Wooden Lounge Wing Chair Furniture (Brown)",
			"2.Price : 19,999 \nAmazon-Solimo Wood Double Seater Sofa for Living Room Home Wooden Lounge Wing Chair Furniture (Wood)",
			"3.Price : 15,499 \n IKEA four Seater Sofa for Living Room Home Wooden Lounge Wing Chair Furniture (White/ Blue)",
			"4.Price : 16,999 \nPepperfy Single Seater Sofa for Living Room Home Wooden Lounge Wing Chair Furniture (Black)",
			"5.Price : 29,990 \nIKEA Living room Set 2 seater couch and 2 chairs",
			//top
			"1.Price : 2,990\nOversized Printed T-Shirt|Blue|S",
			"2.Price : 1,999 \nCropped Top|Pink|XS",
			"3.Price :  599\n Sweatshirt|Black|L",
			"4.Price : 1,500 \nTie Dye|Pink/Blue|M",
			"5.Price : 999 \nT-Shirt|Green|M",
			//dress
			"1.Price : 4,999\nSummer Dress|Blue/Grey|M",
			"2.Price : 300\nT-Shirt Dress|Brown|S",
			"3.Price : 999 \nFloral Dress|XS",
			"4.Price : 3,550 \nMaxi Dress|White/Yellow|S",
			"5.Price : 2990 \nBodycon Dress|Red|S",
			//trouser
			"1.Price : 2,990\nHigh Waist Blue Denim Jeans|S",
			"2.Price : 1,599 \nMid rise Black Denim Jeans|M",
			"3.Price : 2,990 \nRipped Jeans|Blue|XS",
			"4.Price : 1,999 \nWhite Cottom Joggers|M",
			"5.Price : 3,900 \nTwill Wide Legged Trouser|Blue|L",
			//paint
			"1.Price : 200\nFaber Castle Water Colour Paint",
			"2.Price : 500 \nFevycril Oil Paints",
			"3.Price : 599 \nPastel colours",
			"4.Price : 600 \nAcrylic Paints set of 6",
			"5.Price : 900 \nGouache Paint",
			// paper
			"1.Price : 300 \nWater Colour A4 size paper",
			"2.Price : 400 \nOil Painting Paper",
			"3.Price : 300 \nHandcrafted Paper A6",
			"4.Price : 250 \nColoured Craft Paper",
			"5.Price : 500 \nCanvas Pads A3 size",
			//pencil
			"1.Price : 150\nPack of 6 Sketching Pencils HB- 6B",
			"2.Price : 200\n Pack of 12 Writing Pencils ",
			"3.Price : 350\n Set of 4 Charcoal Pencils-soft, medium,hard,dark",
			"4.Price : 200\n Set of 24 Colour Pencils",
			"5.Price : 200\nPack of 6 Sketching Pencils HB- 6B",
			//Toothbrush
			"1.Price : 50\nPack of 3 toothbrush - Soft",
			"2.Price : 80\nPack of 4 toothbrush - Medium",
			"3.Price : 100\nPack of 6 toothbrush - Hard",
			"4.Price : 200\n Electric Toothbrush",
			"5.Price : 70\nPack of 4 zig zag toothbrush - Medium",
			//paste
			"1.Price : 60\nMint fresh 50g",
			"2.Price : 80\nCharcoal Clean 50g",
			"3.Price : 50\nGel toothpaste 40g",
			"4.Price : 90\nComplete Care 80g ",
			"5.Price : 95\nSensitivity relief 60g",
			//facewash
			"1.Price : 200\nHydrating gentle cleanser 50ml",
			"2.Price : 250\nGentle Facewash dry to normal skin 50ml",
			"3.Price : 500\nExfoliating facewash 50ml",
			"4.Price : 300\nSuitable to all Skin types clear gel facewash 50ml",
			"5.Price : 2,500\n Oil based cleanser for all skin types 100ml",
			};
	void display1(int f1)
	{	
		System.out.println(desc[f1]);
		System.out.println("Do you want to purchase this item?(yes/no) ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		if(s1.contentEquals("yes"))
		{
			System.out.println("Item Purchased");
		}
		}
	}







public class Ecommerce {
	public static void main(String[] args) {
		Category c=new Category();
		c.disp();
		System.out.println("Enter your choice: ");
		Scanner sc=new Scanner(System.in);
		int c1 =sc.nextInt();
		Subcategory s=new Subcategory();
		s.display(c1);
		System.out.println("Enter your choice: ");
		int c2 =sc.nextInt();
		Products p =new Products();
		int f = (c1-1)*15+(c2-1)*5;
		p.display(f);
		System.out.println("Enter your choice: ");
		Description d = new Description();
		int c3 = sc.nextInt();
		int f1 = (c1-1)*15+(c2-1)*5+c3-1;
		d.display1(f1);
		System.out.println("Enter 'exit' to leave the Application or Enter 'menu' to return to the main menu");
		String str=sc.next();
		if(str.contentEquals("exit"))
		{
			System.out.println("Exited");
			//System.exit(0);
		}
		else if(str.contentEquals("menu"))
		{		
			Ecommerce.main(args);
		}

	}
}













