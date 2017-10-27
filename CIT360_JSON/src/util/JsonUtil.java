package util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
	
	private static ObjectMapper mapper;
	
	static{
		mapper = new ObjectMapper();
	}
	
	public static String converJavaToJson(Object object){
		String jsonResult = "";
		try {
			jsonResult = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured while converting Java Object into Json -->" + e.getMessage());
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured while converting Java Object into Json -->" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured while converting Java Object into Json -->" + e.getMessage());
		}
		return jsonResult;
	}
	
	public static <T> T convertJsonToJava(String jsonString,Class<T> cls){
		T result = null;
		try {
			result = mapper.readValue(jsonString, cls);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured while converting Json into Java Object -->" + e.getMessage());
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured while converting Json into Java Object -->" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured while converting Json into Java Object -->" + e.getMessage());
		}		
		return result;
		
	}

}
