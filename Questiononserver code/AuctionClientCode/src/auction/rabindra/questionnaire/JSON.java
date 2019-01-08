package auction.rabindra.questionnaire;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSON {
	   public void writeJson(int[] answerFrequency,String q1, int count) throws Exception {  
	        JSONObject object = new JSONObject();
	        JSONArray array = new JSONArray();
	        array.add(answerFrequency[0]);
	        array.add(answerFrequency[1]);
	        object.put(q1, array);
	        File f = new File("Question"+count+".json");
	        if (f.exists()) {
	        	Files.write(Paths.get("Question"+count+".json"), object.toJSONString().getBytes(), StandardOpenOption.APPEND);
	        }
	        Files.write(Paths.get("Question"+count+".json"), object.toJSONString().getBytes());
	    }
	    
	    public JSONArray readJsonFileForQuestion1(String q1,int count){
	        JSONParser pars = new JSONParser();
	        try {
	 
	            Object obj = pars.parse(new FileReader("Question" + count + ".json"));
	            JSONObject Object = (JSONObject) obj;
	            JSONArray answerFrequency = (JSONArray) Object.get(q1);
	            return answerFrequency;

//	            Iterator<String> iterator = answerFrequency.iterator();
//	            while (iterator.hasNext()) {
//	                System.out.println(iterator.next().toString());
//	            }
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }


}
