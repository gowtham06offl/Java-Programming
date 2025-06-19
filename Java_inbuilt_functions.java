public class Java_inbuilt_functions {
    public static void main(String[] args) {
        
        String a = "GOWTHAM KUMAR";
        String b = "gowtham kumar";

        System.out.println("A :"+a);
        System.out.println("B :"+b);

        System.out.println("Length of A :"+a.length()); // returns the total length of the string
        System.out.println("Lower case conversion :"+a.toLowerCase()); // converts all the string to uppercase 
        System.out.println("Upper case conversion :"+a.toUpperCase()); // converts all the string to lowercase 
        System.out.println("Hashcode :"+a.hashCode()); // returns hashcode of the string
        System.out.println("Hashcode :"+b.hashCode()); // returns hashcode of the string
        System.out.println("Character Indexing : "+a.charAt(0)); // return the character in the string according to the string given.
        System.out.println("Replace specific word :"+a.replace("GOW", "HARS")); // replace specific target and replace it.
        System.out.println("Replace all :"+a.replaceAll(" ", "-")); // replace all which contains the regex .
        System.out.println("Contains :"+a.contains("GOW")); // return true if the word are in string or else it return false.
        System.out.println("Starts with :"+a.startsWith("GO")); // returns true if the string starts with the target
        System.out.println("Ends With :"+a.endsWith("Ar")); // if there is change in case letters it will return false , only return true when case also same.
        System.out.println("check Equal :" +a.equals(b)); // returns true when 2 strings are same , when case letter changes also it will return false 
        System.out.println("Equals ingnore case :"+a.equalsIgnoreCase(b)); // returns true even case letter changes
        
        char [] c = a.toCharArray(); // converting string to array

        for (int i=0 ; i<a.length() ; i++){
            System.out.print("  "+a.charAt(i)); // we need to use charAt because it is string . if it is array we should use a[i]
        }

        String d = " gowtham ";
        System.out.println("Trim :" +d.trim()); // trims the empty spacing in the front and back.
        
    }
}
