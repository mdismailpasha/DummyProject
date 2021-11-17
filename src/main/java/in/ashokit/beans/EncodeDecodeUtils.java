package in.ashokit.beans;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public  class EncodeDecodeUtils
{ 
   public void main()
{

int i=10;
int z=30;int k=30;
int g=44;
int j=20;

}
public void m2()
{
}

	
       public String encode(String text)
	{
			Encoder encoder = Base64.getEncoder();
			String encodeToString = encoder.encodeToString(text.getBytes());
			return encodeToString;
			
	}
       public String decode(String encodedStr)
       {
    	   Decoder decoder = Base64.getDecoder();
    	   byte[] decode = decoder.decode(encodedStr);
    	   return new String(decode);
       }
	
}
