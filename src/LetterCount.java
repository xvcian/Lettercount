import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class LetterCount {
        public static void main(String argv[])throws Exception{
            File fileSrc=new File("/home/lulu/hamlet.txt.html");
            BufferedReader fin=new BufferedReader( new FileReader(fileSrc) );
            String line;
            Map<Character, Integer> counter= new HashMap<Character, Integer>();
            while( (line=fin.readLine())!=null){
                int len = line.length();
                for(int i=0; i<len; i++){
                    char c=line.charAt(i);
                    if(!( (c>='0' && c<='9') || (c>='A' && c<='Z') || (c>='a' && c<='z') ) ){
                        continue;
                    }
                    if(counter.containsKey(c)){
                        counter.put(c, counter.get(c)+1);
                    }else{
                        counter.put(c, 1);
                    }
                }
            }
            fin.close();

            for(Iterator<Character> it=counter.keySet().iterator(); it.hasNext(); ){
                char key=it.next();
                int count=counter.get(key);
                System.out.println(key+" "+count);
            }
        }
    }