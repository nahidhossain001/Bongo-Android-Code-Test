package com.mycompany.anagram;

import com.mycompany.anagram.anagram;
import com.mycompany.anagram.anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author NaHiD
 */
public class IFAnagramTest {

   //@test
    public void test(){
    char[] str1={'e','a','t'};
    char[] str2={'a','t','e'};
  anagram test=new anagram();
    boolean output=anagram.ifAnagram(str1,str2);
    assertEquals(true,output);
    
    }
}
