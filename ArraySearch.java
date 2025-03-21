class ArraySearch 
{
int[] array;
public ArraySearch(int[] array)
{
this.array=array;
}
public int searchElement(int target)
{
for(int i=0;i<array.length;i++)
{
if(array[i] == target)
{
return i;
}
}
return -1;
}
public void displayArray()
{
for(int num : array)
{
System.out.println(num + " ");
}
System.out.println();
}
public static void main(String[] args)
{
int[] arr={1,2,3,9,5,6,19};
ArraySearch searchobj= new ArraySearch(arr);
searchobj.displayArray();
int target =9;
int result=searchobj.searchElement(target);
if(result != -1)
{
System.out.println("Element " + target + " found at index " + result);
}
else
{
System.out.println("Element " + target + " not found in the array.");
}
}
}
