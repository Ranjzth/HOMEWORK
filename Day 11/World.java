import java.util.Scanner;
class World
{
	public static void main(String[] args)
	{
		Scanner bk=new Scanner(System.in);
		System.out.println("THE WORLD OF KNOWLEDGE");
		System.out.println("1. FLCTION");
		System.out.println("2. FANTASY");
		System.out.println("3. BUSINESS");
		System.out.println("4. PSYCHOLOGY");
		System.out.print("Choose your Option : ");
	
		int choice=bk.nextInt();
		
		if(choice==1)
	    {
			System.out.println("WELCOME TO FLCTION");
			System.out.println("1. RISE OF THE FALLEN: The Manwaan Series Book");
			System.out.println("2. Shadows Rising");
			System.out.println("3. Kunex, It Ends with Us");
			System.out.print("Select The Book : ");
	
			int option=bk.nextInt();
			
				if(option==1)
				{
					System.out.println("        RISE OF THE FALLEN: The Manwaan Series Book        ");
					System.out.println("1. Description: A cultural fusion. A modern twist. An ancient battle of good and evil. Amidst an eternalfamily feud, a purposeless and hyper-anxious Rinad discovers that he is part human and part celestial - aManwaan! As he navigates through his strange new reality, he encounters magnificent Angels, along withsavage Asuras and Rakshasas infiltrating Mumbai.");
					System.out.println("Author: Abhishek Krishnan           Language: English           Rate: Rs.300");
				}
					else if(option==2)
				{
					System.out.println("        Shadows Rising        ");
					System.out.println("2. Description: Banished from the celestial court for an unspeakable crime, Akran, once a powerful yaksha, spends his days in the city of Mumbai, drinking cheap rum and pretending to be human.When a young girl is abducted, Akran finds himself reluctantly dragged into the investigation. But, as he soon discovers, this is not a simple case of kidnappingvillainous thugs, gods and demons are all involved. And an ancient evil is returning to the world.");
					System.out.println("Author: Rohan Montero                   Language: English                      Rate: Rs.250.");
				}
				else if(option==3)
				{
					System.out.println("        Kunex, It Ends with Us         ");
					System.out.println("3. Description: The newest, highly anticipated novel from beloved #1 New York Times bestselling author, Colleen Hoover. Sometimes it is the one who loves you who hurts you the most. Lily hasn?t always had it easy, but that's never stopped her from working hard for the life she wants. She?s come a long way from small town in Maine where she grew up? she graduated from college, moved to Boston and started vn business. So when she feels a spark with a gorgeous neurosurgeon named Ryle Kincaid, everythi in Lily?s life suddenly seems almost too good to be true.");
					System.out.println(" Author: Rohan Monteiro             Language: English               Rate: Rs.350.");
				}
				else
				{
					System.out.print("This Book Not Avilable");
				}
		}
		
		
		

		
		if(choice==2)
	    {
			System.out.println("WELCOME TO FANTASY");
			System.out.println("1.Compass and Blade");
			System.out.println("2. Blood Metal Bone");
			System.out.println("3. The Shadows Between us");
			System.out.print("Select The Book : ");
	
			int option=bk.nextInt();
			
				if(option==1)
				{
					System.out.println("        Compass and Blade        ");
					System.out.println("1. Description: Mira is a wrecker, one of the seven chosen to swim out and plunder the wrecked shipsbeyond the Isle of Rosevear. The waves sing to her soul, the call of the sea beckoning her into deeperwaters. But Rosevear needs her, and she could never abandon her home. Until one evening whenlightning splits the sky and the Watch descend, taking Mira’s father away.");
					System.out.println("Author: Rachel Greenlaw           Language: English             Rate: Rs.370");
				}
					else if(option==2)
				{
					System.out.println("        Blood Metal Bone        ");
					System.out.println("2. Description: Wrongly accused of her brother’s murder, Sonara’s destiny was to die, sentenced toexecution by her own mother. Punished and left for dead, the shadows have cursed her with a second lifeas a Shadow-blood, cast out and hunted by society for her demon-like powers.");
					System.out.println("Author: Lindsay Cummings                Language: English                  Rate: Rs.275");
				}
				else if(option==3)
				{
					System.out.println("        The Shadows Between us         ");
					System.out.println("3. Description: No one knows the extent of the freshly crowned Shadow King's power. Some say he cancommand the shadows that swirl around him to do his bidding. Others say they speak to him, whisperingthe thoughts of his enemies. Regardless, Alessandra, tired of being overlooked, has a plan to gain power:woo the Shadow King, marry him, then kill him and take his kingdom for herself.");
					System.out.println("Author: Tricia Leven-seller              Language: English               Rate: Rs.304");
				}
				else
				{
					System.out.print("This Book Not Avilable");
				}
		}
		
		
		
		if(choice==3)
	    {
			System.out.println("WELCOME TO BUSINESS");
			System.out.println("1. The Psychology Of Money");
			System.out.println("2. Do It Today");
			System.out.println("3. Atomic Habits");
			System.out.print("Select The Book : ");
	
			int option=bk.nextInt();
			
				if(option==1)
				{
					System.out.println("        The Psychology Of Money        ");
					System.out.println("1. Description: Timeless lessons on wealth, greed, and happiness doing well with money isn?t necessarily about what you know. It?s about how you behave. And behavior is hard to teach, even to really smart›eople. How to manage money, invest it, and make business decisions are typically considered to involve i lot of mathematical calculations, where data and formulae tell us exactly what to do");
					System.out.println("Author: Morgan Housel                Language: English                Rate: Rs.300");
				}
					else if(option==2)
				{
					System.out.println("        Do It Today        ");
					System.out.println("2. Description: Are you also tired of putting off your dreams until tomorrow? Guess what! Tomorrow never comes. Am I right?I've procrastinated and putt off my desire to write a book for a decade. I always came up with excuses like, it's not the right time. Or, I need to do more research.'But in 2015 I got tired of this endless procrastination, and finally took action. Six months later, my first book was published.Look, we all have limited time on our hands. And we're getting closer to death every single minute. That shouldn't scare. That should motivate you!Time is limited, that's why we must do the things we want: Today.");
					System.out.println("Author: Darius Foroux            Language: English             Rate: Rs.100");
				}
				else if(option==3)
				{
					System.out.println("        Atomic Habits         ");
					System.out.println("3. esrin: espech names ven you sent to change you ay. you ned to think bian But one fronarlooplunding ast of te hords ore cal decisions: doing two push-ups a day, waking up five minute");
					System.out.println("Author: James Clear              Language: English                 Rate: Rs.350");
				}
				else
				{
					System.out.print("This Book Not Avilable");
				}
		}
		
		
		

		if(choice==4)
	    {
			System.out.println("WELCOME TO PSYCHOLOGY");
			System.out.println("1. Dark Psychology Secrets & Manipulation");
			System.out.println("2. The Piero you Subcon Mous Mind Do It Today");
			System.out.println("3. The Courage to Be Disliked");
			System.out.print("Select The Book : ");
	
			int option=bk.nextInt();
			
				if(option==1)
				{
					System.out.println("        Dark Psychology Secrets & Manipulation        ");
					System.out.println("1. Description: In relation to the psychological essence of the various kinds of people who prey on others, dark psychology can be seen as studying the human condition. The truth is that there is the potential for any single human being to victimize other people or other living creatures. Most people prefer to suppress their dark impulses and prevent themselves from acting on any desire they have because of social norms, a human conscience, and other factors.");
					System.out.println("Author: Amy Brown              Language:English                 Rate:Rs.300");
				}
					else if(option==2)
				{
					System.out.println("       The Piero you Subcon Mous Mind Do It Today         ");
					System.out.println("2. Description: This remarkable book by Dr. Joseph Murphy, one of the pioneering voices of affirmative thinking, will unlock for you the truly staggering powers of your subconscious mind. Combining time-honored spiritual wisdom with cutting edge scientific research, Dr. Murphy explains how the subconscious mind influences every single thing that you do and how, by understanding it and learning to control its incredible force, you can improve the quality of your daily life. Everything, from the promotion that you wanted and the raise you think you deserve, to overcoming phobias and bad habits and strengthening interpersonal relationships, the Power of Your Subconscious Mind will open a world of happiness, success, prosperity and peace for you. It will change your life and your world by changing your beliefs.");
					System.out.println("Author: Joseph Murphy                   Language: English                         Rate: Rs.100");
				}
				else if(option==3)
				{
					System.out.println("        The Courage to Be Disliked         ");
					System.out.println("3. Description: The Courage to be Disliked shows you how to unlock the power within yourself to become your best and truest self, change your future and find lasting happiness. Using the theories of Alfred Adler, one of the three giants of 19th century psychology alongside Freud and Jung, the authors explain how we are all free to determine our own future free of the shackles of past experiences, doubts and the expectations of others. It's a philosophy that's profoundly liberating, allowing us to develop the courage t hange, and to ignore the limitations that we and those around us can place on ourselves");
					System.out.println("Author: Ichiro Kishimi and Fumitake Koga               Language: English                      Rate: Rs.350");
				}
				else
				{
					System.out.print("This Book Not Avilable");
				}
		}
		
		
	}
}