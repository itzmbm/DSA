import javax.sound.midi.SysexMessage;

public class SearchInString {
   public static void main(String args[])
   {
String name="Manjunath";
char target='u';
System.out.println(search(name,target));
   } 
static boolean search(String str,char target)
{
    if(str.length()==0){
    return false;
    }
    for(int i=0;i<str.length();i++){
        if(target==str.charAt(i)){
            return true;
        }
    }
    // for(char ch:str.toCharArray()){
    //     if(target==ch){
    //         return true;
    //     }
    // }
    return false;
}
}
