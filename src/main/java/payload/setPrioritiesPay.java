package payload;

public class setPrioritiesPay {
	
	public static String getPayload()
	{
		String b="{\n" + 
				"  \"sprintDay\": 1,\n" + 
				"  \"sprintId\": 1,\n" + 
				"  \"userStoryPriorityList\": [\n" + 
				"    {\n" + 
				"      \"storyId\": 1,\n" + 
				"      \"priorityId\": 1\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"storyId\": 1,\n" + 
				"      \"priorityId\": 1\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"storyId\": 1,\n" + 
				"      \"priorityId\": 1\n" + 
				"    }\n" + 
				"  ]\n" + 
				"}";
		
		return b;
	}

}
