import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int flag = 0;
		int count = 0;
		int[] alpha = new int[26];
		
		int n = sc.nextInt();
		String[] word = new String[n];
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			word[i] = sc.nextLine();
			
			for(int j = 1; j < word[i].length(); j++) {
				if(word[i].charAt(j-1) != word[i].charAt(j))
					if(alpha[word[i].charAt(j-1)-97] == 0)
						alpha[word[i].charAt(j-1)-97] = -1;
					else {
						flag = -1;
						break;
					}
			}
			if(alpha[word[i].charAt(word[i].length()-1)-97] == -1)
				flag = -1;
			if(flag == 0)
				count++;
			alpha = new int[26];
			flag = 0;
		}
		System.out.print(count);
	}
}
