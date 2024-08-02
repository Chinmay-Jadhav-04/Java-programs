package array;

	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.LinkedHashSet;
	import java.util.Set;
	import java.util.TreeSet;

	public class SetDemo1 {

		public static void main(String[] args) {
			
			Set<String>s1=new HashSet<String>();
			
			s1.add("Guddu");
			s1.add("Golu");
			s1.add("DaddaTyagi");
			s1.add("SatrugnaTyagi");
			s1.add("SaradSukhla");
			System.out.println(s1);
			

			Set<String>s2=new LinkedHashSet<String>();
			
			s2.add("Guddu");
			s2.add("Golu");
			s2.add("DaddaTyagi");
			s2.add("SatrugnaTyagi");
			s2.add("Sarad                                                                                                                                                                             Sukhla");
			System.out.println(s2);

			Set<String>s3=new TreeSet<String>();
			
			s3.add("Guddu");
			s3.add("Golu");
			s3.add("DaddaTyagi");
			s3.add("SatrugnaTyagi");
			s3.add("SaradSukhla");
			System.out.println(s3);
			
			Iterator<String>itr=s3.iterator();
			while(itr.hasNext()) {
			
				System.out.println(itr.next());
			}
			System.out.println("ForEach Loop");
			
			for(String s:s3) {
				System.out.println(s);
			}

		s3.remove("Guddu");
		System.out.println(s3);
		
		if(s3.contains("Golu")) {
			System.out.println("Jhon string availale");
		}
		else {
			System.out.println("Searching failed");
		}
		Set<String>s4=new TreeSet<String>();
		
		s4.add("Bina");
		s4.add("Kaleen");
		s4.add("Munna");
		s2.addAll(s4);
		System.out.println(s2);
		}
		
}
