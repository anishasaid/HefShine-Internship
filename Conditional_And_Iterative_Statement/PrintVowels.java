// Wrinte a program to print the given character is a vowel  or consonent

class PrintVowels{
    
    public static void main(String [] args){
        char ch  = 'a';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println( ch +" is a Vowel");
        }else{
            System.out.println(ch +" is consonent ");
        }
    }
}