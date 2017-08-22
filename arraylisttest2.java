package githubjenkinjob;

import java.util.ArrayList;
import java.util.List;

public class arraylisttest2 {

	public static void main(String[] args) {
		
		List<String> st=new ArrayList<String>();
		st.add("sumitha");
		st.add("hemmshika");
		st.add(2, "mehaa");
		st.toArray();
		st.add("babu");
		for(Object aa:st){
					System.out.println(st);
	}
	}
}
