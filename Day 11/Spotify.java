import java.util.Scanner;
class Spotify
{
	public static void main(String[] args)
	{
		Scanner bk=new Scanner(System.in);
		System.out.println("WELCOME TO SPOTIFY");
		System.out.println("1. A.R.RAHMAN");
		System.out.println("2. ANIRUDH");
		System.out.println("3. HARISH JEYARAJ");
		System.out.println("4. ILLAIYARAJA");
		System.out.println("5. U1");
		System.out.print("choose your song : ");
	
		int choice=bk.nextInt();
		
		if(choice==1)
	    {
			System.out.println("WELCOME TO A.R.RAMAN SONG");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Motivational Song");
			System.out.println("4. Sad");
			System.out.print("choose your option : ");
	
			int option=bk.nextInt();
			
				if(option==1)
				{
					System.out.println("         Melody      ");
					System.out.println("1. Netru Illadha Matram");
					System.out.println("2. Enna Solla Pogirai");
					System.out.println("3. Ennaval Adi Ennavale");
					System.out.println("4. Malargale Malargale");
				}
					else if(option==2)
				{
					System.out.println("         Kuthu      ");
					System.out.println("1. Thaiya thaiya");
					System.out.println("2. Mukkala Mukkabala");
					System.out.println("3. Urvashi Urvashi");
					System.out.println("4. Aathichudi");
				}
				else if(option==3)
				{
					System.out.println("   Motiveational Song   ");
					System.out.println("1. Vande Mataram");
					System.out.println("2. Oruvan Oruvan Mudalli");
					System.out.println("3. Sakthi Kodu");
					System.out.println("4. Kappal yeari Poyachi");
				}
				else if(option==4)
				{
					System.out.println("         Sad      ");
					System.out.println("1. Poongatrile");
					System.out.println("2. Marudaani");
					System.out.println("3. Minnalea En Vazvin");
					System.out.println("4. Rasati");
				}
				else
				{
					System.out.print("This Song Not Avilable");
				}
		}
		
		if(choice==2)
	    {
			System.out.println("WELCOME TO ANIRUDH SONG");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Motivational Song");
			System.out.println("4. Sad");
			System.out.print("choose your option : ");
	
			int option=bk.nextInt();
			
				if(option==1)
				{
					System.out.println("         Melody      ");
					System.out.println("1. Neeyum Nanum Anbe");
					System.out.println("2. Velica Poove");
					System.out.println("3. Po IndraaNeeyaga");
					System.out.println("4. Nee Paratha Vizigal");
				}
					else if(option==2)
				{
					System.out.println("         Kuthu      ");
					System.out.println("1. Vaathi Raid");
					System.out.println("2. Naa Ready");
					System.out.println("3. Badass");
					System.out.println("4. Vandha Edam");
				}
				else if(option==3)
				{
					System.out.println("   Motiveational Song   ");
					System.out.println("1. Velai Illa Pattathari");
					System.out.println("2. Boomi Enna Suthudha");
					System.out.println("3. Ethir Neechal");
					System.out.println("4. Surviva");
				}
				else if(option==4)
				{
					System.out.println("         Sad      ");
					System.out.println("1. Porkanda Singam");
					System.out.println("2. Kanave Kanave");
					System.out.println("3. Kannaana kanne");
					System.out.println("4. Jodi Nilave");
				}
				else
				{
					System.out.print("This Song Not Avilable");
				}
		}
		
		if(choice==3)
	    {
			System.out.println("WELCOME TO Harish Jeyaraj SONG");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Sad");
			System.out.print("choose your option : ");
	
			int option=bk.nextInt();
			
				if(option==1)
				{
					System.out.println("         Melody      ");
					System.out.println("1. Unnale");
					System.out.println("2. Annul Maele");
					System.out.println("3. yedho Ondru");
					System.out.println("4. Paartha Mudhal");
					System.out.println("5. Vaseegara");
				}
					else if(option==2)
				{
					System.out.println("         Kuthu      ");
					System.out.println("1. Tirunelveli halwa da");
					System.out.println("2. aradi katra");
					System.out.println("3. soda bottle");
					System.out.println("4. aruva meesai");
				}
				else if(option==3)
				{
					System.out.println("         Sad      ");
					System.out.println("1. venmathiya");
					System.out.println("2. o maname");
					System.out.println("3. yamma yamma");
					System.out.println("4. othayile");
				}
				else
				{
					System.out.print("This Song Not Avilable");
				}
		}
		
		
		if(choice==4)
	    {
			System.out.println("WELCOME TO Illaiyaraja SONG");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Sad");
			System.out.print("choose your option : ");
	
			int option=bk.nextInt();
			
				if(option==1)
				{
					System.out.println("         Melody      ");
					System.out.println("1. ori kili uruguta");
					System.out.println("2. kuzhalooghum kannanukku");
					System.out.println("3. ennei thottu");
					System.out.println("4. raja raja cholan");
				}
					else if(option==2)
				{
					System.out.println("         Kuthu      ");
					System.out.println("1. ooruvittu ooruvanthu");
					System.out.println("2. nooru varusha");
					System.out.println("3. aasai nooruvagai");
					System.out.println("4. aasai athigam vacu");
				}
				else if(option==3)
				{
					System.out.println("         Sad      ");
					System.out.println("1. kanne kalaimane");
					System.out.println("2. thene thenpaandi neeye");
					System.out.println("3. paadi parantha killi");
					System.out.println("4. nilave vaa");
				}
				else
				{
					System.out.print("This Song Not Avilable");
				}
		}
		
		
		if(choice==5)
	    {
			System.out.println("WELCOME TO U1 SONG");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Motivational Song");
			System.out.println("4. Sad");
			System.out.print("choose your option : ");
	
			int option=bk.nextInt();
			
				if(option==1)
				{
					System.out.println("         Melody      ");
					System.out.println("1. aathdi manasudhan");
					System.out.println("2. chinna sirisu");
					System.out.println("3. venmeggam");
					System.out.println("4. layyayyo");
				}
					else if(option==2)
				{
					System.out.println("         Kuthu      ");
					System.out.println("1. Machi open the bottle");
					System.out.println("2. saroj saman ");
					System.out.println("3. ni money ");
					System.out.println("4. villaiyadu mankatha");
				}
				else if(option==3)
				{
					System.out.println("   Motiveational Song    ");
					System.out.println("1. edhirthu nill");
					System.out.println("2. oru nalil");
					System.out.println("3. nimirnthu nil");
					System.out.println("4. ungakkule mirugam");
				}
				else if(option==4)
				{
					System.out.println("         Sad      ");
					System.out.println("1. kadhal valarthen");
					System.out.println("2. yedho ondru ennai");
					System.out.println("3. pogathe ");
					System.out.println("4. ninaithu ninaithu");
				}
				else
				{
					System.out.print("This Song Not Avilable");
				}
		}
		
		
		
		
		
		
		
	}
}
