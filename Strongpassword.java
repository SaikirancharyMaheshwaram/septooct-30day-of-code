import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

   

    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
    int count=0;
    int num=0;
    int smalls=0;
    int caps=0;
    int specialchar=0;
    for(int i=0;i<n;i++){
        int asci=(char)password.charAt(i);
        if(asci>=48 && asci<=57){
            num++;
        }
        else if(asci>=65 && asci<=90){
            caps++;
        }
        else if(asci>=97 && asci<=122 ){
            smalls++;
        }
        else{
            specialchar++;
        }
    }
    if(num==0) count++;
    if(smalls==0) count++;
    if(caps==0) count++;
    if(specialchar==0) count++;
    if(password.length()+count>=6){
        return count;
    }
    else{
        return count+(6-(password.length()+count));
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
