class Stringmanipulation 
{
public static void main(String[] args) 
{
String str = "Hello, World!";
int length = str.length();
System.out.println("Length of the string: " + length);
String upperCaseStr = str.toUpperCase();
System.out.println("Uppercase string: " + upperCaseStr);
String lowerCaseStr = str.toLowerCase();
System.out.println("Lowercase string: " + lowerCaseStr);
String reversedStr = new StringBuilder(str).reverse().toString();
System.out.println("Reversed string: " + reversedStr);
boolean containsSubstring = str.contains("World");
System.out.println("Contains 'World': " + containsSubstring);
boolean startsWithHello = str.startsWith("Hello");
System.out.println("Starts with 'Hello': " + startsWithHello);
boolean endsWithExclamation = str.endsWith("!");
System.out.println("Ends with '!': " + endsWithExclamation);
String replacedStr = str.replace('o', '0');
System.out.println("Replaced 'o' with '0': " + replacedStr);
}
}

