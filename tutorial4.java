import java.awt.Font;
import java.util.Arrays;
import java.util.LinkedHashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class tutorial4 {

	public static void main(String[] args) {
		
		/*Initialise variables and text and jframe ofc
		 *Loop through and count words repetition
		 *For each new word add to array. - 2 arrays one for count one for index or a 2d array? 
		 *Then do font size according to count
		 *
		 *hello 2 hello 3 hello 4
		 *
		 *
		 *Output in a JFrame w Label 
		 * 
		 * 
		 */
		//String text = "The IPCC's measured assessment shows that the world needs to face up to the challenge of climate change, and to do so now. It is clear that climate change poses an urgent challenge, not only a challenge that threatens the environment but also international peace and security, prosperity and development. And as the Stern report showed, the economic effects of climate change on this scale cannot be ignored, but the costs can be limited if we act early. That is why when the world gathers in Bali in a few weeks time at the UN climate conference, it is vital that we launch negotiations on a comprehensive global agreement on tackling climate change. Britain will go into these talks with an ambitious agenda, building on the example we have set through the climate change bill as the first country to set a legally binding framework to cut carbon emissions. Our approach at Bali will be based on four key principles: The first is that a post-2012 agreement must meet the scale of the challenge, with global emissions peaking no later than 10-15 years time and reduced by at least 50 per cent by 2050 compared to 1990 levels. Second, it must be effective.  This means a binding regime, agreed by mutual consent, and the creation of a global carbon market to provide an economic incentive for low carbon investment. The third principle is fairness. Developed countries have historic responsibility for causing climate change, and have the greatest capacity for reducing emissions. So we must show leadership and take the first and largest responsibility. That is why I am asking the UK's independent climate change committee to report on whether our target of a 60 per cent reduction in emissions by 2050, already greater than most other countries, should be even stronger still. I will be setting out in the next few days some of the further action we will be taking in Britain to reduce carbon emissions, and climate change will be one of the key issues discussed at next week's meeting of Commonwealth leaders. Fourth, any new agreement must be comprehensive, addressing emissions from land use and deforestation as well as just energy, and addressing the urgent need to help developing countries adapt to the climate change which is now already damaging their development. Securing agreement based on these principles in the next two years will be an immense task for the international community. But we believe it is possible.";

		String text = "The IPCC's measured assessment shows that the world needs to face up to the challenge of climate change, and to do so now. It is clear that climate change poses an urgent challenge, not only a challenge that threatens the environment but also international peace and security, prosperity and development. And as the Stern report showed, the economic effects of climate change on this scale cannot be ignored, but the costs can be limited if we act early. That is why when the world gathers in Bali in a few weeks time at the UN climate conference, it is vital that we launch negotiations on a comprehensive global agreement on tackling climate change. Britain will go into these talks with an ambitious agenda, building on the example we have set through the climate change bill as the first country to set a legally binding framework to cut carbon emissions. Our approach at Bali will be based on four key principles: The first is that a post-2012 agreement must meet the scale of the challenge, with global emissions peaking no later than 10-15 years time and reduced by at least 50 per cent by 2050 compared to 1990 levels. Second, it must be effective.  This means a binding regime, agreed by mutual consent, and the creation of a global carbon market to provide an economic incentive for low carbon investment. The third principle is fairness. Developed countries have historic responsibility for causing climate change, and have the greatest capacity for reducing emissions. So we must show leadership and take the first and largest responsibility. That is why I am asking the UK's independent climate change committee to report on whether our target of a 60 per cent reduction in emissions by 2050, already greater than most other countries, should be even stronger still. I will be setting out in the next few days some of the further action we will be taking in Britain to reduce carbon emissions, and climate change will be one of the key issues discussed at next week's meeting of Commonwealth leaders. Fourth, any new agreement must be comprehensive, addressing emissions from land use and deforestation as well as just energy, and addressing the urgent need to help developing countries adapt to the climate change which is now already damaging their development. Securing agreement based on these principles in the next two years will be an immense task for the international community. But we believe it is possible.";
		text = text.toLowerCase();
		String[] wordCloud = text.split(" ");
		String[] repeatedWords = {};
		int[] wordCounter = {};
		LinkedHashMap<String,Integer> lengths = new LinkedHashMap<String,Integer>();

		
		for (int i = 0; i<wordCloud.length; i++) {
			for(int j = 1; j<wordCloud.length; j++) {
				
				
				if (wordCloud[i].equalsIgnoreCase(wordCloud[j]) && contains(repeatedWords, wordCloud[i].toLowerCase())== false) {
					wordCounter = arrayAddInt(wordCounter,wordCounter.length, 1);
					repeatedWords = arrayAddString(repeatedWords,wordCloud[i]);
					
				}
				else if (wordCloud[i].equalsIgnoreCase(wordCloud[j]) && contains(repeatedWords, wordCloud[i].toLowerCase())== true) {
					wordCounter[i]++;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(repeatedWords));
		JFrame frame = new JFrame("wordcloud");
		JLabel[] label = new JLabel[wordCounter.length];
		JPanel panel = new JPanel();
		
		int maxFont=100;
		int minFont=10;
		
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int labelSize;
		
		for(int i = 0; i<wordCounter.length; i++) {

			if (wordCounter[i]>5 && wordCounter[i]<90 ) {
				labelSize = wordCounter[i];
				label[i] = new JLabel(repeatedWords[i]);
				label[i].setFont(new Font("Roberto", Font.PLAIN, labelSize));
				frame.add(label[i]);
	            panel.add(label[i]);
			}
			else if (wordCounter[i]>90) {
				labelSize = maxFont;
				label[i] = new JLabel(repeatedWords[i]);
				label[i].setFont(new Font("Roberto", Font.PLAIN, labelSize));
				frame.add(label[i]);
	            panel.add(label[i]);
			}
		}
		frame.add(panel);
		frame.setVisible(true);

	}
	
	private static boolean contains(String[] repeatedWords, String string) {
		boolean contains = false;
		for(int i = 0; i <repeatedWords.length;i++) {
			if(repeatedWords[i]==string) {
				contains = true;
			}
		}
		return contains;
	}
		

	private static String[] arrayAddString(String[] repeatedWords, String string) {
		String[] newarr = new String[repeatedWords.length + 1];
							
		for (String j : repeatedWords) {
			int i = 0;
	        newarr[i] = j;
	        i++;
		}
	       newarr[repeatedWords.length] = string; //x is the element to be added 
	       
	   return newarr;
	}

	private static int[] arrayAddInt(int[] wordCounter,int n, int x) {
	
		   
	       // create a new array of size n+1
	       int newarr[] = new int[n + 1];

	       for (int j = 0; j< n; j++)
	           newarr[j] = wordCounter[j];
	   
	       newarr[n] = x; //x is the element to be added 
	       
	   return newarr;
	}

}
