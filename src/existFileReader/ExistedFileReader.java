/*Description : File Containing Words and their possible meanings
 * Created By : Varalakshmi.Pareedu
 * Created On : 11/28/2022*/

package existFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExistedFileReader {

	public static void main(String[] args) {

		//path contains the file that we are going to search for
				String path = System.getProperty("user.dir")+"\\src\\existFileReader\\dictionary.txt";
				
				File f=null; // dictionary.txt
				                            
			//  character input stream
				FileReader fr=null; 
				BufferedReader br=null; // reads text from character input stream 
				
				HashMap<String,List<String>> dict = new HashMap<String,List<String>>();
				try
				{
					//Check if the file exists in the given path. If the file does not exist then catch the exception.
					f = new File(path); 
					if(f.exists())
					{
						System.out.println("File exists...");
						fr = new FileReader(f);
						br = new BufferedReader(fr);
						String line = br.readLine();
						while(line!=null)
						{
							String key=(line.split("-"))[0]; //Apple - fruit,a tech firm => Apple
							System.out.println("Key:"+key);
							String[] val=(line.split("-")[1]).split(",");
							
							List<String> meanings = new ArrayList<String>();
							for(int i=0;i<val.length;i++)
							{
								meanings.add(0, val[i]);
								System.out.println("Value:" +val[i]);
							}
							dict.put(key,meanings);						   
							line=br.readLine(); 
						}
						br.close();
						System.out.println("Dictionary Map:"+dict);
					
						//Looping map
						System.out.println(" The required format:");
						for(Map.Entry<String,List<String>> m: dict.entrySet())
						{
						   System.out.println("Word:"+m.getKey());
							for(int i=0;i<m.getValue().size();i++)
							{
								System.out.println("Meaning:"+m.getValue().get(i));
							}
						}
					}
					
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				finally
				{
					try {
						br.close();
						fr.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					
					
				}

			}


	}


