import java.util.Scanner; //import scanner for usage

public class StringLab 
{
    public static void main(String[] args) 
    {
        // Task 1: Working with String Methods
        String original = " Welcome to the Java String Lab! ";

        // 1. Print length of the string.
        System.out.println("Length: " + original.length());

        // 2. Print the character at index 7.
        System.out.println("Character at index 7: " + original.charAt(7)); //side note, I don't know if it does index of like arrays where [0] really equals the first, but I tried.

        // 3. Extract and print the word "Java" from the string.
        int javaIndex = original.indexOf("Java");
        if (javaIndex != -1) 
        {
            String Javafound = original.substring(javaIndex, javaIndex + 4);
            System.out.println("Extracted word: " + Javafound);
        } 
        
        // 4. Upper and Lower case Print both versions.
        System.out.println("Uppercase: " + original.toUpperCase());
        System.out.println("Lowercase: " + original.toLowerCase());

        // 5. print index of the first occurrence of "Java".
        System.out.println("Index of \"Java\": " + javaIndex);

        // 6. Check if the string contains the word "Lab" and print the result.
        System.out.println("Contains \"Lab\": " + original.contains("Lab"));

        // 7. Replaces "Java" with "Java Programming" and print the result.
        String replaced = original.replace("Java", "Java Programming");
        System.out.println("After replacement: " + replaced);

        // 8. split(): Split the string by spaces and print each word using a for loop.
        String[] words = original.split(" ");
        System.out.println("Splitting!:");
        for (String word : words) 
        {
            if (!word.isEmpty()) 
            {
                System.out.println(word);
            }
        }

        // 9. Trim any leading or trailing spaces and print the result.
        System.out.println("Trimmed: \"" + original.trim() + "\"");  //idk if this is done right as in no extra spaces or no spaces at all. 

        // 10. equals() and equalsIgnoreCase():
        // Compare "java string lab!" with the original string.
        String compareString = "java string lab!";
        System.out.println("Equals comparison: " + original.equals(compareString));
        System.out.println("EqualsIgnoreCase comparison: " + original.equalsIgnoreCase(compareString));

        // Task 2: Loop Challenges with Strings
        int vowelCount = 0;
        for (int i = 0; i < original.length(); i++) 
        {
            char c = Character.toLowerCase(original.charAt(i));
            // I had to go lookup vowels lol. I forgot.
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
            { 
                vowelCount++;
            }
        }
        System.out.println("Vowel count: " + vowelCount + " . Or atleast I think thats all the vowels.");

         // Palindrome.
        // Using the word "racecar" 
        String palindromeWord = "racecar";
        boolean isPalindrome = true;
        int left = 0;
        int right = palindromeWord.length() - 1;
        while (left < right) 
        {
            if (palindromeWord.charAt(left) != palindromeWord.charAt(right)) 
            {
                isPalindrome = false;
                break;
            }
            left++; //add and subtract to iterate from beginning letter to end letter to middle letter
            right--;
        }
        System.out.println("\"" + palindromeWord + "\" is a palindrome =  " + isPalindrome);

        // Prompt the user until they enter a sentence containing "Java".
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do 
        {
            System.out.println("Please enter a sentence containing the word \"Java\":");
            userInput = scanner.nextLine();
        }while (!userInput.contains("Java"));
        System.out.println("Thank you for finally typing that!");

        // Task 3: Working with StringBuilder
        StringBuilder sb = new StringBuilder("StringBuilder Lab"); //this what you meant by init correctly?

        // Add " - Learning Java"
        sb.append(" - Learning Java");

        // Insert " is fun" after the word "Lab"
        int indexLab = sb.indexOf("Lab");

        if (indexLab != -1) 
        {
            sb.insert(indexLab + "Lab".length(), " is fun");
        }
        // Delete the word "Learning"
        int indexLearning = sb.indexOf("Learning");

        if (indexLearning != -1) 
        {
            sb.delete(indexLearning, indexLearning + "Learning".length());
        }
        System.out.println("StringBuilder after operations: " + sb.toString());
        // Reverse: Reverse the entire string and print it.
        sb.reverse(); // I did not know this method exisited. big W.

        System.out.println("Reversed StringBuilder: " + sb.toString());

        // Task 4: Working with StringBuffer
        StringBuffer sbuf = new StringBuffer("Multithreading Lab"); //this what you meant by init correctly?

        // Append: Add " - Learning Java"
        sbuf.append(" - Learning Java");

        // Insert: Insert " is fun" after the word "Lab"
        int indexLabBuffer = sbuf.indexOf("Lab");

        if (indexLabBuffer != -1) 
        {
            sbuf.insert(indexLabBuffer + "Lab".length(), " is fun");
        }
        // Delete: Delete the word "Learning"
        int indexLearningBuffer = sbuf.indexOf("Learning");

        if (indexLearningBuffer != -1) 
        {
            sbuf.delete(indexLearningBuffer, indexLearningBuffer + "Learning".length());
        }
        System.out.println("StringBuffer after operations: " + sbuf.toString());

        // Reverse: Reverse the entire string and print it.
        sbuf.reverse();
        System.out.println("Reversed StringBuffer: " + sbuf.toString());

        scanner.close();
    }
}

/*SIDE NOTES I REALLY WOULD LIKE YOU TO ANSWER (PRETTY PLEASE)?
1. Are we allowed to "vibe" code?
2. Are we alloed to utilize Github Co-Pilot? Cause I copy my finished code from Visual Studio to Codespaces. (I do this b/c I know more cmd command lines than linux (kinda sad)) 

other side questions. 
3. What is our purpose (jk not that deep).
4. Why does your rubric after grading the labs look so pretty. Did you automate it? Cause it looks good. */
